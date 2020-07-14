package com.random.sumcalc.db;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DBDao {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public DBDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Integer getRandom() {
		int output=0; 
		CallableStatement stmt; 
		
		try {
			stmt  = jdbcTemplate.getDataSource().getConnection().prepareCall("{? = call GET_RANDOM_NUM()}"); 
			stmt.registerOutParameter(1, Types.INTEGER); stmt.execute(); output = stmt.getInt(1); 
		} catch  (SQLException e) { 
			
		}
		return output;
	  }
	 

	/*
	 * public Integer getRandom() { SimpleJdbcCall call = new
	 * SimpleJdbcCall(jdbcTemplate).withFunctionName("GET_RANDOM_NUM()");
	 * 
	 * Integer sum = call.executeFunction(Integer.class); System.out.println(sum);
	 * 
	 * return sum; }
	 */

}