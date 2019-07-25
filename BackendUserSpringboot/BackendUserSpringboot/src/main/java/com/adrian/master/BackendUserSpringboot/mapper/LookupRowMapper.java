package com.adrian.master.BackendUserSpringboot.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.adrian.master.BackendUserSpringboot.model.Lookup;

public class LookupRowMapper implements RowMapper<Lookup>{

	@Override
	public Lookup mapRow(ResultSet rs, int rowNum) throws SQLException {
		Lookup lookup = new Lookup();
		lookup.setLookupId(rs.getLong("lookupId"));
		lookup.setLookupName(rs.getString("lookupName"));
		return lookup;
	}

}
