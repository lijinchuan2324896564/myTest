package com.web.tom.signServlet;

import com.web.tom.dao.SignDao;
import com.web.tom.entity.Sign;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowSignServlet")
public class ShowSignServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        SignDao dao = new SignDao ();
        List<Sign> list = dao.getAllSign ();
        req.setAttribute("list", list);
        req.getRequestDispatcher("SignSee.jsp").forward(req, resp);
    }
}
