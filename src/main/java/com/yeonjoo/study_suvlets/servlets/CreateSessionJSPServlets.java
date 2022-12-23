package com.yeonjoo.study_suvlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// /session/createJSPServlets?username=yeonjoo&password=1234
@WebServlet(urlPatterns="/session/createJSPServlets")
public class CreateSessionJSPServlets extends HttpServlet{ //로그인때 사용
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //로그인값 받기
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // display
        
        // login되는 상태 
        HttpSession httpSession = null;
        HttpSession httpSession_false = null;

        // EXISTS JSESSIONID
        // httpSession_false = request.getSession(false); // Null
        // httpSession = request.getSession(); // 인스턴스화

        // Not EXIXTS JESIIONID
        httpSession_false = request.getSession(false); // 존재하면 인스턴스화
        httpSession = request.getSession();  // 무조건 인스턴스화

        String path = null;
        if("yeonjoo".equals(username) && "1234".equals(password)){ //디버깅시 "yeonjoo".equals(username),상수를 앞으로
             // login
             httpSession = request.getSession(false);
             if(httpSession == null) {
                httpSession = request.getSession();
                httpSession.setAttribute("username", username);
                httpSession.setAttribute("password", password);
             }
             
             System.out.println(httpSession.getAttribute("username"));
             System.out.println(httpSession.getId());
             path = "/session/checkLogin.jsp";
        } else {
            // logout
            httpSession = request.getSession(false);
            if (httpSession != null) {
                httpSession.invalidate();
            }
            // System.out.println(httpSession.getAttribute("username"));
            System.out.println(httpSession.getId());
            path = "/session/checkLogout.jsp";
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }
}