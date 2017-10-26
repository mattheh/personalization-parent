package com.officedepot.eai.personalization.productaffinity;

import javax.xml.bind.JAXBContext;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.stereotype.Component;

import com.officedepot.eai.personalization.productaffinity.entities.ProductAffinityRequestEntity;

@Component("productAffinityService")
public class ProductAffinityService extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		/**
		 * @author Michael-Costello
		 * Create jaxb context for marshalling against namespace of xml fragment 
		 */
		JAXBContext jaxbContext = JAXBContext.newInstance(ProductAffinityRequestEntity.class);
		DataFormat productAffinityDF = new JaxbDataFormat(jaxbContext);
		
		/**
		 * @author Michael-Costello
		 * FIXME this needs to be flushed out 
		 *
		 *onException(SQLException).transform("the default response");
		 */
		
		from("direct:productAffinityService")
		.routeDescription("Product Affinity Service")
		.routeId("ProductAffinityServiceRoute")
		.log("*** UNMARSHAL ${body} ***").id("LOG_PAYLOAD")
		/**
		 * @author Michael-Costello
		 * unmarshall payload to ProductAffinityRequestEntity for use later in the route 
		 */
		.unmarshal(productAffinityDF).id("UNMARSHALL_PRD_AFF")
		/**
		 * @author Michael-Costello
		 * use body ProductAffinityRequestEntity methods for stored procedure call 
		 */
		.to("sql-stored:GETAFFPRD(VARCHAR ${body.getiLifeCycleGrp},VARCHAR ${body.getCustomerTypeGrp},VARCHAR ${body.getMktObjectiveScoret},VARCHAR ${body.getRequestString},"
				+ "OUT VARCHAR result)?dataSource=#dataSource").id("GETAFFPRD_SP")
		.log("*** GETAFFPRD returned ${body} ***").id("LOG_GETAFFPRD_RESULT")
		.transform(simple("this should be a copybook xform"))
		//.convertBodyTo(CustomerAffinty.class) //FIXME create customer affinty 
		;
		
		
	}

}
