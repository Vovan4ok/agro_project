<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список складів</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/warehouses.css">
    <script src="${pageContext.request.contextPath}/js/warehouses.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Склади</h1>
        <input type="text" class="main-content-search" placeholder="Пошук складів">
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th"># складу</th>
                <th class="table-th">Назва</th>
                <th class="table-th">Група</th>
            </tr>
            <c:forEach var="warehouse" items="${warehouses}">
                <tr class="table-row table-td-row">
                    <td class="table-td">${warehouse.id}</td>
                    <td class="table-td">
                        <a href="/warehouses/${warehouse.id}" class="table-link">${warehouse.name}</a>
                    </td>
                    <td class="table-td">
                        <c:if test="${warehouse.warehouseGroup != null}">
                            ${warehouse.warehouseGroup.name}
                        </c:if>
                        <c:if test="${warehouse.warehouseGroup == null}">
                            -
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>