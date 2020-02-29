<%@ page import="model.RepairOrder" %><%--
  Created by IntelliJ IDEA.
  User: chmir
  Date: 29.11.2019
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Repair Form</title>
</head>
<body>
<jsp:include page="navigator.jsp"/>
<h1>What is your repair?</h1>

<%
    RepairOrder repairOrder = null;
    if (request.getAttribute("repair") != null) {
        repairOrder = (RepairOrder) request.getAttribute("repair");
    }
%>

<form action="/repair-add" method="post">
    <input type="hidden" name="id" value="${requestScope.repairOrder.getId}">
    Descrition: <input type="text" name="description" value="<%= repairOrder != null ? repairOrder.getDescription() : "" %>"/><br/>
    Is ugrence ?: <input type="checkbox" name="urgence" <%= repairOrder != null && repairOrder.isUrgence() ? "checked" : ""%>/><br/><br/>
    <input type="submit"/>
</form>

</body>
</html>
