package com.web.tom.servlet;

import com.web.tom.dao.AdminDao;
import  com.web.tom.dao.DbHelper;
import com.web.tom.entity.Admin;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


@WebServlet(name = "Servlet.LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String  username=request.getParameter("username");
        String  userpwd=request.getParameter("password");
        Admin admin=new Admin ();
        admin.setUsername (username);
        admin.setUserpwd (userpwd);
        AdminDao dao =new AdminDao ();
        Admin ad =dao.queryAdminByidAndPwd (admin);
        if (ad==null){
            response.sendRedirect("Enter.jsp");
        }else {
            response.sendRedirect("Operation.jsp");
        }
    }
}
