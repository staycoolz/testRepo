package com.adrian.master.BackendUserSpringboot.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.adrian.master.BackendUserSpringboot.model.Modules;
import com.adrian.master.BackendUserSpringboot.model.UserModules;

public class UserModuleRowMapper implements RowMapper<UserModules>{

	@Override
	public UserModules mapRow(ResultSet rs, int rowNum) throws SQLException {
		List<Modules> modules = new LinkedList<Modules>();
		UserModules userModules = new UserModules();
		
		userModules.setUserId(rs.getLong("userId"));
		
		Modules module = new Modules();
		module.setModuleName(rs.getString("moduleName"));
		module.setModuleOrder(rs.getInt("moduleOrder"));
		modules.add(module);
		
		while(rs.next()) {
			module = new Modules();
			module.setModuleName(rs.getString("moduleName"));
			module.setModuleOrder(rs.getInt("moduleOrder"));
			modules.add(module);
		}
		userModules.setModules(modules);
		
		return userModules;
	}


}
