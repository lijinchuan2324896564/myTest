package com.web.tom.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.web.tom.dao.AdminDao;
import com.web.tom.entity.Admin;

public class UpdateServlet extends HttpServlet{  //修改

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { // 查询到选中ID的值所对应的数据
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String idStr = req.getParameter("id");
        if (idStr != null && !idStr.equals("")) {
            int id = Integer.valueOf(idStr);
            AdminDao dao = new AdminDao();
            Admin admin = dao.selectAdminById(id);
            req.setAttribute("admin", admin);
        }
        req.getRequestDispatcher("update.jsp").forward(req, resp);

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {  //根据此ID对数据的值进行修改
        String username = req.getParameter("username");
        String userpwd = req.getParameter("userpwd");
        String idStr = req.getParameter("id");
        Admin admin = new Admin();
        admin.setId(Integer.valueOf(idStr));
        admin.setUsername(new String(username.getBytes("ISO-8859-1"),"UTF-8"));
        admin.setUserpwd(new String(userpwd.getBytes("ISO-8859-1"),"UTF-8"));
        AdminDao dao = new AdminDao();
        dao.updateAdmin(admin);
        req.getRequestDispatcher("ShowServlet").forward(req, resp);
    }



}
