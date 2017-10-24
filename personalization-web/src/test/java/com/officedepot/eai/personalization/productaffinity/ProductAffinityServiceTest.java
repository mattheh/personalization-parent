package com.officedepot.eai.personalization.productaffinity;


import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@DirtiesContext
@EnableAutoConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest(classes=ProductAffinityService.class, properties= {"spring.datasource.driverClassName=com.ibm.as400.access.AS400JDBCDriver", 
	"spring.datasource.url=jdbc:as400://rndfuture.uschecomrnd.net;naming=system"})
public class ProductAffinityServiceTest extends Assert{
	
	private static Logger log = LoggerFactory.getLogger(ProductAffinityServiceTest.class);
	
	@Autowired
	CamelContext camelContext; 
	
	@Autowired
	@Qualifier("productAffinityService")
	ProducerTemplate producerTemplate; 
	
	@Test
	public void testProductAffinityService() throws Exception{
		producerTemplate.sendBody("direct:productAffinityService", "test");
	}
	
	/*@Configuration	
	static class DataSourceConfig{
		
		@Bean
		public DataSource dataSource() {
			return null; 
		}
	}*/
}
