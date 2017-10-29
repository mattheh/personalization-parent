package com.officedepot.eai.personalization.affinity.service.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="transactionHeader", namespace="http://www.officedepot.com/model/transaction")
public class TransactionHeader {
	
	private Consumer consumer;

	@XmlElement(name="consumer", namespace="http://www.officedepot.com/model/transaction")
	public Consumer getConsumer() {
		return consumer;
	}
	
	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	} 
	

}
