<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--Daje nam możliwość obsługi wpisów "${}" w kodzie. Bez tego nie możemy używać tej notacji i wszystkie użycia wypiszą pusty tekst--%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Repair List</title>
    <style>
        td{
            border: 1px solid #000;
        }
    </style>
</head>
<body>
<jsp:include page="navigator.jsp"/>
<h1>Repairs Order List</h1>
<table style="border: 1px solid #000; width: 100%">
    <tr>
        <th>Lp.</th>
        <th>Id</th>
        <th>Descrption</th>
        <th>Is urgence?</th>
        <th>Date added</th>
        <th>Date added</th>
        <th></th>
        <th></th>
    </tr>
    <c:forEach var="repairOrder" items="${requestScope.orders}" varStatus="loop">
        <tr>
            <td>${loop.index}</td>
            <td>${repairOrder.getId()}</td>
            <td>${repairOrder.getDescription()}</td>
            <td>${repairOrder.isUrgence()}</td>
            <td>${repairOrder.getDateAdded()}</td>
            <td>${repairOrder.getDateTaken()}</td>
<%--            <td>
&lt;%&ndash;                <a href="/grade-remove?gradeId=${grade.getId()}">Usun</a>
            </td>
            <td>
                <a href="/grade-edit?gradeId=${grade.getId()}">Edit</a>&ndash;%&gt;
            </td>--%>
        </tr>
    </c:forEach>

</table>

<c:if test="">

</c:if>
</body>
</html>
