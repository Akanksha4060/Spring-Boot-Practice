package com.demo.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.demo.model.Employee;

public interface EmployeeService {
	
	//JPA
	Employee save(Employee e);
	
	Employee findByEid(int eid);
	
	//JPQL
	
	Employee findByEname(String Ename);
	
	Employee findByEcompany(String Ecompany);
	
	Employee findByEidAndEcompany(int eid,String ecompany);
	
	List<Employee> findByEidOrEcompany(int eid,String ecomapny);
	
	List<Employee> findByEsalaryLessThan(double esalary);
	
	List<Employee> findByEsalaryBetween(double low,double high);
	
	List<Employee> findByEnameStartsWith(String ename);
	
	List<Employee> findByEnameContains(String ename);
	
	//Manuallly
	Employee m3(@Param("a")int eid,@Param("b")String ecompany);

	//HQL
	
	Employee m1(@Param("a") int eid,@Param("b")String ename);
	
	//SQL
	Employee m2(String ename,String ecompany);





}
