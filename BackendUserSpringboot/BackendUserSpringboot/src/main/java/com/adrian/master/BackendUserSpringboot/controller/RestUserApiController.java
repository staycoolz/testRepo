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

import com.adrian.master.BackendUserSpringboot.model.Users;
import com.adrian.master.BackendUserSpringboot.service.UsersService;

@RestController
@RequestMapping("/users")
public class RestUserApiController {
	
	public static final Logger logger = LoggerFactory.getLogger(RestUserApiController.class);

	@Resource 
	UsersService usersService;
	
	@GetMapping(value = "/usersList")
	public List<Users> getUserss() {
		return usersService.findAll();
	
	}
	
	@PostMapping(value = "/createUsers")
	public void createUsers(@RequestBody Users users) {
		 usersService.insertUsers(users);
	
	}
	@PutMapping(value = "/updateUsers")
	public void updateUsers(@RequestBody Users users) {
		 usersService.updateUsers(users);
	
	}
	
	@DeleteMapping(value = "/deleteUsersById")
	public void deleteUsers(@RequestBody Users users) {
		 usersService.deleteUsers(users);
	
	}
	
}
