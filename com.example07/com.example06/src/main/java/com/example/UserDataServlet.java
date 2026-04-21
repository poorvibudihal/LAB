package com.example;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String desig = request.getParameter("designation");

        // Server-side validation
        if (name == null || name.trim().isEmpty() ||
            email == null || email.trim().isEmpty() ||
            desig == null || desig.trim().isEmpty() ||
            !email.contains("@")) {

            response.setContentType("text/html");
            response.getWriter().println("<h3 style='color:red;'>Invalid Input (Server Side Validation Failed)</h3>");
            response.getWriter().println("<a href='index.jsp'>Go Back</a>");
            return;
        }

        // Set attributes
        request.setAttribute("username", name);
        request.setAttribute("email", email);
        request.setAttribute("designation", desig);

        // Forward to result.jsp
        RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
        rd.forward(request, response);
    }

    // Prevent 405 error
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }
}