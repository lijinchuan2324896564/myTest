<%--
  Created by IntelliJ IDEA.
  User: 23248
  Date: 2018/11/29
  Time: 15:02
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
    <form action="UpdateStudentServlet" method="post" style="text-align: center;">
        <h3 style="text-align: center;margin-top: 30%">修改成员信息</h3><br>
        学号:<input  type="text" name="stNumber" value="${student.stNumber}" readonly="readonly"/><br>
        姓名:<input  type="text" name="name"/><br>
        专业:<input  type="text" name="major"/><br>
        <input  type="submit" value="提交"/>
        <input   type="button" value="返回"onclick="history.go(-1)"/>
    </form>
</div>
</body>
</html>
