package com.officedepot.eai.personalization.affinity.service.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="productAffinityRequest", namespace="http://eai.officedepot.com/service/AffinityModelService")
public class ProductAffinityRequest {
	private String customerLifeCycleGroup; 
	private String customerTypeGroup; 
	private String scoreType; 
	private List<MarketBasket> marketBasket;
	
	@XmlElement(name="customerLifeCycleGroup")
	public String getCustomerLifeCycleGroup() {
		return customerLifeCycleGroup;
	}
	public void setCustomerLifeCycleGroup(String customerLifeCycleGroup) {
		this.customerLifeCycleGroup = customerLifeCycleGroup;
	}
	
	@XmlElement(name="customerTypeGroup")
	public String getCustomerTypeGroup() {
		return customerTypeGroup;
	}
	public void setCustomerTypeGroup(String customerTypeGroup) {
		this.customerTypeGroup = customerTypeGroup;
	}
	
	@XmlElement(name="scoreType")
	public String getScoreType() {
		return scoreType;
	}
	public void setScoreType(String scoreType) {
		this.scoreType = scoreType;
	}
	
	@XmlElement(name="marketBasket")
	public List<MarketBasket> getMarketBasket() {
		return marketBasket;
	}
	public void setMarketBasket(List<MarketBasket> marketBasket) {
		this.marketBasket = marketBasket;
	}
}
