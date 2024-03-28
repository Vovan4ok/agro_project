<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${machine.name}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap"
          rel="stylesheet">
    <link rel="stylesheet" href="../../styles/machine_weighings.css">
    <script src="../../js/season_filter.js"></script>
</head>

<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${machine.name}</h1>
        <span class="field-group">${machine.manufacturer} ${machine.model}</span>
    </div>
    <div class="main-content">
        <ul class="field-menu">
            <li class="field-menu-item">
                <a href="/machines/${machine.id}" class="field-menu-link">Інформація про машину</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/notes" class="field-menu-link">Нотатки</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/tasks" class="field-menu-link">Завдання</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/alerts" class="field-menu-link">Тривоги</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/maintenances" class="field-menu-link">Обслуговування</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/downtimes" class="field-menu-link">Зупинки</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/weighings" class="field-menu-link" style="font-weight: bold;">Зважування</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/regions" class="field-menu-link">Регіон</a>
            </li>
        </ul>
        <div class="content-info">
            <h1 class="content-header">Історія зважувань</h1>
            <table class="main-table">
                <tr class="table-row">
                    <th class="table-th time-cell">Час зважування</th>
                    <th class="table-th field-cell">Урожай з поля</th>
                    <th class="table-th place-cell">Місце зважування</th>
                    <th class="table-th weight-cell">Вага(нетто),
                        кг</th>
                    <th class="table-th number-ttn-cell">Номер ТТН</th>
                    <th class="table-th date-ttn-cell">Дата ТТН</th>
                </tr>
                <c:forEach var="weighing" items="${weighings}">
                    <tr class="table-row">
                        <td class="table-td time-cell">
                            <a href="/machines/${machine.id}/weighings/${weighing.id}" class="table-link">${weighing.weighingTime}</a>
                        </td>
                        <td class="table-td field-cell">
                            <c:if test="${weighing.field == null}">
                                -
                            </c:if>
                            <c:if test="${weighing.field != null}">
                                <a href="/field/${weighing.field.id}" class="table-link">${weighing.field.name}</a>
                            </c:if>
                        </td>
                        <td class="table-td place-cell">
                            <c:if test="${weighing.weighingplace == null}">
                                -
                            </c:if>
                            <c:if test="${weighing.weighingplace != null}">
                                <a href="/additional_objects/${weighing.weighingplace.id}" class="table-link">${weighing.weighingplace.name}</a>
                            </c:if>
                        </td>
                        <td class="table-td weight-cell">
                            ${weighing.weight}
                        </td>
                        <td class="table-td number-ttn-cell">
                            <c:if test="${weighing.waybillNumber == null}">
                                -
                            </c:if>
                            <c:if test="${weighing.waybillNumber != null}">
                                ${weighing.waybillNumber}
                            </c:if>
                        </td>
                        <td class="table-td date-ttn-cell">
                            <c:if test="${weighing.waybillDate == null}">
                                -
                            </c:if>
                            <c:if test="${weighing.waybillDate != null}">
                                ${weighing.waybillDate}
                            </c:if>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>