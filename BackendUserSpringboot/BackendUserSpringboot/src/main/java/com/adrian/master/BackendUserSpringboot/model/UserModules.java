package com.adrian.master.BackendUserSpringboot.model;

import java.util.List;

public class UserModules {
	
	long userId;
	List<Modules> modules;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public List<Modules> getModules() {
		return modules;
	}
	public void setModules(List<Modules> modules) {
		this.modules = modules;
	}
	
	

}
