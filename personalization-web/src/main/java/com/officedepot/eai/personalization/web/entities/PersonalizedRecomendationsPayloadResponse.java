package com.officedepot.eai.personalization.web.entities;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PersonalizedRecomendationsPayloadResponse {
		
		private PersonalizedRecomendationsResponse payloadResponse;
		
		@JsonProperty("getPersonalizedRecommendationsResponse")
		public PersonalizedRecomendationsResponse getPayloadResponse() {
			return payloadResponse;
		}
		
		@JsonProperty("getPersonalizedRecommendationsResponse")
		public void setPayloadResponse(PersonalizedRecomendationsResponse payloadResponse) {
			this.payloadResponse = payloadResponse;
		} 
		
}
