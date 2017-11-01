package com.officedepot.eai.personalization.web.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonPropertyOrder({"transactionHeader","personalizedRecommendedOffers"})
public class PersonalizedRecomendationsResponse {
	private PersonalizationTransactionHeader transactionHeader;
	private List<PersonalizedRecommendedOffer> personalizedReccomendedOffers;
	
	@JsonProperty("transactionHeader")
	public PersonalizationTransactionHeader getTransactionHeader() {
		return transactionHeader;
	}
	
	@JsonProperty("transactionHeader")
	public void setTransactionHeader(PersonalizationTransactionHeader transactionHeader) {
		this.transactionHeader = transactionHeader;
	}
	@JsonProperty("personalizedRecommendedOffers")
	public List<PersonalizedRecommendedOffer> getPersonalizedReccomendedOffers() {
		return personalizedReccomendedOffers;
	}
	@JsonProperty("personalizedRecommendedOffers")
	public void setPersonalizedReccomendedOffers(List<PersonalizedRecommendedOffer> personalizedReccomendedOffers) {
		this.personalizedReccomendedOffers = personalizedReccomendedOffers;
	} 
	
}
