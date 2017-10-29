package com.officedepot.eai.personalization.affinity.service.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="getCustomerAffinityResponse",namespace="http://eai.officedepot.com/service/AffinityModelService")
public class CustomerAffinityServiceResponseEntity {

	private TransactionHeader transactionHeader;
	private List<AffinityModelResponse> customerAffinityResponse;
	
	
	public TransactionHeader getTransactionHeader() {
		return transactionHeader;
	}
	public void setTransactionHeader(TransactionHeader transHeader) {
		this.transactionHeader = transHeader;
	}
	
	@XmlElement(name="customerAffinityResponse")
	public List<AffinityModelResponse> getCustomerAffinityResponse() {
		return customerAffinityResponse;
	}
	public void setCustomerAffinityResponse(List<AffinityModelResponse> customerAffinityResponse) {
		this.customerAffinityResponse = customerAffinityResponse;
	} 
	
}
