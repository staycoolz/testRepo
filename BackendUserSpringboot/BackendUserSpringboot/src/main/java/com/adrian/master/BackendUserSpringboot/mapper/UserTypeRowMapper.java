package com.adrian.master.BackendUserSpringboot.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.adrian.master.BackendUserSpringboot.model.UserType;

public class UserTypeRowMapper implements RowMapper<UserType>{

	@Override
	public UserType mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserType userType = new UserType();
		userType.setUserTypeId(rs.getLong("userTypeId"));
		userType.setUserType(rs.getString("userType"));
		return userType;
	}

}
