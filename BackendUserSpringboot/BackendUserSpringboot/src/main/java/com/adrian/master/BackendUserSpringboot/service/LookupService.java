package com.adrian.master.BackendUserSpringboot.service;

import java.util.List;

import com.adrian.master.BackendUserSpringboot.model.Lookup;

public interface LookupService {
	
	List<Lookup> findAll();
	
	void insertLookup(Lookup lookup);

	void updateLookup(Lookup lookup);
	
	void deleteLookup(Lookup lookup);
}
