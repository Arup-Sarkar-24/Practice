package com.mycompany.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S2 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<title>Result</title>");
            // Add Bootstrap CSS link (if needed) or include it in the HTML content here
            out.println("</head>");
            out.println("<body style=\"font-family: Arial, sans-serif; background-color: #f2f2f2;\">");
            out.println("<div class=\"container\" style=\"max-width: 500px; margin: auto; padding: 20px; background-color: #fff; border: 1px solid #ccc; box-shadow: 0 0 10px rgba(0, 0, 0, 0.2); border-radius: 5px;\">");
            out.println("<h1 style=\"text-align: center; color: #4CAF50;\">Calculator-Display</h1>");
            int nn1 = Integer.parseInt(request.getParameter("n1"));
            int nn2 = Integer.parseInt(request.getParameter("n2"));
            int sum = (int) request.getAttribute("sumResult");
            int product = nn1 * nn2;
            out.println("<div style=\"text-align: center;\">");
            out.println("<h2>Results:</h2>");
            out.println("<p>Sum: " + sum + "</p>");
            out.println("<p>Product: " + product + "</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
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
