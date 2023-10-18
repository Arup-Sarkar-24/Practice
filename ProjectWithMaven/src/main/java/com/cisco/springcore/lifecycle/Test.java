package com.cisco.springcore.lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/cisco/springcore/lifecycle/lsconfig.xml");
		Samosa s1= (Samosa) context.getBean("s1");
		System.out.println(s1);
		context.registerShutdownHook();
		System.out.println("++++++++++++++++++++++");
		Pepsi p1= (Pepsi) context.getBean("p1");
		System.out.println(p1);
		Example example1= (Example) context.getBean("example1");
		System.out.println(example1);
	}

}
