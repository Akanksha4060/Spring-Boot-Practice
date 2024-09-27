package com.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

//JPARepasitory ye sirf springBoot me krna hai ,pehle spring me sirf sessionfactory,interface,class itna hi ata

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	List<Employee> findAll();
	
	List<Employee> findByEnameStartsWith(String ename);
	
	int deleteByEid(int eid);
	
	Employee findByEid(int eid);
	
	List<Employee> findByEsalaryBetween(double startSalary,double endSalary );
	
	@Query(value="select eid,ename,edesignation,ecompany,esalary from where eid=:a or esalary=:a or ename like %:a% or ecompany like %:a% or edesignation like %:a%",nativeQuery=true)
	List<Employee> findByAny(@Param("a") String value);
} 


