package com.officedepot.eai.personalization.caching.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
/**
 * @deprecated
 * @author Michael-Costello
 *
 */
@Component("couchBaseFetchService")
public class CouchbaseFetchRoute extends RouteBuilder{
	
	/**
	 * @author Michael-Costello
	 * refactor constants into external configuration 
	 */
	private final String couchbaseUrl = "https://svcprf.uschecomrnd.net/affprf/eai/";
	private final String cacheName = "eai_services_dev"; 
	private final String cacheKey = "rhtest1234";
	private final String operation = "GET"; //mcostell will always perform a get 
	private final String userName= ""; 
	private final String password = ""; 

	
	@Override
	public void configure() throws Exception {
		from("direct:fetchFromCouchbase")
		.to("couchbase:" + couchbaseUrl + "/" + cacheName + "?" + "operation=" + operation)
		.log("${body}");
		
	}
	
	

}
