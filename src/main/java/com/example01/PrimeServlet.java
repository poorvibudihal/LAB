package com.example01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {

    // Handle GET request (fixes 405 error)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response); // reuse same logic
    }

    // Handle POST request
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String param = request.getParameter("num");
        int num;

        // Input validation
        try {
            num = Integer.parseInt(param);
        } catch (Exception e) {
            out.println("<html><body>");
            out.println("<h2 style='color:red;'>Invalid input! Please enter a valid number.</h2>");
            out.println("<br><a href='index.html'>Try Again</a>");
            out.println("</body></html>");
            return;
        }

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output
        out.println("<html><body>");
        out.println("<h2>Result</h2>");
        out.println("<p>Number: " + num + "</p>");

        if (isPrime) {
            out.println("<p style='color:green;'>It is a Prime Number</p>");
        } else {
            out.println("<p style='color:red;'>It is NOT a Prime Number</p>");
        }

        out.println("<br><a href='index.html'>Try Again</a>");
        out.println("</body></html>");
    }
}