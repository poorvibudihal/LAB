package com.example;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet {

    // ✔ Fix: handle GET request (avoid 405 error)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Redirect to form page
        response.sendRedirect("index.jsp");
    }

    // ✔ Handle form submission
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String desig = request.getParameter("designation");

        // ✔ Server-side validation
        if (name == null || name.isEmpty() ||
            email == null || email.isEmpty() ||
            desig == null || desig.isEmpty() ||
            !email.contains("@")) {

            response.setContentType("text/html");
            response.getWriter().println("<h3 style='color:red;'>Invalid Input!</h3>");
            response.getWriter().println("<a href='index.jsp'>Go Back</a>");
            return;
        }

        // ✔ Pass data to JSP
        request.setAttribute("username", name);
        request.setAttribute("email", email);
        request.setAttribute("designation", desig);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}