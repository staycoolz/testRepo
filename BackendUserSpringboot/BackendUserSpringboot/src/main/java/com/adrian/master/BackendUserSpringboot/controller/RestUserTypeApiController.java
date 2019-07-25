package com.adrian.master.BackendUserSpringboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.master.BackendUserSpringboot.model.UserType;
import com.adrian.master.BackendUserSpringboot.service.UserTypeService;

@RestController
@RequestMapping("/userType")
public class RestUserTypeApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestUserTypeApiController.class);

	@Resource 
	UserTypeService userTypeService;
	
	@GetMapping(value = "/userTypeList")
	public List<UserType> getUserTypes() {
		return userTypeService.findAll();
	
	}
	
	@PostMapping(value = "/createUserType")
	public void createUserType(@RequestBody UserType userType) {
		 userTypeService.insertUserType(userType);
	
	}
	@PutMapping(value = "/updateUserType")
	public void updateUserType(@RequestBody UserType userType) {
		 userTypeService.updateUserType(userType);
	
	}
	
	@DeleteMapping(value = "/deleteUserTypeById")
	public void deleteUserType(@RequestBody UserType userType) {
		 userTypeService.deleteUserType(userType);
	
	}
	
}
