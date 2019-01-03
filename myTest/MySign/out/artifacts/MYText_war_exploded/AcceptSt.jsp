<%--
  Created by IntelliJ IDEA.
  User: 23248
  Date: 2018/11/29
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-color: #a0d7ed">
<div style="width: 350px;height: 220px; border:5px solid #fff5fd;margin-left: 37%;margin-top: 10%">
    <div style="text-align: center;margin-top: 10%">
        <th><%=(int)request.getAttribute( "stNumber")%></th>
        <th><%=(String)request.getAttribute( "name")%></th>
        <th><%=(String)request.getAttribute( "major")%></th>
        <a href="ShowStudentServlet" style="text-align: center">返回</a>
    </div>
</div>
</body>
</html>
