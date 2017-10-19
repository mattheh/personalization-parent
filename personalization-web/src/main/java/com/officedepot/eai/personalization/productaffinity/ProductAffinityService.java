package com.officedepot.eai.personalization.productaffinity;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
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
		from("jdbc:aopsDS?customerAffinityPS")
		.transform(simple("this should be a copybook xform"))
		//.convertBodyTo(CustomerAffinty.class) //FIXME craete customer affinty 
		;
		
		
	}

}
