package com.officedepot.eai.personalization.customeraffinity.service;

import javax.xml.bind.JAXBContext;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.stereotype.Component;

import com.officedepot.eai.personalization.affinity.service.entities.CustomerAffinityServiceRequestEntity;
import com.officedepot.eai.personalization.productaffinity.service.util.AffinityResponseProcessor;

@Component("customerAffinityService")
public class CustomerAffinityService extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		JAXBContext jaxbContext = JAXBContext.newInstance(CustomerAffinityServiceRequestEntity.class);
		DataFormat customerAffinityDF = new JaxbDataFormat(jaxbContext);
		
		onException(Exception.class).handled(Boolean.TRUE).transform(simple("fixMe")); 
		
		from("direct:customerAffinityService").routeDescription("Customer Affinity Service")
			.routeId("customerAffinityService").setHeader("service",simple("customerAffinityService"))
			.log(LoggingLevel.INFO,"*** UNMARSHAL ${body} ***").id("LOG_PAYLOAD")
			/**
			 * @author Michael-Costello
			 * unmarshall payload to CustomerAffinityDBRequestEntity for use later in the route 
			 */
			.unmarshal(customerAffinityDF).id("UNMARSHALL_CST_AFF")
			.log("***BODY AFTER UNMARSHALL ${body} ***")
			.setHeader("transHeader", simple("${body.tranHeader}")).id("SET_TRANS_HEADER")
			.to("sql-stored:GETAFFCST(VARCHAR ${body.getAgentId},VARCHAR ${body.getMarketingObjective},"
				+ "OUT VARCHAR found,OUT VARCHAR dataString)?dataSource=#dataSource").id("GETAFFCST_SP")
			.log("**SP RESULT IS ${body} **")
			.process(new AffinityResponseProcessor()).id("CUST_AFF_RESP_PRCCSR")
			.log("**CustomerAffinityServiceResponse ${body}")
			.end();
		
		
	}

}
