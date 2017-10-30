package com.officedepot.eai.personalization.web.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="transactionHeader")
public class PersonalizationTransactionHeader {
	
	private String consumerName;
	private String consumerTransactionId; 
	
	@JsonProperty("consumerName")
	public String getConsumerName() {
		return consumerName;
	}
	@JsonProperty("consumerName")
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	@JsonProperty("consumerTransactionID")
	public String getConsumerTransactionId() {
		return consumerTransactionId;
	}
	@JsonProperty("consumerTransactionID")
	public void setConsumerTransactionId(String consumerTransactionId) {
		this.consumerTransactionId = consumerTransactionId;
	}
	
	
	
}
