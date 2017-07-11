<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/4
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
success!!!!!111
   ${requestScope.testdata}<br>
姓名:${user.userName}<br>
年龄:${user.age}<br>
地址:${user.address}<br>
性别:${user.sex}<br>

map ${username}--${sex}


</body>
</html>
