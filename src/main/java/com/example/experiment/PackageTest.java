package com.example.experiment;



import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PackageTest", value = "/PackageTest")
public class PackageTest extends HttpServlet {
    static {
        System.out.println("PackageTest static initializer");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("PackageTest init()");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Got GET method /PackageTest");
        response.setContentType("text/html");
        System.out.println(org.example.Wrapper.factorial(7));

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "GET /PackageTest" + "</h1>");
        out.println("<h2> Usage of Apache Math Package" + "Sick" + "</h2>");
        out.println("</body></html>");
    }
}
