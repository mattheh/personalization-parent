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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import com.officedepot.eai.personalization.web.entities.PersonalizationTransactionHeader;
import com.officedepot.eai.personalization.web.entities.PersonalizedCoupon;
import com.officedepot.eai.personalization.web.entities.PersonalizedRecomendationsPayloadResponse;
import com.officedepot.eai.personalization.web.entities.PersonalizedRecomendationsResponse;
import com.officedepot.eai.personalization.web.entities.PersonalizedRecommendedOffer;

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
                .contextPath("{{personalization.contextPath}}").apiContextPath("{{personalization.apiContextPath}}")
                    .apiProperty("api.title", "{{personalization.api.title}}")
                    .apiProperty("api.version", "{{personalization.api.version}}")
                    .apiProperty("cors", "true") //FIXME mcostell make this configuratble 
                    .apiContextRouteId("getPersonalizationRequest")
                .bindingMode(RestBindingMode.json)
                .host("{{personalization.host}}").port(("{{personalization.port}}"));

            rest("{{personalization.apiContextPath}}").description("{{personalization.api.title}}")
            	.post()
                    .route().routeId("personalization-recommendation-request")
                    /**
                     * @author Michael-Costello
                     * FIXME this should be invoking back end services 
                     */
                    .process(new PersonalizedRecomendationsResponseProcessor()).id("PERS_REC_RESP_PROC")
                    .log("**Personalized Recommendations Response ${body}")
                    .endRest();
        }
        
        private class PersonalizedRecomendationsResponseProcessor implements Processor{
        
			@Override
			public void process(Exchange exchange) throws Exception {
			
				PersonalizedRecomendationsPayloadResponse response = new PersonalizedRecomendationsPayloadResponse(); 
				PersonalizedRecomendationsResponse payloadResponse = new PersonalizedRecomendationsResponse(); 
				PersonalizationTransactionHeader transactionHeader = new PersonalizationTransactionHeader(); 
				transactionHeader.setConsumerName("testConsumer");
				transactionHeader.setConsumerTransactionId("12345");
				payloadResponse.setTransactionHeader(transactionHeader);
				PersonalizedRecommendedOffer offer = new PersonalizedRecommendedOffer(); 
				PersonalizedCoupon coupon = new PersonalizedCoupon(); 
				coupon.setCouponCode("1212");
				coupon.setCouponExpirationDate(new Date());
				coupon.setLegalText("legalese");
				coupon.setOfferDescription("Description");
				coupon.setPromotionCode("1212");
				coupon.setSerializedCoupon("serial");
				offer.setCoupon(coupon);
				List<PersonalizedRecommendedOffer> offers = new ArrayList<PersonalizedRecommendedOffer>(); 
				offers.add(offer);
				payloadResponse.setPersonalizedReccomendedOffers(offers);
				response.setPayloadResponse(payloadResponse);
	        	exchange.getIn().setBody(response); 
			}
    }

   
}
    }