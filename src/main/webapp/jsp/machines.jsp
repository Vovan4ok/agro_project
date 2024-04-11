<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список машин</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/machines.css">
    <script src="${pageContext.request.contextPath}/js/machines.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Машини</h1>
        <input type="text" class="main-content-search" placeholder="Пошук машин">
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th">Назва</th>
                <th class="table-th">Виробник</th>
                <th class="table-th">Модель</th>
                <th class="table-th">Регіон</th>
                <th class="table-th">Реєстраційний номер</th>
            </tr>
            <c:forEach var="mapping_item" items="${mapping_items}">
                <tr class="table-row table-td-row">
                    <td class="table-td">
                        <a href="/machines/${mapping_item.machine.id}">${mapping_item.machine.name}</a>
                    </td>
                    <td class="table-td">${mapping_item.machine.manufacturer}</td>
                    <td class="table-td">${mapping_item.machine.model}</td>
                    <td class="table-td">${mapping_item.machineRegion.name}</td>
                    <td class="table-td">
                        <c:if test="${mapping_item.machine.registrationNumber != null}">
                            ${mapping_item.machine.registrationNumber}
                        </c:if>
                        <c:if test="${mapping_item.machine.registrationNumber == null}">
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