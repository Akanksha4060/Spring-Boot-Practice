package com.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.Repository.EmployeeRepository;
import com.demo.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository er;

	@Override
	public List<Employee> findAll() {
		return er.findAll();
			}

	
	@Override
	public List<Employee> findByEnameStartsWith(String ename) {
		return er.findByEnameStartsWith(ename);
		}


	@Override
	public Employee save(Employee e) {
		return er.save(e);
	}


	@Override
	public int deleteByEid(int eid) {
		return er.deleteByEid(eid);
	}


	@Override
	public Employee findByEid(int eid) {
		return er.findByEid(eid);	}


	@Override
	public List<Employee> findByEsalaryBetween(double startSalary, double endSalary) {
		return er.findByEsalaryBetween(startSalary, endSalary);
		}


	@Override
	public List<Employee> findByAny(String value) {
		return er.findByAny(value);
	}


	
}
