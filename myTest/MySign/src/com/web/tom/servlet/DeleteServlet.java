package com.web.tom.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.web.tom.dao.AdminDao;

public class DeleteServlet extends HttpServlet { // 删除数据

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String idStr = req.getParameter("id");
        if (idStr != null && !idStr.equals("")) {
            int id = Integer.valueOf(idStr);
            AdminDao dao = new AdminDao();
            dao.deleteAdmin(id);
        }
        req.getRequestDispatcher("ShowServlet").forward(req, resp);
    }

}
