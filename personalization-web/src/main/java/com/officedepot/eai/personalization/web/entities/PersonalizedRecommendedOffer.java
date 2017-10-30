package com.officedepot.eai.personalization.web.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="personalizedRecommendedOffer")
public class PersonalizedRecommendedOffer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1133168393756224881L;
	
	private PersonalizedCoupon coupon;

	@JsonProperty("personalizedCoupon")
	public PersonalizedCoupon getCoupon() {
		return coupon;
	}

	public void setCoupon(PersonalizedCoupon coupon) {
		this.coupon = coupon;
	} 
	
}
