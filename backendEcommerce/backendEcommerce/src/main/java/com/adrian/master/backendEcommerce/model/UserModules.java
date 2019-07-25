package com.adrian.master.backendEcommerce.model;

import java.util.List;

public class UserModules {
	
	public static long userId;
	public static List<UserModulesDetail> userModuleDetailList;
	
	public static long getUserId() {
		return userId;
	}
	public static void setUserId(long userId) {
		UserModules.userId = userId;
	}
	public static List<UserModulesDetail> getUserModuleDetailList() {
		return userModuleDetailList;
	}
	public static void setUserModuleDetailList(List<UserModulesDetail> userModuleDetailList) {
		UserModules.userModuleDetailList = userModuleDetailList;
	}
	
	

}
