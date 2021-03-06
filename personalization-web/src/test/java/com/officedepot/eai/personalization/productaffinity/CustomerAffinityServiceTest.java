package com.officedepot.eai.personalization.productaffinity;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.w3c.dom.Document;

import com.officedepot.eai.config.datasource.ODDataSource;
import com.officedepot.eai.personalization.customeraffinity.service.CustomerAffinityService;

@DirtiesContext
@RunWith(SpringRunner.class)
@SpringBootTest(classes= {CustomerAffinityService.class, ODDataSource.class})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class CustomerAffinityServiceTest extends CamelTestSupport{

	private static Logger log = LoggerFactory.getLogger(CustomerAffinityServiceTest.class);
	
	@Autowired
	CamelContext camelContext; 
	
	@Autowired
	ProducerTemplate producerTemplate; 
	
	protected CamelContext createCamelContext() throws Exception {                                                                                                                         
	    return camelContext;
	}
	
	@Test
	public void testCustomerAffinityService() throws Exception{
		camelContext.getRouteDefinitions().get(0).adviceWith(camelContext, new AdviceWithRouteBuilder() {
		    @Override
		    public void configure() throws Exception {
		        weaveById("GETAFFCST_SP").replace().to("mock:test");
		    }
		});
		
        getMockEndpoint("mock:test").expectedMessageCount(1);
        getMockEndpoint("mock:test").expectedBodiesReceived(camelContext.getTypeConverter().convertTo(String.class, new File("./src/test/resources/sample/customerAffinity/customerAffinityServiceResponseBody.xml")));
		
		File customerAffinityServiceRequest = new File("./src/main/resources/sample/customerAffinity/CustomerAffinity_Request.xml");
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = domFactory.newDocumentBuilder();
		Document custAffinityReqDoc = docBuilder.parse(customerAffinityServiceRequest);
		
		producerTemplate.sendBody("direct:customerAffinityService", custAffinityReqDoc);
		
		assertMockEndpointsSatisfied();
	}
}
