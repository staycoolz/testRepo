package com.adrian.master.BackendUserSpringboot.service;

import java.util.List;

import com.adrian.master.BackendUserSpringboot.model.Users;

public interface UsersService {
	
	List<Users> findAll();
	
	void insertUsers(Users users);
	
	void updateUsers(Users users);
	
	void deleteUsers(Users users);

}
