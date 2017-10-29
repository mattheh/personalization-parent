package com.officedepot.eai.personalization.affinity.service.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="getProductAffinityRequest", namespace="http://eai.officedepot.com/service/AffinityModelService")
public class ProductAffinityServiceRequestEntity {
	
	private TransactionHeader transactionHeader;
	private ProductAffinityRequest productAffinityRequest;
	
	@XmlElement(name="transactionHeader", namespace="http://www.officedepot.com/model/transaction")
	public TransactionHeader getTransactionHeader() {
		return transactionHeader;
	}
	public void setTransactionHeader(TransactionHeader transactionHeader) {
		this.transactionHeader = transactionHeader;
	}
	
	
	public ProductAffinityRequest getProductAffinityRequest() {
		return productAffinityRequest;
	}
	public void setProductAffinityRequest(ProductAffinityRequest productAffinityRequest) {
		this.productAffinityRequest = productAffinityRequest;
	} 

}
