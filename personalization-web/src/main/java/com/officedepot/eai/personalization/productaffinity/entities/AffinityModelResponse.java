package com.officedepot.eai.personalization.productaffinity.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="affinityModelResponse", namespace="http://eai.officedepot.com/service/AffinityModelService")
public class AffinityModelResponse {

	private String itemCode; 
	private String scoreType; 
	private String itemLevelCode; 
	private String scoreRank; 
	private String itemLevelId; 
	private String sign; 
	private String score;
	
	@XmlElement(name="itemCode")
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	
	@XmlElement(name="scoreType")
	public String getScoreType() {
		return scoreType;
	}
	public void setScoreType(String scoreType) {
		this.scoreType = scoreType;
	}
	
	@XmlElement(name="itemLevelCode")
	public String getItemLevelCode() {
		return itemLevelCode;
	}
	public void setItemLevelCode(String itemLevelCode) {
		this.itemLevelCode = itemLevelCode;
	}
	
	@XmlElement(name="scoreRank")
	public String getScoreRank() {
		return scoreRank;
	}
	public void setScoreRank(String scoreRank) {
		this.scoreRank = scoreRank;
	}
	
	@XmlElement(name="itemLevelId")
	public String getItemLevelId() {
		return itemLevelId;
	}
	public void setItemLevelId(String itemLevelId) {
		this.itemLevelId = itemLevelId;
	}
	
	@XmlElement(name="sign")
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	
	@XmlElement(name="score")
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	} 
	
}
