package com.web.tom.servlet;

import com.web.tom.dao.DbHelper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SelectServlet extends HttpServlet {

    private static final long serialVersionUID=1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        try {
//          int id=Integer.valueOf (req.getParameter ("id"));
            Connection conn=DbHelper.getConnection ();
            String sql="select * from _admin where id=?";
            PreparedStatement ps=conn.prepareStatement (sql);
            ps.setInt(1, Integer.parseInt (req.getParameter("id")));
//          ps.setInt(1,id);
            ResultSet resultSet = ps.executeQuery();
            while(resultSet.next()){
                req.setAttribute ("userName",resultSet.getString ("username"));
                req.setAttribute ("userPwd",resultSet.getString ("userpwd"));
                System.out.print (resultSet.getString ("username"));
            }
            req.getRequestDispatcher ("/Accept.jsp").forward (req, resp);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}