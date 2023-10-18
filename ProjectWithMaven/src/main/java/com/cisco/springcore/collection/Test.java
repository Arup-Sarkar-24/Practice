package com.cisco.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/cisco/springcore/collection/collectionconfig.xml ");
		Emp emp1= (Emp) context.getBean("emp1");
		Emp emp2= (Emp) context.getBean("emp2");
		System.out.println(emp1);
		System.out.println("\n");
		System.out.println(emp2);
	}

}
