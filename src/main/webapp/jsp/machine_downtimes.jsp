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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/machine_downtimes.css">
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
                <a href="/machines/${machine.id}/downtimes" class="field-menu-link" style="font-weight: bold;">Зупинки</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/weighings" class="field-menu-link">Зважування</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/regions" class="field-menu-link">Регіон</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/photos" class="field-menu-link">Фото</a>
            </li>
        </ul>
        <div class="content-info">
            <h1 class="content-header">Історія зупинок</h1>
            <table class="main-table">
                <tr class="table-row">
                    <th class="table-th type-cell">Тип зупинки</th>
                    <th class="table-th start-cell">Початок<br>зупинки</th>
                    <th class="table-th end-cell">Кінець<br>зупинки</th>
                    <th class="table-th status-cell">Пробіг,<br>км</th>
                    <th class="table-th long-cell">Точка<br>довготи</th>
                    <th class="table-th lat-cell">Точка<br>широти</th>
                </tr>
                <c:forEach var="downtime" items="${downtimes}">
                    <tr class="table-row">
                        <td class="table-td type-cell">
                            <c:if test="${downtime.machineDowntimeType != null}">
                                ${downtime.machineDowntimeType.machineDowntimeTypeGroup.name}/${downtime.machineDowntimeType.name}
                            </c:if>
                            <c:if test="${downtime.machineDowntimeType == null}">
                                -
                            </c:if>
                        </td>
                        <td class="table-td start-cell">${downtime.startTime}</td>
                        <td class="table-td end-cell">${downtime.endTime}</td>
                        <td class="table-td status-cell">${downtime.status}</td>
                        <td class="table-td long-cell">${downtime.pointLon}</td>
                        <td class="table-td lat-cell">${downtime.pointLat}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>