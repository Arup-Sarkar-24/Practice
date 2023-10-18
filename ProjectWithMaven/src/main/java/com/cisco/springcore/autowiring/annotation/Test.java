package com.cisco.springcore.autowiring.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/cisco/springcore/autowiring/annotation/autoconfig.xml");
		Emp emp1= context.getBean("emp1",Emp.class);
		System.out.println(emp1);
	}

}
