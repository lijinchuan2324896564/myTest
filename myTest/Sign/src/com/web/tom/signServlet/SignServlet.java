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

@WebServlet(name = "SignServlet")
public class SignServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name= req.getParameter ("name");
        String stNumber=req.getParameter ("stNumber");
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        Sign sign=new Sign();
        sign.setStNumber (Integer.parseInt (stNumber));
        sign.setName (name);
        SignDao dao = new SignDao ();
        List<Sign> list = dao.selectSign (sign);
        req.setAttribute("list", list);
        System.out.print (list);
        System.out.print ("湿哒哒");
        req.getRequestDispatcher("SignJSP.jsp").forward(req, resp);
    }
}
