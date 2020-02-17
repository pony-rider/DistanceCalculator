package com.mycompany.distancecalculator.servlets;

import com.mycompany.distancecalculator.service.HelloService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Inject
    private HelloService helloService;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("message", helloService.hello());
        req.getRequestDispatcher("/WEB-INF/hello.jsp").forward(req, resp);
        /*resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>" + helloService.hello() + "</h1>");
        writer.close();*/
    }
}
