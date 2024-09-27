package com.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	Employee e=new Employee();
	e.setEid((int)rs.getObject("eid"));
	e.setEname((String)rs.getObject("ename"));
	e.setEcompany((String)rs.getObject("ecompany"));
	e.setEdesignation((String)rs.getObject("edesignation"));
	e.setEsalary((double)rs.getObject("esalary"));
	return e;
	
	}
	

}
