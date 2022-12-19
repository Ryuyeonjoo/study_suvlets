package com.yeonjoo.study_suvlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// /session/createServlets?username=yeonjoo&password=1234
@WebServlet(urlPatterns = "/session/creatServlets")
public class CreateSessionServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        
        // display
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<div>Create Session Servlets</div>");
        // login
        if(userName.equals("yoenjoo") && password.equals("1234")){
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("userName", userName);
            httpSession.setAttribute("password", password);
            printWriter.println("<div>"+userName+", "+password+"</div>");

        } else {
            printWriter.println("<div>Faild</div>");
        }
        printWriter.close();
        }        
    }
