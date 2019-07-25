package com.adrian.master.BackendUserSpringboot.service;

import java.util.List;

import com.adrian.master.BackendUserSpringboot.model.UserType;

public interface UserTypeService {
	
	List<UserType> findAll();
	
	void insertUserType(UserType userType);
	
	void updateUserType(UserType userType);
	
	void deleteUserType(UserType userType);

}
