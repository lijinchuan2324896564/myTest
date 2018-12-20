<%--
  Created by IntelliJ IDEA.
  User: 23248
  Date: 2018/10/10
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-image:url(images/w4.jpg);background-size: 1869px 730px">
<div>
    <div style="width: 350px;height: 220px; border:1px solid #fff5fd;margin-left: 37%;margin-top: 10%">
        <form mothod="post" action="LoginServlet" style="text-align: center;padding-top: 20px ">
            <td>
                <h2>管理员登录</h2>
            </td>
            账号:
            <input type="text" name="username"><br>
            密码:
            <input type="password" name="password"><br>
            <input type="submit" value="提交" >
            <input type="reset" value="重置" style="margin-top: 5px">
        </form>
    </div>
</div>
</body>
</html>
