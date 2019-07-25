package com.adrian.master.backendUserConfiguration;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserOrderSection {
	
	@RequestMapping(value = "/getOrderSection/userId/{id}", method=RequestMethod.GET)
	@ResponseBody
	public String getFoosBySimplePathWithPathVariable(
	  @PathVariable("id") long id) {
		System.out.println("kesini 1");
	    return "Get a specific Foo with id=" + id;
	}
	
}
