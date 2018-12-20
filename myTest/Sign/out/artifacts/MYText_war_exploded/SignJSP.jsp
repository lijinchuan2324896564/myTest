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
    <title>Sign记录</title>
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
<h3 style="text-align: center">数据显示</h3>
<table>
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>日期</td>
    </tr>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.stNumber }</td>
            <td>${item.name }</td>
            <td>${item.date }</td>
        </tr>
    </c:forEach>
    <tr>
        <td style="text-align: left;"><a href="ShowSignServlet">返回</a></td>
    </tr>
</table>

</body>
</html>
