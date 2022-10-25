package com.example.experiment;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InitTest", value = "/InitTest")
public class InitTest extends HttpServlet {
    static {
        System.out.println("InitTest static initializer");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("InitTest init()");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Got GET method /InitTest");
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "GET /InitTest" + "</h1>");
        out.println("</body></html>");
    }
}
