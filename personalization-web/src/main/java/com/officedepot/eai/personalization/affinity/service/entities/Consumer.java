package com.officedepot.eai.personalization.affinity.service.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="consumer", namespace="http://eai.officedepot.com/schemas/CustomerPersonalizedPromotionService")
public class Consumer {
	
	private String consumerName; 
	private String consumerTransactionID;
	
	@XmlElement(name="consumerName", namespace="http://www.officedepot.com/model/transaction")
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	
	@XmlElement(name="consumerTransactionID", namespace="http://www.officedepot.com/model/transaction")
	public String getConsumerTransactionID() {
		return consumerTransactionID;
	}
	public void setConsumerTransactionID(String consumerTransactionID) {
		this.consumerTransactionID = consumerTransactionID;
	}
	
	
}
