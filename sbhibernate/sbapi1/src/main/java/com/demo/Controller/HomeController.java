package com.demo.Controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Service.EmployeeService;

@RestController
public class HomeController {

	@Autowired
	private EmployeeService es;
	
	@GetMapping(value= {"/"})
	public Map<String,Collection> m1()
	{
		Map<String,Collection> m = new HashMap();
		m.put("r",(Collection) es.findByEnameStartsWith("r"));
		
		return m;
	}
}
