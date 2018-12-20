package com.web.tom.studentServlet;

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

@WebServlet(name = "UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String idStr = req.getParameter("stNumber");
        if (idStr != null && !idStr.equals("")) {
            int stNumber = Integer.valueOf(idStr);
            StudentDao dao = new StudentDao ();
            Student student = dao.selectStudentByStNumber (stNumber);
            req.setAttribute("student", student);
        }
        req.getRequestDispatcher("updateSt.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String major = req.getParameter("major");
        Student student = new Student ();
        student.setStNumber (Integer.parseInt (req.getParameter("stNumber")));
        student.setName(new String(name.getBytes("ISO-8859-1"),"UTF-8"));
        student.setMajor (new String(major.getBytes("ISO-8859-1"),"UTF-8"));
        StudentDao dao = new StudentDao ();
        dao.updateStudent (student);
        req.getRequestDispatcher("ShowStudentServlet").forward(req, resp);
    }
}
