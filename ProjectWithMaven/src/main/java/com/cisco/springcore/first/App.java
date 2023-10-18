package com.cisco.springcore.first;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "I am learning Spring core!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/cisco/springcorefirst/config.xml");
        Student student1=  (Student) context.getBean("student1");
        Student student2= (Student) context.getBean("student2");
        Student student3= (Student) context.getBean("student3");
        System.out.println(student1);
        System.out.println(student1);
        System.out.println(student3);  
    }
}
