package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	//jpa ->keep blank
	
	//JPQL
	
	Employee findByEid(int eid);
	
	Employee findByEname(String Ename);
	
	Employee findByEcompany(String Ecompany);
	
	Employee findByEidAndEcompany(int eid,String ecompany);
	
	List<Employee> findByEidOrEcompany(int eid,String ecomapny);
	
	List<Employee> findByEsalaryLessThan(double esalary);
	
	List<Employee> findByEsalaryBetween(double low,double high);
	
	List<Employee> findByEnameStartsWith(String ename);
	
	List<Employee> findByEnameContains(String ename);
	
	//HQL
	
	@Query(value="from Employee where eid=:a and ename=:b")
	Employee m1(@Param("a") int eid,@Param("b")String ename);
	
	//SQL
	
	@Query(value="select eid,ename,ecompany,edesignation,esalary from Employee where ename=?1 and ecompany=?2",nativeQuery=true)
	Employee m2(String ename,String ecompany);
	
	
	//do manually in hibernate by copy paste fired query
	
/*	@Query(value="select employee0_.eid as eid1_0_,employee0_.ecompany as ecompany2_0_,employee0_.edesignation as edesignation3_0_,employee0_.ename as ename4_0_,employeee0_.esalary as esalary5_0_ from Employee employee0_ where employee0_.eid=?1 and employee_.ecompany=?2",nativeQuery=true)
	Employee m3(@Param("a")int eid,@Param("b")String ecompany);   */
}

