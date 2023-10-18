package com.cisco.springcore.referancetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cisco/springcorereferancetype/refconfig.xml");
		A tempA=  (A) context.getBean("aref");
		C temC= (C) context.getBean("cref");
		System.out.println(tempA.getOb());
		System.out.println(tempA.getX());
		System.out.println(temC.getZ());
		System.out.println(temC.getObj());
	}

}
