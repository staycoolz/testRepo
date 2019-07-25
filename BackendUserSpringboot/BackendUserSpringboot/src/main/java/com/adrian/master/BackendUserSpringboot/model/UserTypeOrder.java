package com.adrian.master.BackendUserSpringboot.model;

public class UserTypeOrder {
	
	long userTypeOrderId;
	long userTypeId;
	int userTypeOrderSeq;
	long lookupId;
	
	public long getUserTypeOrderId() {
		return userTypeOrderId;
	}
	public void setUserTypeOrderId(long userTypeOrderId) {
		this.userTypeOrderId = userTypeOrderId;
	}
	public long getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(long userTypeId) {
		this.userTypeId = userTypeId;
	}
	public int getUserTypeOrderSeq() {
		return userTypeOrderSeq;
	}
	public void setUserTypeOrderSeq(int userTypeOrderSeq) {
		this.userTypeOrderSeq = userTypeOrderSeq;
	}
	public long getLookupId() {
		return lookupId;
	}
	public void setLookupId(long lookupId) {
		this.lookupId = lookupId;
	}
	
	

}
