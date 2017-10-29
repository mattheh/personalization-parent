package com.officedepot.eai.personalization.affinity.service.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="getCustomerAffinityRequest", namespace="http://eai.officedepot.com/service/AffinityModelService")
public class CustomerAffinityServiceRequestEntity {
	
	private TransactionHeader tranHeader; 
	private String agentId; 
	private String marketingObjective;
	
	
	public TransactionHeader getTranHeader() {
		return tranHeader;
	}
	public void setTranHeader(TransactionHeader tranHeader) {
		this.tranHeader = tranHeader;
	}
	
	@XmlElement(name="agentId")
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	@XmlElement(name="marketingObjective")
	public String getMarketingObjective() {
		return marketingObjective;
	}
	public void setMarketingObjective(String marketingObjective) {
		this.marketingObjective = marketingObjective;
	} 
	
	
	
	

}
