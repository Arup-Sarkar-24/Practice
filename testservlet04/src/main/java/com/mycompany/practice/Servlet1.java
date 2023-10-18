package com.mycompany.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Servlet1</title>");
            out.println("</head>");
            out.println("<body>");
            String name=request.getParameter("name");
            out.println("<h2>Hello , "+name+" welcome to my website...</h2>");
            out.println("<h2><a herf ='Servlet3'>Go to Servlet3</a></h2>");
            //create a cookie
            Cookie c=new Cookie("user_name", name);
            response.addCookie(c);
            out.println("<h2>Thank you.</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	  @Override
	    public String getServletInfo() {
	        return "Short description";
	    }

}
