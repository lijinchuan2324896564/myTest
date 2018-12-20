package com.web.tom.studentServlet;

import com.web.tom.dao.StudentDao;
import com.web.tom.entity.Student;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SelectNameServlet")
public class SelectNameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String name=req.getParameter("name");
//        System.out.print (req.getParameter("name"));
        StudentDao dao = new StudentDao ();
        Student student = dao.selectStudentByname (name);
        req.setAttribute ("stNumber",student.getStNumber ());
        req.setAttribute ("name",student.getName ());
        req.setAttribute ("major",student.getMajor ());
        req.setAttribute("student", student);
//        System.out.print (student.getName ());
        req.getRequestDispatcher("/AcceptSt.jsp").forward(req, resp);
    }
}
