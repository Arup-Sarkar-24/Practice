package com.mycompany.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S1 extends HttpServlet {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html;charset=UTF-8");
	    String n1 = request.getParameter("n1");
	    String n2 = request.getParameter("n2");
	    int nn1 = Integer.parseInt(n1);
	    int nn2 = Integer.parseInt(n2);
	    //add
	    int s = nn1 + nn2;
	    //attribute
	    request.setAttribute("sumResult", s);
	    RequestDispatcher rd = request.getRequestDispatcher("S2");
	    rd.forward(request, response);
	}


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
