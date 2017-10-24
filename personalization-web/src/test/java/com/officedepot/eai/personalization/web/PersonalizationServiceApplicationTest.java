/*
 * Copyright 2005-2016 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.officedepot.eai.personalization.web;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.camel.CamelContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.officedepot.eai.data.ODDataSource;
import com.officedepot.eai.personalization.productaffinity.ProductAffinityService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes= {PersonalizationServiceApplication.class,ProductAffinityService.class,ODDataSource.class})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class PersonalizationServiceApplicationTest {

	private Log log = LogFactory.getLog(PersonalizationServiceApplicationTest.class);
	
    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private CamelContext camelContext;
 
    @Test
    public void personalizationServiceTest() throws Exception {
    
    	
    ResponseEntity<String> personalizationResponse = restTemplate.postForEntity("http://localhost:8080/eaiapi/personalization/getPersonalizationRequest", String.class, String.class);
    
    File sampleResponseFile = new File("./src/test/resources/sample/personalizationResponse.json"); 
    
    StringBuffer sampleResponse = new StringBuffer(); 
    try {
    	BufferedReader reader = Files.newBufferedReader(Paths.get(sampleResponseFile.getCanonicalPath()));
    	while (reader.readLine() != null) {
    		sampleResponse.append(reader.readLine());
       	}
    }catch(Exception e) {
    	throw e; 
    }
    String response = personalizationResponse.getBody(); 
    
    assertEquals(response.toString(),sampleResponse);

    }
}