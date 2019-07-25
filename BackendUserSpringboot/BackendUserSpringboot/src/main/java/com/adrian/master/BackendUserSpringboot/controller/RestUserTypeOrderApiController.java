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

import com.adrian.master.BackendUserSpringboot.model.UserTypeOrder;
import com.adrian.master.BackendUserSpringboot.service.UserTypeOrderService;

@RestController
@RequestMapping("/userTypeOrderOrder")
public class RestUserTypeOrderApiController {
	
	public static final Logger logger = LoggerFactory.getLogger(RestUserTypeOrderApiController.class);

	@Resource 
	UserTypeOrderService userTypeOrderService;
	
	@GetMapping(value = "/userTypeOrderList")
	public List<UserTypeOrder> getUserTypeOrders() {
		return userTypeOrderService.findAll();
	
	}
	
	@PostMapping(value = "/createUserTypeOrder")
	public void createUserTypeOrder(@RequestBody UserTypeOrder userTypeOrder) {
		 userTypeOrderService.insertUserTypeOrder(userTypeOrder);
	
	}
	@PutMapping(value = "/updateUserTypeOrder")
	public void updateUserTypeOrder(@RequestBody UserTypeOrder userTypeOrder) {
		 userTypeOrderService.updateUserTypeOrder(userTypeOrder);
	
	}
	
	@DeleteMapping(value = "/deleteUserTypeOrderById")
	public void deleteUserTypeOrder(@RequestBody UserTypeOrder userTypeOrder) {
		 userTypeOrderService.deleteUserTypeOrder(userTypeOrder);
	
	}

}
