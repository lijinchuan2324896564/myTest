package com.web.tom.signServlet;

import com.web.tom.dao.SignDao;
import com.web.tom.entity.Sign;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

@WebServlet(name = "AddSignServlet")
public class AddSignServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        Sign sign = new Sign ();
//        sign.setId (Integer.parseInt (req.getParameter("id")));
        sign.setName (req.getParameter("name"));
        sign.setStNumber (Integer.parseInt (req.getParameter("stNumber")));
        Date date = new Date();
        SimpleDateFormat df =new SimpleDateFormat ("yyyy-MM-dd");
        String formatDate=df.format (date);
        sign.setDate(String.valueOf (formatDate));
        SignDao dao = new SignDao ();
        System.out.print (String.valueOf (formatDate));
        dao.addSign (sign);
        req.getRequestDispatcher("success.jsp").forward(req, resp);
    }
}
