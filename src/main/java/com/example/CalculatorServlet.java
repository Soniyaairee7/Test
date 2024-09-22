package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CalculatorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get parameters from the request
        String num1Param = request.getParameter("num1");
        String num2Param = request.getParameter("num2");
        String operation = request.getParameter("operation");

        // Check for missing parameters
        if (num1Param == null || num1Param.isEmpty() || num2Param == null || num2Param.isEmpty()) {
            request.setAttribute("error", "Parameters 'num1' and 'num2' are required.");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }

        // Parse the numbers safely
        int num1, num2;
        try {
            num1 = Integer.parseInt(num1Param);
            num2 = Integer.parseInt(num2Param);
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Invalid number format for 'num1' or 'num2'.");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }

        // Create an instance of DemoApplication to perform operations
        DemoApplication demoApplication = new DemoApplication();
        int result = 0;

        // Perform the appropriate operation
        switch (operation) {
            case "add":
                result = demoApplication.add(num1, num2);
                break;
            case "sub":
                result = demoApplication.sub(num1, num2);
                break;
            case "mul":
                result = demoApplication.mul(num1, num2);
                break;
            default:
                request.setAttribute("error", "Invalid operation.");
                request.getRequestDispatcher("error.jsp").forward(request, response);
                return;
        }

        // Set the result and forward it to the result.jsp
        request.setAttribute("result", result);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
