package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("uname");

        // Create name cookie
        Cookie nameCookie = new Cookie("user", name);
        nameCookie.setMaxAge(60); // expires in 1 minute

        // Visit count cookie
        Cookie[] cookies = request.getCookies();
        int count = 1;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    count = Integer.parseInt(c.getValue()) + 1;
                }
            }
        }

        Cookie countCookie = new Cookie("visitCount", String.valueOf(count));
        countCookie.setMaxAge(60);

        // Add cookies
        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Display output
        out.println("<html><body>");

        out.println("<h2 style='color:blue;'>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + count + " times.</h3>");

        // Show all cookies
        out.println("<h3>Cookie List:</h3>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("Name: " + c.getName() + "<br>");
                out.println("Value: " + c.getValue() + "<br>");
                out.println("Max Age: " + c.getMaxAge() + "<br><br>");
            }
        }

        out.println("<p>Cookie will expire in 1 minute.</p>");
        out.println("<a href='index.html'>Go Back</a>");

        out.println("</body></html>");
    }
}