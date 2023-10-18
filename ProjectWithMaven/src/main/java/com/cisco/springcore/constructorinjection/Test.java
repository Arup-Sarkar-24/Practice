package com.cisco.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cisco/springcore/constructorinjection/ciconfig.xml");
		Person p1= (Person) context.getBean("person1");
		System.out.println(p1);
		Addition add1= (Addition) context.getBean("add1");
		add1.dosum();

	}

}
