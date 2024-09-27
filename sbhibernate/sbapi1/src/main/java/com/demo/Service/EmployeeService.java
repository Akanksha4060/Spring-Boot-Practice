package com.demo.Service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.demo.model.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();

	List<Employee> findByEnameStartsWith(String ename);

	Employee save(Employee e);
	
	int deleteByEid(int eid);
	
	Employee findByEid(int eid);
	
	List<Employee> findByEsalaryBetween(double startSalary,double endSalary );
	
	List<Employee> findByAny(@Param("a") String value);

}
