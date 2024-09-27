package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Demo1Application.class, args);
		EmployeeDao ed=context.getBean(EmployeeDao.class);
		System.out.println(ed.findEmployeeByEid(3));
	}

}
