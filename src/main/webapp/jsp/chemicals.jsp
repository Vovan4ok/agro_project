<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список засобів захисту рослин</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../styles/chemicals.css">
    <script src="../js/chemicals.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Засоби захисту рослин</h1>
        <input type="text" class="main-content-search" placeholder="Пошук засобів захисту рослин">
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th">Назва</th>
                <th class="table-th">Тип</th>
                <th class="table-th">Додаткова інформація</th>
            </tr>
            <c:forEach var="chemical" items="${chemicals}">
                <tr class="table-row table-td-row">
                    <td class="table-td">
                        <a href="/chemicals/${chemical.id}" class="table-link">${chemical.name}</a>
                    </td>
                    <td class="table-td">
                        <c:choose>
                            <c:when test="${chemical.chemicalType.equals('adjuvant')}">Ад'ювант</c:when>
                            <c:when test="${chemical.chemicalType.equals('biological_supplements')}">Біологічна добавка</c:when>
                            <c:when test="${chemical.chemicalType.equals('defoliants_desiccants')}">Дефоліанти десиканти</c:when>
                            <c:when test="${chemical.chemicalType.equals('fungicide')}">Фунгіцид</c:when>
                            <c:when test="${chemical.chemicalType.equals('growth_regulator')}">Регулятор росту</c:when>
                            <c:when test="${chemical.chemicalType.equals('herbicide')}">Гербіцид</c:when>
                            <c:when test="${chemical.chemicalType.equals('insecticide')}">Інсектицид</c:when>
                            <c:when test="${chemical.chemicalType.equals('microbiological_agent')}">Мікробіологічний засіб</c:when>
                            <c:when test="${chemical.chemicalType.equals('nematicides')}">Нематицид</c:when>
                            <c:when test="${chemical.chemicalType.equals('nutrients')}">Поживна речовина</c:when>
                            <c:when test="${chemical.chemicalType.equals('other')}">Інше</c:when>
                            <c:when test="${chemical.chemicalType.equals('rodenticide')}">Родентицид</c:when>
                            <c:when test="${chemical.chemicalType.equals('seed_treatment')}">Обробка насіння</c:when>
                        </c:choose>
                    </td>
                    <td class="table-td">
                        <c:if test="${chemical.additionalInfo == null}">
                            -
                        </c:if>
                        <c:if test="${chemical.additionalInfo != null}">
                            ${chemical.additionalInfo}
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