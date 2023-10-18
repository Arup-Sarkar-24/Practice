package com.mycompany.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<title>Servlet3</title>");
            out.println("</head>");
            out.println("<body>");
            Cookie[] cookies= request.getCookies();
            boolean f=false;
            String name="";
            if (cookies==null) {
				out.println("<h2>You are new user go to home page and submit your name</h2>");
				return;
			}else {
				for(Cookie c: cookies) {
					String tname=c.getName();
					if(tname.equals("user_name")) {
						f=true;
						name=c.getValue();
						
					}
				}
			}
            if(f){            
            	out.println("<h2>Hello , "+name+" welcome to my website...</h2>");
            	out.println("<h2>Thank you.</h2>");
            	}else {
            		out.println("<h2>You are new user go to home page and submit your name</h2>");
            	}
            out.println("</body>");
            out.println("</html>");
        }
    }
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
