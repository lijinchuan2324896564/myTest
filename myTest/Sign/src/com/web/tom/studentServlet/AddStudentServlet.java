package com.web.tom.studentServlet;

import com.web.tom.dao.StudentDao;
import com.web.tom.entity.Student;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String major = req.getParameter("major");
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        Student student = new Student ();
        student.setStNumber (Integer.parseInt (req.getParameter("stNumber")));
        student.setName(new String(name.getBytes("ISO-8859-1"), "UTF-8")); // 转值，中文需要转换为utf-8
        student.setMajor(new String(major.getBytes("ISO-8859-1"), "UTF-8"));
        StudentDao dao = new StudentDao ();
        dao.addStudent (student);
        req.getRequestDispatcher("ShowStudentServlet").forward(req, resp);
    }
}
