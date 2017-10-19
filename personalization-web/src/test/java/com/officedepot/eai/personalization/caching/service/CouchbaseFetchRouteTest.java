package com.officedepot.eai.personalization.caching.service;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.annotation.Resource;

import org.apache.camel.ProducerTemplate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=CouchbaseFetchRouteTest.class)
public class CouchbaseFetchRouteTest {
	
	@Resource(name="couchBaseFetchService")
	ProducerTemplate producerTemplate; 
	
	@Before 
	public void setUp() {
		
	}
	
	
	@Test
	public void testCouchbaseFetchService() throws Exception{
		/**
		 * @author Michael-Costello 
		 * stubbed body to send into couchbase route  
		 */
		File sampleResponseFile = new File("./src/test/resources/sample/personalizationRequest.json"); 
	    
	    StringBuffer sampleResponse = new StringBuffer(); 
	    try {
	    	BufferedReader reader = Files.newBufferedReader(Paths.get(sampleResponseFile.getCanonicalPath()));
	    	while (reader.readLine() != null) {
	    		sampleResponse.append(reader.readLine());
	       	}
	    }catch(Exception e) {
	    	throw e; 
	    }
		producerTemplate.sendBody(sampleResponse.toString());
	}


  
}
