<%--
  Created by IntelliJ IDEA.
  User: 23248
  Date: 2018/11/29
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Studnet显示</title>
    <style type="text/css">
        table {
            border: 1px solid #7596ff;
            margin: 0 auto;
        }

        td{
            width: 150px;
            border: 1px solid #2fd1ff;
            text-align: center;
        }
    </style>
</head>
<body style="background-color: #a0d7ed">
<h3 style="text-align: center">学生信息</h3>
<table>
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>专业</td>
    </tr>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.stNumber }</td>
            <td>${item.name }</td>
            <td>${item.major }</td>
            <td><a href="DeleteStudentServlet?stNumber=${item.stNumber }">删除</a>|<a href="UpdateStudentServlet?stNumber=${item.stNumber }">修改</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td style="text-align: left;"><a href="addSt.jsp">添加成员</a></td>
        <td style="text-align: left;"><a href="SelectSt.jsp">详细查询</a></td>
        <td style="text-align: left;"><a href="ShowSignServlet">查看签到记录</a></td>
        <td style="text-align: left;"><a href="ShowSTSignServlet">返回签到</a></td>
    </tr>
</table>
</body>
</html>
