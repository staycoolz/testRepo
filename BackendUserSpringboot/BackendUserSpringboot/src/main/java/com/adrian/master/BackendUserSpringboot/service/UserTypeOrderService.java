package com.adrian.master.BackendUserSpringboot.service;

import java.util.List;

import com.adrian.master.BackendUserSpringboot.model.UserTypeOrder;

public interface UserTypeOrderService {

	List<UserTypeOrder> findAll();
	
	void insertUserTypeOrder(UserTypeOrder userTypeOrder);
	
	void updateUserTypeOrder(UserTypeOrder userTypeOrder);
	
	void deleteUserTypeOrder(UserTypeOrder userTypeOrder);
}
