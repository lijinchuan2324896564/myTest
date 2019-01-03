<%--
  Created by IntelliJ IDEA.
  User: 23248
  Date: 2018/9/6
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>修改</title>
    <link rel="stylesheet" href="css/index.css" type="text/css" />
</head>

<body style="background-color: #a0d7ed">
    <div style="width: 350px;height: 400px; border:5px solid #fff5fd;margin-left: 37%">
        <form action="UpdateServlet" method="post" style="text-align: center;">
                <h3 style="text-align: center;margin-top: 30%">修改管理员信息</h3><br>
            编号:<input  type="text" name="id" value="${admin.id}" readonly="readonly"/><br>
            帐号:<input  type="text" name="username"/><br>
            密码:<input  type="text" name="userpwd"/><br>
                <input  type="submit" value="提交"/>
                <input   type="button" value="返回"onclick="history.go(-1)"/>
        </form>
    </div>
</body>
</html>

