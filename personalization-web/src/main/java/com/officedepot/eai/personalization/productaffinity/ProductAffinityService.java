package com.officedepot.eai.personalization.productaffinity;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component("productAffinityService")
public class ProductAffinityService extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		/**
		 * @author Michael-Costello
		 * FIXME this needs to be flushed out 
		 */
		//onException(SQLException).transform("the default response");
		// TODO Auto-generated method stub
		/**
		 * @author Michael-Costello
		 * TODO mcostell
		 * need to wire up camel-jdbc 
		 */
		from("direct:productAffinityService")
		/**
		 * @author Michael-Costello
		 * TODO mcostell this assumes we have a pojo in the body that supports this stored proc
		 */
		.routeDescription("Product Affinity Service")
		.routeId("productAffinityServiceRoute")
		.to("sql:select-stored:GETAFFPRD(STRING ${body.lifecycleGroup}, STRING ${body.customerTypeGroup}, STRING ${body.marketObjectiveScore}, STRING ${body.requestString}, "
				+ " OUT STRING result?dataSource=#dataSource")
		
		//.to("{{aopsInteraction}}")
		.log("${body}")
		.transform(simple("this should be a copybook xform"))
		//.convertBodyTo(CustomerAffinty.class) //FIXME craete customer affinty 
		;
		
		
	}

}
