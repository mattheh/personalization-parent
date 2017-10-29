package com.officedepot.eai.personalization.affinity.service.entities;

import javax.xml.bind.annotation.XmlElement;

public class ProductBasket {
	
	private String productSku; 
	private String productSkuSubClass; 
	private String productSkuClass; 
	private String productSkuDepartment;
	
	@XmlElement(name="productSku")
	public String getProductSku() {
		return productSku;
	}
	public void setProductSku(String productSku) {
		this.productSku = productSku;
	}
	
	@XmlElement(name="productSkuSubClass")
	public String getProductSkuSubClass() {
		return productSkuSubClass;
	}
	public void setProductSkuSubClass(String productSkuSubClass) {
		this.productSkuSubClass = productSkuSubClass;
	}
	
	@XmlElement(name="productSkuClass")
	public String getProductSkuClass() {
		return productSkuClass;
	}
	public void setProductSkuClass(String productSkuClass) {
		this.productSkuClass = productSkuClass;
	}
	
	@XmlElement(name="productSkuDepartment")
	public String getProductSkuDepartment() {
		return productSkuDepartment;
	}
	public void setProductSkuDepartment(String productSkuDepartment) {
		this.productSkuDepartment = productSkuDepartment;
	} 
	
	
}
