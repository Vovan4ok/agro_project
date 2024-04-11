<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список обладнання</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/implements.css">
    <script src="${pageContext.request.contextPath}/js/implements.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Обладнання</h1>
        <input type="text" class="main-content-search" placeholder="Пошук обладнання">
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
                        <a href="/implements/${mapping_item.implement.id}" class="table-link">${mapping_item.implement.name}</a>
                    </td>
                    <td class="table-td">${mapping_item.implement.manufacturer}</td>
                    <td class="table-td">${mapping_item.implement.model}</td>
                    <td class="table-td">${mapping_item.machineRegion.name}</td>
                    <td class="table-td">
                        <c:if test="${mapping_item.implement.registrationNumber == null}">
                            -
                        </c:if>
                        <c:if test="">
                            ${mapping_item.implement.registrationNumber}
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