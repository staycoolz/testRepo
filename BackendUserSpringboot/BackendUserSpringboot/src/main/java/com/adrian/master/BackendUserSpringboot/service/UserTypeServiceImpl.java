package com.adrian.master.BackendUserSpringboot.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import com.adrian.master.BackendUserSpringboot.mapper.UserTypeRowMapper;
import com.adrian.master.BackendUserSpringboot.model.UserType;

@Service
public class UserTypeServiceImpl implements UserTypeService{
	
	public UserTypeServiceImpl (NamedParameterJdbcTemplate template) {  
        this.template = template;  
	}  
	
	NamedParameterJdbcTemplate template;  

	public List<UserType> findAll() {
		return template.query("select user_type_id as userTypeId, user_type as userType from user_type ", new UserTypeRowMapper());
	}

	public void insertUserType(UserType userType) {
		final String sql = "insert into user_type(user_type_id, user_type) values (nextval('user_type_seq'), :userType) ";
		
		KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
				.addValue("userType", userType.getUserType());
        template.update(sql,param, holder);
		
	}

	public void updateUserType(UserType userType) {
		final String sql = "update user_type set user_type = :userType where user_type_id = :userTypeId ";
		
		KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
        		.addValue("userTypeId", userType.getUserTypeId())
				.addValue("userType", userType.getUserType());
        template.update(sql,param, holder);
		
	}

	public void deleteUserType(UserType userType) {
		final String sql = "delete from user_type where user_type_id = :userTypeId ";
		
		Map<String,Object> map=new HashMap<String,Object>();  
		map.put("userTypeId", userType.getUserTypeId());
	
		template.execute(sql,map,new PreparedStatementCallback<Object>() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		    }  
		});
		
	}

}
