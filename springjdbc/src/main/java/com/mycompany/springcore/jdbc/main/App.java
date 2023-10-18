package com.mycompany.springcore.jdbc.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mycompany.springcore.jdbc.dao.StudentDao;
import com.mycompany.springcore.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Working on Spring Jdbc....");
		// spring jdbc=>jdbcTemplate
		// ApplicationContext context=new
		// ClassPathXmlApplicationContext("com/mycompany/springcore/jdbc/main/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("Press 1 for adding new student.");
			System.out.println("Press 2 for displaying all student.");
			System.out.println("Press 3 for getting detail of single student.");
			System.out.println("Press 4 for deleting student.");
			System.out.println("Press 5 for updating student's record.");
			System.out.println("Press 6 for exit.");
			System.out.print("Ener input : ");

			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1: // Insert
					// taking Student's details
					System.out.println("Enter Student Id : ");
					int sId = Integer.parseInt(br.readLine());

					System.out.println("Enter Student name : ");
					String sName = br.readLine();

					System.out.println("Enter Student city : ");
					String sCity = br.readLine();

					// creating student object and setting values
					Student student = new Student();
					student.setId(sId);
					student.setName(sName);
					student.setCity(sCity);

					int insertResult = studentDao.insert(student);
					System.out.println("Student added " + insertResult);
					System.out.println();
					break;

				case 2:// Get all student data
					List<Student> students = studentDao.getAllStudents();
					System.out.println("All students details : \n\n\n");
					for (Student s : students) {
						System.out.println(s + "\n");
						System.out.println("_______________________________________________________________________\n");
					}
					break;

				case 3: // Single Student Data
					// taking Student's details
					System.out.println("Enter Student Id : ");
					int sIdSingle = Integer.parseInt(br.readLine());
					Student studentSingle = studentDao.getStudent(sIdSingle);
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println(studentSingle);
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					break;
				case 4: // delete
					// taking Student's details
					System.out.println("Enter Student Id : ");
					int sIdDelete = Integer.parseInt(br.readLine());
					int result = studentDao.delete(sIdDelete);
					System.out.println("deleted " + result);
					System.out
							.println("------------------------------------------------------------------------------");
					break;
				case 5: // Update
					// taking Student's details
					System.out.println("Enter Student Id : ");
					int sIdUpdate = Integer.parseInt(br.readLine());

					System.out.println("Enter Student name : ");
					String sNameUpdate = br.readLine();

					System.out.println("Enter Student city : ");
					String sCityUpdate = br.readLine();

					// Updating student object and setting values
					Student studentUpdate = new Student();
					studentUpdate.setId(sIdUpdate);
					studentUpdate.setName(sNameUpdate);
					studentUpdate.setCity(sCityUpdate);
					int resultUpdate = studentDao.change(studentUpdate);
					System.out.println("data Changed..." + resultUpdate);
					break;
				case 6:// exit
					go = false;
					break;
				default:
					System.out.println("Invalid input try with another one !!");

				}

			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thank you using my application.");
		System.out.println("See you soon!!");
	}
}
