package com.mycompany.main;

import com.mycompany.attribute.FirstPatern;
import com.mycompany.attribute.SecondPatern;

public class App {
	public static String processInput(String userInput) {
		int option = Integer.parseInt(userInput);

		if (option == 1) {
			// For option 1, call SumClass to find the sum of two integers
			int num1 = 10; // You can get this value from the user using request.getParameter() in
							// InputServlet
			int num2 = 20; // You can get this value from the user using request.getParameter() in
							// InputServlet
			int sum = FirstPatern.sum(num1, num2);
			return "Sum: " + sum;
		} else if (option == 2) {
			// For option 2, call MultiplicationClass to find the multiplication of two
			// integers
			int num1 = 5; // You can get this value from the user using request.getParameter() in
							// InputServlet
			int num2 = 8; // You can get this value from the user using request.getParameter() in
							// InputServlet
			int multiplication = SecondPatern.multiply(num1, num2);
			return "Multiplication: " + multiplication;
		} else {
			return "Invalid option.";
		}
	}
}
