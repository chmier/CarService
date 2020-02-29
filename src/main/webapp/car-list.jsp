<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 11/23/19
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--Daje nam możliwość obsługi wpisów "${}" w kodzie. Bez tego nie możemy używać tej notacji i wszystkie użycia wypiszą pusty tekst--%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Student List</title>
    <style>
        td{
            border: 1px solid #000;
        }
    </style>
</head>
<body>
<jsp:include page="navigator.jsp"/>
<h1>Car List</h1>
<%--for(Student student : students) --%>

<table style="border: 1px solid #000; width: 100%">
    <tr>

        <th> Id </th>
        <th> CarBrand </th>
        <th> LicensePlate </th>
        <th> LastName </th>
        <th> Yearbook </th>
        <th> Interval </th>
        <th></th>
        <th></th>
    </tr>

    <c:forEach var="car" items="${requestScope.cars}" varStatus="loop">
        <tr>
            <td>${car.getId()}</td>
            <td>${car.getCarBrand()}</td>
            <td>${car.getLicensePlate()}</td>
            <td>${car.getLastName()}</td>
            <td>${car.getYearbook()}</td>
            <td>${car.getInterval()}</td>
        <td>
                <a href="/car-remove?idNumber=${car.getId()}">Usun</a>
            </td>
            <%--<td>
                <a href="/student-edit?indexNumber=${student.getIndexNumber()}">Edit</a>
            </td>--%>
        </tr>
    </c:forEach>

</table>

<c:if test="">

</c:if>
</body>
</html>
