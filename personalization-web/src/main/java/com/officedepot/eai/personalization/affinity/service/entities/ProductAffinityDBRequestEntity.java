package com.officedepot.eai.personalization.affinity.service.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="InputParameters",namespace="http://xmlns.oracle.com/pcbpel/adapter/db/sp/ProductAffinityDBAdapter")
public class ProductAffinityDBRequestEntity {
	
	private String iLifeCycleGrp; 
	private String customerTypeGrp; 
	private String mktObjectiveScoret; 
	private String requestString;
	
	@XmlElement(name="I_LIFECYCLE_GRP")
	public String getiLifeCycleGrp() {
		return iLifeCycleGrp;
	}
	public void setiLifeCycleGrp(String iLifeCycleGrp) {
		this.iLifeCycleGrp = iLifeCycleGrp;
	}
	
	@XmlElement(name="I_CUSTOMER_TYPE_GRP")
	public String getCustomerTypeGrp() {
		return customerTypeGrp;
	}
	public void setCustomerTypeGrp(String customerTypeGrp) {
		this.customerTypeGrp = customerTypeGrp;
	}
	
	@XmlElement(name="I_MKT_OBJECTIVE_SCORET")
	public String getMktObjectiveScoret() {
		return mktObjectiveScoret;
	}
	public void setMktObjectiveScoret(String mktObjectiveScoret) {
		this.mktObjectiveScoret = mktObjectiveScoret;
	}
	
	@XmlElement(name="I_REQUEST_STRING")
	public String getRequestString() {
		return requestString;
	}
	public void setRequestString(String requestString) {
		this.requestString = requestString;
	} 
	
}
