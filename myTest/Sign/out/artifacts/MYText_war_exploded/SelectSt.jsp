<%--
  Created by IntelliJ IDEA.
  User: 23248
  Date: 2018/11/29
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-color: #a0d7ed">
<div style="width: 350px;height: 530px; border:5px solid #fff5fd;margin-left: 37%">
    <form action="SelectStNumberServlet" method="post" style="text-align: center">
        <h3 style="text-align: center;margin-top: 30%">请输入学号:</h3><br>
        <input type="text" name="stNumber"><br>
        <input type="submit" value="确定"><input  type="button" value="返回"onclick="history.go(-1)">
    </form>

    <form action="SelectNameServlet" method="post" style="text-align: center">
        <h3 style="text-align: center;margin-top: 30%">请输入姓名:</h3><br>
        <input type="text" name="name"><br>
        <input type="submit" value="确定"><input  type="button" value="返回"onclick="history.go(-1)">
    </form>
</div>
</body>
</html>
