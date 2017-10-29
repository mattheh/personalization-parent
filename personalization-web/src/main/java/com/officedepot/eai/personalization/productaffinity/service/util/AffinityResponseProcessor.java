package com.officedepot.eai.personalization.productaffinity.service.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.officedepot.eai.personalization.affinity.service.entities.AffinityModelResponse;
import com.officedepot.eai.personalization.affinity.service.entities.CustomerAffinityServiceResponseEntity;
import com.officedepot.eai.personalization.affinity.service.entities.ProductAffinityServiceResponseEntity;
import com.officedepot.eai.personalization.affinity.service.entities.TransactionHeader;

public class AffinityResponseProcessor implements Processor {
	
	private static final Log log = LogFactory.getLog(AffinityResponseProcessor.class);
	/**
	 * @author Michael-Costello
	 * affinity response constants 
	 * FIXME these should likely go elsewhere 
	 */
	private static final String PRODUCT_AFFINITY_SERVICE = "productAffinityService";
	private static final String CUSTOMER_AFFINITY_SERVICE = "customerAffinityService"; 
	
	@Override
	public void process(Exchange exchange) throws Exception {
		Map<String,String> affSpResult = (Map<String,String>)exchange.getIn().getBody(); 
		
		switch((String)exchange.getIn().getHeader("service")) {
			case PRODUCT_AFFINITY_SERVICE:
				log.debug("**Building ProductAffinityResponse **");
				ProductAffinityServiceResponseEntity prodAffResp = new ProductAffinityServiceResponseEntity(); 
				prodAffResp.setTransactionHeader((TransactionHeader)exchange.getIn().getHeader("transHeader"));
				prodAffResp.setProductAffinityResponse(getModelResponseList(affSpResult.get("result")));
				exchange.getIn().setBody(prodAffResp);
			case CUSTOMER_AFFINITY_SERVICE:
				log.debug("**Building CustomerAffinityResponse");
				CustomerAffinityServiceResponseEntity custAffResp = new CustomerAffinityServiceResponseEntity(); 
				custAffResp.setTransactionHeader((TransactionHeader)exchange.getIn().getHeader("transHeader")); 
				custAffResp.setCustomerAffinityResponse(getModelResponseList(affSpResult.get("dataString"))); 
				exchange.getIn().setBody(custAffResp);
		}
				
	}
	
	/**
	 * @author Michael-Costello
	 * FIXME parameterize these fixed positions 
	 */
	
	private List<AffinityModelResponse> getModelResponseList(String dbItemResp) throws IOException{
		List<AffinityModelResponse> modelItemsList = new ArrayList<AffinityModelResponse>();
		Arrays.stream(dbItemResp.
			split("(?<=\\G.{40})")).limit(23L).forEach(str -> {				
				AffinityModelResponse resp = new AffinityModelResponse(); 
				resp.setItemCode(str.substring(0, 9));
				resp.setScoreType(str.substring(10,11));
				resp.setItemLevelCode(str.substring(11,12));
				resp.setScoreRank(str.substring(12,14));
				modelItemsList.add(resp);
			});
		return modelItemsList; 
	}

}
