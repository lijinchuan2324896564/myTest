<%@ page import="com.web.tom.dao.AdminDao" %>
<%@ page import="java.awt.*" %><%--
  Created by IntelliJ IDEA.
  User: 23248
  Date: 2018/9/6
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>显示</title>
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
    <h3 style="text-align: center">管理员信息</h3>
    <table>
        <tr>
            <td>编号</td>
            <td>帐号</td>
            <td>密码</td>
        </tr>
        <c:forEach items="${list}" var="item">
            <tr>
                <td>${item.id }</td>
                <td>${item.username }</td>
                <td>${item.userpwd }</td>
                <td><a href="DeleteServlet?id=${item.id }">删除</a>|<a href="UpdateServlet?id=${item.id }">修改</a></td>
            </tr>
        </c:forEach>
        <tr>
            <td style="text-align: left;"><a href="add.jsp">添加管理员</a></td>
            <td style="text-align: left;"><a href="Select.jsp">详细查询</a></td>
        </tr>
    </table>
</body>
</html>
