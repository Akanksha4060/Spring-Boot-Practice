package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao ed;

	@Override
	public Employee save(Employee e) {
		return ed.save(e);
			}

	
	@Override
	public Employee findByEid(int eid) {
		return ed.findByEid(eid);
	}


	@Override
	public Employee findByEname(String Ename) {
		return ed.findByEname(Ename);
	}


	@Override
	public Employee findByEcompany(String Ecompany) {
		return ed.findByEcompany(Ecompany);
	}


	@Override
	public Employee findByEidAndEcompany(int eid, String ecompany) {
		return ed.findByEidAndEcompany(eid, ecompany);
	}


	@Override
	public List<Employee> findByEidOrEcompany(int eid, String ecomapny) {
		return ed.findByEidOrEcompany(eid, ecomapny);
	}


	@Override
	public List<Employee> findByEsalaryLessThan(double esalary) {
		return ed.findByEsalaryLessThan(esalary);
	}


	@Override
	public List<Employee> findByEsalaryBetween(double low, double high) {
		return ed.findByEsalaryBetween(low, high);
	}


	@Override
	public List<Employee> findByEnameStartsWith(String ename) {
		return ed.findByEnameStartsWith(ename);
				}


	@Override
	public List<Employee> findByEnameContains(String ename) {
		return ed.findByEnameContains(ename);
	}


	@Override
	public Employee m1(int eid, String ename) {
		return ed.m1(eid, ename);
	}


	@Override
	public Employee m2(String ename, String ecompany) {
		return ed.m2(ename, ecompany);
	}


	@Override
	public Employee m3(int eid, String ecompany) {
	//	return ed.m3(eid, ecompany);
		return null;
	}
}
