package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;
import com.demo.model.EmployeeRowMapper;

@Repository
public class EmployeeDao {

	@Autowired
	private JdbcTemplate j;
	
	public int insertEmployee(Employee e)
	{
		String sql="insert into employee(ename,ecompany,edesignation,esalary)values(?,?,?,?)";
		return j.update(sql,new Object[] {e.getEname(),e.getEcompany(),e.getEdesignation(),e.getEsalary()});
		
	}
	public int deleteEmployee(int eid)
	{
		String sql="delete from employee where eid=?";
		return j.update(sql,eid);
	}
	
	public Employee findEmployeeByEid(int eid) {
		
		String sql="select eid,ename,ecompany,edesignation,esalary from employee where eid=?";
		return j.query(sql,new EmployeeRowMapper(),eid).get(0);
	}
}

	
	

