package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Service.EmployeeService;
import com.demo.model.Employee;

@RestController
@RequestMapping(value= {"/employee"})
public class EmployeeController {
	
	@Autowired
	private EmployeeService es;
	
	@PostMapping(value= {"insert"})  //to add value
	public Employee m1(@RequestBody Employee e)  //requestbody for deserialize
	{
		return es.save(e);
		
	}
	
	@PutMapping(value= {"update"})
	public Employee m2(@RequestBody Employee e)
	{
		return es.save(e);
	}
	
	@DeleteMapping(value= {"deletebyid/{eid}"})     //URI METHOD
	public int m3(@PathVariable int eid)  //name same asel eid ani int eid tr @pathVariable("eid") asa lihaychi grj nhi pn nav change asel tr lihav lavel mapping mdhla nav path variable mdye
	{
		return es.deleteByEid(eid);
	}
	
	@GetMapping({"findbyid/{eid}"})
	public Employee m4(@PathVariable int eid)
	{
		return es.findByEid(eid);
	}
	
	@GetMapping(value= {"findbysalarybetween/{low}/{high}"})
	public List<Employee> m5(@PathVariable double low,@PathVariable double high)
	{
		return es.findByEsalaryBetween(low, high);
	}
	
	@GetMapping(value= {"find/{eid}"})
	public List<Employee> m6(@PathVariable String eid)
	{
		return es.findByAny(eid);
	}
}

