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

import com.adrian.master.BackendUserSpringboot.model.Lookup;
import com.adrian.master.BackendUserSpringboot.service.LookupService;

@RestController
@RequestMapping("/lookup")
public class RestLookupApiController {
	
	public static final Logger logger = LoggerFactory.getLogger(RestLookupApiController.class);

	@Resource 
	LookupService lookupService;
	
	@GetMapping(value = "/lookupList")
	public List<Lookup> getLookups() {
		return lookupService.findAll();
	}
	
	@PostMapping(value = "/createLookup")
	public void createLookup(@RequestBody Lookup lookup) {
		 lookupService.insertLookup(lookup);
	
	}
	@PutMapping(value = "/updateLookup")
	public void updateLookup(@RequestBody Lookup lookup) {
		 lookupService.updateLookup(lookup);
	
	}
	
	@DeleteMapping(value = "/deleteLookupById")
	public void deleteLookup(@RequestBody Lookup lookup) {
		 lookupService.deleteLookup(lookup);
	
	}
	
	
}
