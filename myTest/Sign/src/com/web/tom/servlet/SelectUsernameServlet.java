package com.web.tom.servlet;

import com.web.tom.dao.AdminDao;
import com.web.tom.dao.StudentDao;
import com.web.tom.entity.Admin;
import com.web.tom.entity.Student;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SelectUsernameServlet")
public class SelectUsernameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String username=req.getParameter("username");
//        System.out.print (req.getParameter("name"));
        AdminDao dao = new AdminDao ();
        Admin admin = dao.selectAdminByname (username);
        req.setAttribute ("userName",admin.getUsername ());
        req.setAttribute ("userPwd",admin.getUserpwd ());
//        System.out.print (student.getName ());
        req.getRequestDispatcher("/Accept.jsp").forward(req, resp);
    }
}
