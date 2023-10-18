package com.mycompany.servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.main.App;

public class InputServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get user input from the request
        String userInput = request.getParameter("userInput");

        // Call the MainClass and get the processed result
        String result = App.processInput(userInput);

        // Store the result in the request attribute
        request.setAttribute("result", result);

        // Forward the request to the DisplayServlet
        request.getRequestDispatcher("/DisplayServlet").forward(request, response);
    }
}
