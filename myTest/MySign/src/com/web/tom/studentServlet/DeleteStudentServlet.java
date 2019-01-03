package com.web.tom.studentServlet;

import com.web.tom.dao.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String idStr = req.getParameter("stNumber");
        if (idStr != null && !idStr.equals("")) {
            int stNumber = Integer.valueOf(idStr);
            StudentDao stdao = new StudentDao ();
            stdao.deleteStudent (stNumber);
            }
            req.getRequestDispatcher("ShowStudentServlet").forward(req, resp);
    }
}
