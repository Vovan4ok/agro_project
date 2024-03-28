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
    <link rel="stylesheet" href="../../styles/machine_alerts.css">
    <script src="../../js/machine_alerts.js"></script>
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
                <a href="/machines/${machine.id}/alerts" class="field-menu-link" style="font-weight: bold;">Тривоги</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/maintenances" class="field-menu-link">Обслуговування</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/downtimes" class="field-menu-link">Зупинки</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/weighings" class="field-menu-link">Зважування</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/regions" class="field-menu-link">Регіон</a>
            </li>
        </ul>
        <div class="content-info">
            <h1 class="content-header">Тривоги</h1>
            <input type="text" class="main-content-search" placeholder="Пошук тривог">
            <table class="main-table">
                <tr class="table-row">
                    <th class="table-th alert-cell">Тривога</th>
                    <th class="table-th create-alert-cell">Створення тривоги -<br>Закриття тривоги</th>
                    <th class="table-th start-alert-cell">Початок тривоги - <br>Кінець тривоги</th>
                    <th class="table-th responsible-alert-cell">Відповідальна особа</th>
                    <th class="table-th description-alert-cell">Опис тривоги</th>
                </tr>
                <c:forEach var="alert" items="${alerts}">
                    <tr class="table-row table-td-row">
                        <td class="table-td alert-cell">
                            <a href="/machines/${machine.id}/alerts/${alert.id}" class="alert-link">${alert.id}</a>
                        </td>
                        <td class="table-td create-alert-cell">${alert.createdAt} - <c:if test="${alert.alertClosedAt == null}">тривога відкрита</c:if><c:if test="${alert.alertClosedAt == null}">${alert.alertClosedAt}</c:if></td>
                        <td class="table-td start-alert-cell">${alert.eventStartTime} - <c:if test="${alert.eventStopTime == null}">тривога відкрита</c:if><c:if test="${alert.eventStopTime == null}">${alert.eventStopTime}</c:if></td>
                        <td class="table-td responsible-alert-cell">
                            <c:if test="${alert.responsiblePerson != null}">
                                <a href="/users/${alert.responsiblePerson.id}" class="username">${alert.responsiblePerson.username}</a>
                            </c:if>
                            <c:if test="${alert.responsiblePerson == null}">
                                -
                            </c:if>
                        </td>
                        <td class="table-td description-alert-cell">
                            <c:if test="${alert.description != null}">
                                ${alert.description}
                            </c:if>
                            <c:if test="${alert.responsiblePerson == null}">
                                -
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