package com.demo;

import java.util.List;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@SpringBootApplication
public class SbhibernateApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SbhibernateApplication.class, args);
		EmployeeService es=context.getBean(EmployeeService.class);
		Employee e=es.m2("rahul", "tcs");
		System.out.println(e);
		
		
		
	/* to add random employee in table	
		
		for(int i=1;i<=2000;i++)
		{
			Employee e=new Employee();
			StringBuilder name=new StringBuilder();
			for(int j=1;j<=15;j++)
				name.append((char)(new Random().nextInt(26)+65));
			e.setEname(name.toString());
			StringBuilder company=new StringBuilder();
			for(int j=1;j<=15;j++)
				company.append((char)(new Random().nextInt(26)+65));
			e.setEcompany(company.toString());
			StringBuilder designation=new StringBuilder();
			for(int j=1;j<=15;j++)
				designation.append((char)(new Random().nextInt(26)+65));
			e.setEdesignation(designation.toString());
			e.setEsalary(new Random().nextDouble()*10000);
			es.save(e);

		}*/
	
	}

}
