<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список об'єктів</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/additional_objects.css">
    <script src="${pageContext.request.contextPath}/js/additional_objects.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Об'єкти</h1>
        <input type="text" class="main-content-search" placeholder="Пошук об'єктів">
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th">Назва</th>
                <th class="table-th">Група полів</th>
                <th class="table-th">Тип об'єкта</th>
                <th class="table-th">Розрахункова площа, га</th>
                <th class="table-th">Точка широти</th>
                <th class="table-th">Точка довготи</th>
            </tr>
            <c:forEach var="additional_object" items="${additional_objects}">
                <tr class="table-row table-td-row">
                    <td class="table-td">${additional_object.name}</td>
                    <td class="table-td">${additional_object.fieldGroup.name}</td>
                    <td class="table-td">
                        <c:choose>
                            <c:when test="${additional_object.objectType.equals('Весовая')}">Вагова</c:when>
                            <c:when test="${additional_object.objectType.equals('Дорога')}">Дорога</c:when>
                            <c:when test="${additional_object.objectType == null}">-</c:when>
                        </c:choose>
                    </td>
                    <td class="table-td">${additional_object.calculatedArea}</td>
                    <td class="table-td">${additional_object.pointLat}</td>
                    <td class="table-td">${additional_object.pointLon}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>