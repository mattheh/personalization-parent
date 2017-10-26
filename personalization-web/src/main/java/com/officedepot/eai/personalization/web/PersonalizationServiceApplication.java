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

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class PersonalizationServiceApplication {

	
    public static void main(String[] args) {
        SpringApplication.run(PersonalizationServiceApplication.class, args);
    }

    @Bean
    ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean servlet = new ServletRegistrationBean(
            new CamelHttpTransportServlet(), "/eaiapi/personalization/*");
        servlet.setName("PersonalizationServiceServlet");
        return servlet;
    }

    @Component
    class PersonalizationRestApi extends RouteBuilder {
    	
    	private final Log log = LogFactory.getLog(PersonalizationRestApi.class);
        @Override
        public void configure() {
        	
        	/**
        	 * @author Michael-Costello
        	 * FIXME ensure properties get externalized
        	 */
            restConfiguration()
            	.component("{{application.servlet.component}}")
                .contextPath("/eaiapi/personalization").apiContextPath("/getPersonalizationRequest")
                    .apiProperty("api.title", "Personazliation Recommendations Request")
                    .apiProperty("api.version", "0.1")
                    .apiProperty("cors", "true")
                    .apiContextRouteId("getPersonalizationRequest")
                .bindingMode(RestBindingMode.json)
                .host("localhost").port(8080);

            rest("/getPersonalizationRequest").description("Personalization Recommendation Request")
            	.post()
                    .route().routeId("personalization-recommendation-request")
                    //.transform(simple(getStubbedResponse()))
                    .log("${body}")
                    .to("direct:productAffinityService").id("toProductAffinityService")
                    .log("${body}")
                    /**
                     * @author mcostell
                     * FIXME mcostell should be doing something to fetch coupons here 		
                     */
                    /*.to("affinityService")*/
                    .endRest();
        }
        
        private String getStubbedResponse() {
        	File stubbedResponse = new File("./src/main/resources/sample/personalizationResponse.json"); 
        	StringBuffer sampleResponse = new StringBuffer(); 
        	try {
        	    	BufferedReader reader = Files.newBufferedReader(Paths.get(stubbedResponse.getCanonicalPath()));
        	    	while (reader.readLine() != null) {
        	    		sampleResponse.append(reader.readLine());
        	       	}
        	    }catch(Exception e) {
        	    	log.error(e);; 
        	    }
        	return sampleResponse.toString(); 
        }
    }

   
}