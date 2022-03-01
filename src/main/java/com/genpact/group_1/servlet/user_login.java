package com.genpact.group_1.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class user_login extends HttpServlet {
    public user_login() {
        super();
          }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                 String username = request.getParameter("username");
                 String password = request.getParameter("password");
                 if(username.isEmpty() || password.isEmpty() )
                 {
                           RequestDispatcher requ = request.getRequestDispatcher("userLogin.jsp");
                           requ.include(request, response);
                 }
                 else
                 {
                           RequestDispatcher requ =       request.getRequestDispatcher("userLogin_2.jsp");
                           requ.forward(request, response);
                 }
        }
 
}