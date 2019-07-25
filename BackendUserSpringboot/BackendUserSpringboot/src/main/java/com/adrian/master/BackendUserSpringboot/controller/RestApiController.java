package com.adrian.master.BackendUserSpringboot.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.master.BackendUserSpringboot.model.UserModules;
import com.adrian.master.BackendUserSpringboot.service.UserModulesService;

@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Resource 
	UserModulesService userModuleService;
	
	@RequestMapping(value = "/getUserModules/{id}", method = RequestMethod.GET)
	public UserModules getUserModules(@PathVariable("id") long userId) {
		return userModuleService.getUserModulesById(userId);
	}
	
}