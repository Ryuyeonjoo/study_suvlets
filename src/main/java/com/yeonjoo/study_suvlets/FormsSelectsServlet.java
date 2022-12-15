package com.yeonjoo.study_suvlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/formsSelectsServlet")
public class FormsSelectsServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter printWriter = response.getWriter();

        String title = "Select";
        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("<meta charset='UTF-8'>");
        printWriter.println("<meta http-equiv='X-UA-Compatible 'content='IE=edge'>");
        printWriter.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        printWriter.println("<title>Document</title>");
        printWriter.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
        printWriter.println("integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
        printWriter.println("crossorigin='anonymous'></script>");
        printWriter.println("<link rel='stylesheet' href='./css/commons.css' />");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<div class='fs-3'>form selects</div>");
        printWriter.println("<div>");
        printWriter.println("<label for='' class='form-label'>select multiple</label>");
        printWriter.println("<select class='form-select' multiple aria-label=''>");
        printWriter.println("<option value=M01>One</option>");
        printWriter.println("<option value=M02 selected>Two</option>");
        printWriter.println("<option value=M03>Three</option>");
        printWriter.println("<option value=M04 selected>Four</option>");
        printWriter.println("<option value=M01>One</option>");
        printWriter.println("<option value=M02 selected>Two</option>");
        printWriter.println("<option value=M03>Three</option>");
        printWriter.println("<option value=M04 selected>Four</option>");
        printWriter.println("</select>");
        printWriter.println("</div>");
        printWriter.println("<div>");
        printWriter.println("<label for='' class='form-label'>select</label>");
        printWriter.println("<select class='form-select' aria-label=''>");
        printWriter.println("<option >Open this select menu</option>");
        printWriter.println("<option value=M01>One</option>");
        printWriter.println("<option value=M02 selected>Two</option>");
        printWriter.println("<option value=M03>Three</option>");
        printWriter.println("</select>");
        printWriter.println("</div>");
    
        printWriter.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
        printWriter.println("integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
        printWriter.println("crossorigin='anonymous'></script>");
        printWriter.println("</body>");
        printWriter.println("</html>");

        printWriter.close();
    }
}
