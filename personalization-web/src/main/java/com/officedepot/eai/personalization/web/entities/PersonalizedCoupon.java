package com.officedepot.eai.personalization.web.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="personalizedCoupon")
public class PersonalizedCoupon {
	
	private String promotionCode; 
	private String offerDescription;
	private String couponCode; 
	private String serializedCoupon; 
	private String legalText;
	private Date couponExpirationDate;
	
	
	public String getPromotionCode() {
		return promotionCode;
	}
	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}
	public String getOfferDescription() {
		return offerDescription;
	}
	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getSerializedCoupon() {
		return serializedCoupon;
	}
	public void setSerializedCoupon(String serializedCoupon) {
		this.serializedCoupon = serializedCoupon;
	}
	public String getLegalText() {
		return legalText;
	}
	public void setLegalText(String legalText) {
		this.legalText = legalText;
	}
	
	@JsonProperty("CouponExpirationDate")
	public Date getCouponExpirationDate() {
		return couponExpirationDate;
	}
	public void setCouponExpirationDate(Date couponExpirationDate) {
		this.couponExpirationDate = couponExpirationDate;
	} 
	
	

}
