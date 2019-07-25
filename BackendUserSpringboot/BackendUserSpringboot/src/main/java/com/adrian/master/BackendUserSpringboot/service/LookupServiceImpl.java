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

import com.adrian.master.BackendUserSpringboot.mapper.LookupRowMapper;
import com.adrian.master.BackendUserSpringboot.model.Lookup;

@Service
public class LookupServiceImpl implements LookupService{

	public LookupServiceImpl (NamedParameterJdbcTemplate template) {  
        this.template = template;  
	}  
	
	NamedParameterJdbcTemplate template;  
	
	public List<Lookup> findAll() {
		return template.query("select lookup_id as lookupId, lookup_name as lookupName from lookup", new LookupRowMapper());
	}

	public void insertLookup(Lookup lookup) {
		final String sql = "insert into lookup(lookup_id, lookup_name) values (nextval('lookup_seq'), :lookupName)";
		
		KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
				.addValue("lookupName", lookup.getLookupName());
        template.update(sql,param, holder);
	}

	public void updateLookup(Lookup lookup) {
		final String sql = "update lookup set lookup_name = :lookupName where lookup_id = :lookupId ";
		
		KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
        		.addValue("lookupId", lookup.getLookupId())
				.addValue("lookupName", lookup.getLookupName());
        template.update(sql,param, holder);
		
	}

	public void deleteLookup(Lookup lookup) {
		final String sql = "delete from lookup where lookup_id = :lookupId ";
		
		Map<String,Object> map=new HashMap<String,Object>();  
		map.put("lookupId", lookup.getLookupId());
	
		template.execute(sql,map,new PreparedStatementCallback<Object>() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		    }  
		});  
		
	}

}
