<%@ page import="model.Car" %><%--
  Created by IntelliJ IDEA.
  User: chmir
  Date: 27.11.2019
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Cars Form</title>
</head>
<body>
<jsp:include page="navigator.jsp"/>
<h1>What is your car?</h1>

<%
    Car car = null;
    if (request.getAttribute("car") != null) {
        car = (Car) request.getAttribute("car");
    }
%>

<form action="/car-add" method="post">
    <input type="hidden" name="id" value="${requestScope.car.getId()}">
    CarBrand: <select name="brand">
    <c:forEach var="brand" items="${requestScope.brands}">
        <option value="${brand}" ${brand == requestScope.car.getCarBrand() ? "selected" : ""} >${brand}</option>
    </c:forEach>
</select><br/>
    License plate: <input type="text" name="licenseplate" value="<%= car != null ? car.getLicensePlate() : "" %>"/><br/>
    LastName: <input type="text" name="lastname" value="<%= car != null ? car.getLastName() : "" %>"/><br/>
    Yearbook: <input type="number" min="1990" max="2019" name="yearbook" value="<%= car != null ? car.getYearbook() : "1990" %>"/><br/>
    Interval: <input type="number" name="interval" value="<%= car != null ? car.getInterval() : "0" %>"/><br/>
    <input type="submit"/>
</form>

</body>
</html>
