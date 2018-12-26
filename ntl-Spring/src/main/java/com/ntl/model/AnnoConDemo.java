package com.ntl.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoConDemo {

	
	public static void main(String z[])
	{
		ApplicationContext context;
		context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		//Employee zpp=context.getBean(Employee.class);		//byType
		
		Employee app=(Employee) context.getBean("getEmployee2");		//byName
		
		System.out.println(app);
	}
	
}
