<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11/21/20
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorization</title>
</head>
<body>
    <a href="${pageContext.request.contextPath}/images?token=${token}">Image List</a>
</body>
</html>
