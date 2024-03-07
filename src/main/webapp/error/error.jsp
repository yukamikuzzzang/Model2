<%--
  Created by IntelliJ IDEA.
  User: FAMILY
  Date: 2024-03-07
  Time: PM 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<section>
    <h1><%= request.getParameter("error")%></h1>
    <a href="javascript:history.back()">이전 페이지로 돌아가기</a>
</section>

</body>
</html>
