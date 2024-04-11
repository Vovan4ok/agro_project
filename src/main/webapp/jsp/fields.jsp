<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список полів</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/fields.css">
    <script src="${pageContext.request.contextPath}/js/fields.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Поля</h1>
        <input type="text" class="main-content-search" placeholder="Пошук поля" />
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th field-cell">Поле</th>
                <th class="table-th country-cell">Країна</th>
                <th class="table-th region-cell">Область</th>
                <th class="table-th district-cell">Район</th>
                <th class="table-th group-cell">Назва групи</th>
            </tr>
            <c:forEach var="field" items="${fields}">
                <tr class="table-row table-td-row">
                    <td class="table-td field-cell">
                        <a href="/fields/${field.id}" class="field-link">${field.name}</a>
                    </td>
                    <td class="table-td country-cell">${field.country.name}</td>
                    <td class="table-td region-cell">${field.region.name}</td>
                    <td class="table-td district-cell">${field.district.name}</td>
                    <td class="table-td group-cell">${field.fieldGroup.name}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>