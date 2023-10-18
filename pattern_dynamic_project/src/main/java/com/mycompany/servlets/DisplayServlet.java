package com.mycompany.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the result from the request attribute
        String result = (String) request.getAttribute("result");

        // Display the result on the server (you can also send it back to the client for display)
        response.getWriter().write("Result: " + result);
    }
}

