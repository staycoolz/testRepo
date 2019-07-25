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

import com.adrian.master.BackendUserSpringboot.mapper.UsersRowMapper;
import com.adrian.master.BackendUserSpringboot.model.Users;

@Service
public class UsersServiceImpl implements UsersService{
	
	public UsersServiceImpl (NamedParameterJdbcTemplate template) {  
        this.template = template;  
	}  
	
	NamedParameterJdbcTemplate template;  

	@Override
	public List<Users> findAll() {
		return template.query("select user_id as userId, user_name as userName, user_password as userPassword, user_type_id as userTypeId from users ", new UsersRowMapper());
	}

	@Override
	public void insertUsers(Users users) {
		final String sql = "insert into users (user_id, user_name, user_password, user_type_id) values (nextval('users_seq'), :userName, :userPassword, :userTypeId) ";
		
		KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
        		.addValue("userName", users.getUserName())
				.addValue("userPassword", users.getUserPassword())
				.addValue("userTypeId", users.getUserTypeId());
        template.update(sql,param, holder);
		
	}

	@Override
	public void updateUsers(Users users) {
		final String sql = "update users set user_name = :userName, user_password=:userPassword, user_type_id = :userTypeId where user_id = :userId ";
		
		KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
        		.addValue("userId", users.getUserId())
        		.addValue("userName", users.getUserName())
				.addValue("userPassword", users.getUserPassword())
				.addValue("userTypeId", users.getUserTypeId());
        template.update(sql,param, holder);
	}

	@Override
	public void deleteUsers(Users users) {
		final String sql = "delete from users where user_id = :userId";
		
		Map<String,Object> map=new HashMap<String,Object>();  
		 map.put("userId", users.getUserId());
	
		template.execute(sql,map,new PreparedStatementCallback<Object>() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		    }  
		});
		
	}

}
