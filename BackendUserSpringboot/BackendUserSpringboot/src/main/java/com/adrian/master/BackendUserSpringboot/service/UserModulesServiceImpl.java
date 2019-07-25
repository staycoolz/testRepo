package com.adrian.master.BackendUserSpringboot.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.adrian.master.BackendUserSpringboot.mapper.UserModuleRowMapper;
import com.adrian.master.BackendUserSpringboot.model.UserModules;

@Service
public class UserModulesServiceImpl implements UserModulesService{
	
	public UserModulesServiceImpl (NamedParameterJdbcTemplate template) {  
        this.template = template;  
	}  
	
	NamedParameterJdbcTemplate template;  
	

	@Override
	public UserModules getUserModulesById(long userId) {
		UserModules userModules = new UserModules();
		final String sql = " select u.user_id as userId, uto.user_type_order_seq as moduleOrder, l.lookup_name as moduleName "+
				"from users u "+
				"join user_type_order uto on uto.user_type_id = u.user_type_id "+
				"join lookup l on l.lookup_id = uto.lookup_id "+
				"where u.user_id = :userId ";
		
		//userModules = (UserModules) template.query(sql, new UserModuleRowMapper());
		
		HashMap<String, Long> map = new HashMap<String, Long>();
		map.put("userId", userId);
		
		//return template.queryForObject(sql, parameters, new UserModuleRowMapper());
		Object queryForObject = template.queryForObject(sql, map, new UserModuleRowMapper());
		userModules = (UserModules)queryForObject;
		
		return userModules;
		
	}

}
