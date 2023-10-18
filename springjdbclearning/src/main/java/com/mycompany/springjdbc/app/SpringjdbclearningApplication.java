package com.mycompany.springjdbc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.mycompany.springjdbc.dao.JdbcTemplate;
import com.mycompany.springjdbc.enities.Students;

@SpringBootApplication
public class SpringjdbclearningApplication {
    
    public static void main(String[] args) {
        System.out.println("My Program started......");
        ConfigurableApplicationContext context = SpringApplication.run(SpringjdbclearningApplication.class, args);
        JdbcTemplate template = context.getBean(JdbcTemplate.class);
        Students student1=new Students();
        // Insert query
        //String query = "INSERT INTO students (id, name, city) VALUES (?, ?, ?)";
        
        // Execute the query
        student1.setId(20113);
        student1.setName("Tillotama Saha");
        student1.setCity("Hooghly");
        template.save(student1);
        System.out.println("Number of records inserted: " + student1);
        context.close(); // Close the application context
    }
    
}

