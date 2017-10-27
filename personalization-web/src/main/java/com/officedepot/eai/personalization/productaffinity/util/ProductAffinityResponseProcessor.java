package com.officedepot.eai.personalization.productaffinity.util;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.officedepot.eai.personalization.productaffinity.entities.ProductAffinityServiceResponseEntity;
import com.officedepot.eai.personalization.productaffinity.entities.TransactionHeader;

public class ProductAffinityResponseProcessor implements Processor {
	
	private static final Log log = LogFactory.getLog(ProductAffinityResponseProcessor.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		Map<String,String> prodAffSpResult = (Map<String,String>)exchange.getIn().getBody(); 
		String storedProcResult = prodAffSpResult.get("result");
		log.debug("**Result is " + storedProcResult);
		ProductAffinityServiceResponseEntity prodAffResp = new ProductAffinityServiceResponseEntity(); 
		prodAffResp.setTransactionHeader((TransactionHeader)exchange.getIn().getHeader("transactionHeader"));
		
		
		
	}

}
