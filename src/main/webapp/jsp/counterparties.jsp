<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список контрагентів</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/counterparties.css">
    <script src="${pageContext.request.contextPath}/js/counterparties.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Контрагенти</h1>
        <input type="text" class="main-content-search" placeholder="Пошук контрагентів">
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th">Тип</th>
                <th class="table-th">Ім'я</th>
                <th class="table-th">Прізвище</th>
                <th class="table-th">По-батькові</th>
                <th class="table-th">Ідентифікаційний номер</th>
            </tr>
            <c:forEach var="counterparty" items="${counterparties}">
                <tr class="table-row table-td-row">
                    <td class="table-td">
                        <c:choose>
                            <c:when test="${counterparty.counterpartyType.equals('natural_person')}">Фізична особа</c:when>
                            <c:when test="${counterparty.counterpartyType.equals('state')}">Держава</c:when>
                            <c:when test="${counterparty.counterpartyType.equals('legal_person')}">Юридична особа</c:when>
                            <c:when test="${counterparty.counterpartyType == null}">-</c:when>
                        </c:choose>
                    </td>
                    <td class="table-td name-cell" style="display: none;">${counterparty.firstName} ${counterpartylastName} ${counterparty.middleName}</td>
                    <td class="table-td">
                        <a href="/counterparties/${counterparty.id}" class="table-link">${counterparty.firstName}</a>
                    </td>
                    <td class="table-td">
                        <a href="/counterparties/${counterparty.id}" class="table-link">${counterparty.lastName}</a>
                    </td>
                    <td class="table-td">
                        <a href="/counterparties/${counterparty.id}" class="table-link">${counterparty.middleName}</a>
                    </td>
                    <td class="table-td">
                        <c:if test="${counterparty.identificationCode == null}">
                            -
                        </c:if>
                        <c:if test="${counterparty.identificationCode == null}">
                            ${counterparty.identificationCode}
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