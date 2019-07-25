package com.adrian.master.BackendUserSpringboot.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.adrian.master.BackendUserSpringboot.model.UserTypeOrder;

public class UserTypeOrderRowMapper implements RowMapper<UserTypeOrder>{

	@Override
	public UserTypeOrder mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserTypeOrder userTypeOrder = new UserTypeOrder();
		userTypeOrder.setUserTypeOrderId(rs.getLong("userTypeOrderId"));
		userTypeOrder.setUserTypeId(rs.getLong("userTypeId"));
		userTypeOrder.setUserTypeOrderSeq(rs.getInt("userTypeOrderSeq"));
		userTypeOrder.setLookupId(rs.getLong("lookupId"));
		return userTypeOrder;
	}

}
