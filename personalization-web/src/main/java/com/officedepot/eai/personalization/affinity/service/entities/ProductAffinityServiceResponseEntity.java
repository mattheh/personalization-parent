package com.officedepot.eai.personalization.affinity.service.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="getProductAffinityServiceResponse", namespace="http://eai.officedepot.com/service/AffinityModelService")
public class ProductAffinityServiceResponseEntity {
	
	TransactionHeader transactionHeader; 
	List<AffinityModelResponse> productAffinityResponse;
	
	@XmlElement(name="transactionHeader", namespace="http://www.officedepot.com/model/transaction")
	public TransactionHeader getTransactionHeader() {
		return transactionHeader;
	}
	public void setTransactionHeader(TransactionHeader transactionHeader) {
		this.transactionHeader = transactionHeader;
	}
	
	@XmlElement(name="productAffinityResponse")
	public List<AffinityModelResponse> getProductAffinityResponse() {
		return productAffinityResponse;
	}
	public void setProductAffinityResponse(List<AffinityModelResponse> productAffinityResponse) {
		this.productAffinityResponse = productAffinityResponse;
	} 
	
	
}
