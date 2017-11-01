package com.officedepot.eai.personalization.productaffinity.service;

import java.sql.SQLException;
import java.util.Map;

import javax.xml.bind.JAXBContext;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.stereotype.Component;

import com.officedepot.eai.personalization.affinity.service.entities.ProductAffinityServiceRequestEntity;
import com.officedepot.eai.personalization.productaffinity.service.util.AffinityResponseProcessor;

@Component("productAffinityService")
public class ProductAffinityService extends RouteBuilder{
	
	private final String requestString="U0000450750S0000002598C0000000172D0000000014UJ729YPWQJ6S0000000000C0000000000D0000000000U0000128892S0000000075C0000000615D0000000011U0000678982S0000002826C0000000792D0000000005U0000110392S0000001969C0000000470D0000000085"; 
	
	@Override
	public void configure() throws Exception {
		
		/**
		 * @author Michael-Costello
		 * Create jaxb context for marshalling against namespace of xml fragment 
		 */
		JAXBContext jaxbContext = JAXBContext.newInstance(ProductAffinityServiceRequestEntity.class);
		DataFormat productAffinityDF = new JaxbDataFormat(jaxbContext);
		
		/**
		 * @author Michael-Costello
		 * FIXME this needs to be flushed out 
		 *
		 *onException(SQLException).transform("the default response");
		 */
		onException(Exception.class).handled(Boolean.TRUE).transform(simple("coming"));
		
		from("direct:productAffinityService")
		.routeDescription("Product Affinity Service")
		.routeId("ProductAffinityServiceRoute").setHeader("service",simple("productAffinityService"))
		.log(LoggingLevel.INFO,"*** UNMARSHAL ${body} ***").id("LOG_PAYLOAD")
		/**
		 * @author Michael-Costello
		 * unmarshall payload to ProductAffinityDBRequestEntity for use later in the route 
		 */
		.unmarshal(productAffinityDF).id("UNMARSHALL_PRD_AFF")
		.setHeader("requestString", simple(requestString))
		.setHeader("transHeader", simple("${body.transactionHeader}"))
		/**
		 * @author Michael-Costello
		 * use body ProductAffinityDBRequestEntity methods for stored procedure call 
		 * FIXME mcostell need clarification on how to map productaffinityrequest product basket items to request strings.
		 */
		.to("sql-stored:GETAFFPRD(VARCHAR ${body.productAffinityRequest.getCustomerLifeCycleGroup},VARCHAR ${body.productAffinityRequest.getCustomerTypeGroup},VARCHAR ${body.productAffinityRequest.getScoreType},VARCHAR ${headers.requestString},"
				+ "OUT VARCHAR result)?dataSource=#dataSource").id("GETAFFPRD_SP")
		.log(LoggingLevel.INFO,"*** GETAFFPRD returned ${body} ***").id("LOG_GETAFFPRD_RESULT")
		.convertBodyTo(Map.class).id("CNVRT_BODY_TO_MAP")
		/**
		 * @author Michael-Costello
		 * Send to product affinity response processor as result payload needs to be manipulated and values fetched 
		 */
		.process(new AffinityResponseProcessor()).id("PROD_AF_PROCESSOR")
		.log(LoggingLevel.INFO,"${body}").id("DEBUG_PAYLOAD_LOG") 
		.end().id("ProductAffinityServiceRoute_END");
		
		
	}

}
