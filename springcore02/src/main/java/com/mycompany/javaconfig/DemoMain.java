package com.mycompany.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context=new ClassPathXmlApplicationContext("com/mycompany/javaconfig/config.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student= context.getBean("student",Student.class);
		//System.out.println(student);
		student.study();
		

	}

}
