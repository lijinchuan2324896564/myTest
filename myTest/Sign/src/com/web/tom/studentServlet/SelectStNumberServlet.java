package com.web.tom.studentServlet;

import com.web.tom.dao.StudentDao;
import com.web.tom.entity.Student;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SelectStNumberServlet")
public class SelectStNumberServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        StudentDao dao = new StudentDao ();
        Student student = dao.selectStudentByStNumber (Integer.parseInt (req.getParameter("stNumber")));
        req.setAttribute ("stNumber",student.getStNumber ());
        req.setAttribute ("name",student.getName ());
        req.setAttribute ("major",student.getMajor ());
        req.setAttribute("student", student);
        req.getRequestDispatcher("/AcceptSt.jsp").forward(req, resp);
    }
}
