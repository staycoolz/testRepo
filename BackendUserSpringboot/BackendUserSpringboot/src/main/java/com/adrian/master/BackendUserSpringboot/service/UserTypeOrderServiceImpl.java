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

import com.adrian.master.BackendUserSpringboot.mapper.UserTypeOrderRowMapper;
import com.adrian.master.BackendUserSpringboot.model.UserTypeOrder;

@Service
public class UserTypeOrderServiceImpl implements UserTypeOrderService{
	
	public UserTypeOrderServiceImpl (NamedParameterJdbcTemplate template) {  
        this.template = template;  
	}  
	
	NamedParameterJdbcTemplate template;

	@Override
	public List<UserTypeOrder> findAll() {
		return template.query("select user_type_order_id as userTypeOrderId, user_type_id as userTypeId, user_type_order_seq as userTypeOrderSeq, lookup_id as lookupId from user_type_order ", new UserTypeOrderRowMapper());
	}

	@Override
	public void insertUserTypeOrder(UserTypeOrder userTypeOrder) {
		final String sql = "insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), :userTypeId, :userTypeOrderSeq, :lookupId)";
		
		KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
        		.addValue("userTypeId", userTypeOrder.getUserTypeId())
        		.addValue("userTypeOrderSeq", userTypeOrder.getUserTypeOrderSeq())
				.addValue("lookupId", userTypeOrder.getLookupId());
        template.update(sql,param, holder);
		
	}

	@Override
	public void updateUserTypeOrder(UserTypeOrder userTypeOrder) {
		final String sql = "update user_type_order set user_type_id = :userTypeId, user_type_order_seq = :userTypeOrderSeq, lookup_id = :lookupId where user_type_order_id = :userTypeOrderId ";
		
		KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
        		.addValue("userTypeOrderId", userTypeOrder.getUserTypeOrderId())
        		.addValue("userTypeId", userTypeOrder.getUserTypeId())
        		.addValue("userTypeOrderSeq", userTypeOrder.getUserTypeOrderSeq())
				.addValue("lookupId", userTypeOrder.getLookupId());
        template.update(sql,param, holder);
	}

	@Override
	public void deleteUserTypeOrder(UserTypeOrder userTypeOrder) {
		final String sql = "delete from user_type_order where user_type_order_id = :userTypeOrderId ";
		
		Map<String,Object> map=new HashMap<String,Object>();  
		map.put("userTypeOrderId", userTypeOrder.getUserTypeOrderId());
	
		template.execute(sql,map,new PreparedStatementCallback<Object>() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		    }  
		}); 
	}

}
