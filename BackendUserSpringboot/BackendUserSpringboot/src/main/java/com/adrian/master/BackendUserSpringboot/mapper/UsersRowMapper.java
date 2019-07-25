package com.adrian.master.BackendUserSpringboot.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.adrian.master.BackendUserSpringboot.model.Users;

public class UsersRowMapper implements RowMapper<Users>{

	@Override
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users user = new Users();
		user.setUserId(rs.getLong("userId"));
		user.setUserName(rs.getString("userName"));
		user.setUserPassword(rs.getString("userPassword"));
		user.setUserTypeId(rs.getLong("userTypeId"));
		return user;
	}

}
