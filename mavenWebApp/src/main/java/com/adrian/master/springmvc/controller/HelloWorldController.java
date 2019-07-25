package com.adrian.master.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/helloworld")
	public ModelAndView hello() {
		System.out.println("masuk sini");
		String helloWorldMessage = "Hello world from adrian!";
		return new ModelAndView("hello", "message", helloWorldMessage);
	}
}
