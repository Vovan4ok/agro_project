<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${implement.name}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../../styles/implement_tasks.css">
    <script src="../../js/implement_tasks.js"></script>
    <script src="../../js/season_filter.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${implement.name}</h1>
        <span class="field-group">${implement.manufacturer} ${implement.model}</span>
    </div>
    <div class="main-content">
        <ul class="field-menu">
            <li class="field-menu-item">
                <a href="/implements/${implement.id}" class="field-menu-link">Інформація про обладнання</a>
            </li>
            <li class="field-menu-item">
                <a href="/implements/${implement.id}/notes" class="field-menu-link">Нотатки</a>
            </li>
            <li class="field-menu-item">
                <a href="/implements/${implement.id}/tasks" class="field-menu-link" style="font-weight: bold;">Завдання</a>
            </li>
            <li class="field-menu-item">
                <a href="/implements/${implement.id}/alerts" class="field-menu-link">Тривоги</a>
            </li>
            <li class="field-menu-item">
                <a href="/implements/${implement.id}/maintenances" class="field-menu-link">Обслуговування</a>
            </li>
            <li class="field-menu-item">
                <a href="/implements/${implement.id}/regions" class="field-menu-link">Регіон</a>
            </li>
        </ul>
        <div class="content-info">
            <h2 class="content-header">Завдання</h2>
            <input type="text" placeholder="Пошук завдань" class="main-content-search">
            <table class="main-table">
                <tr class="table-row">
                    <th class="table-th work-type-cell">Завдання машини</th>
                    <th class="table-th time-cell">Терміни</th>
                    <th class="table-th implement-cell">Машина</th>
                    <th class="table-th distance-cell">Водій</th>
                    <th class="table-th fuel-cell">Сезон</th>
                </tr>
                <c:forEach var="machine_task" items="${machine_tasks}">
                    <tr class="table-row table-td-row">
                        <td class="table-td work-type-cell">
                            <a href="/machines/${machine_task.machine.id}/tasks/${machine_task.id}" class="table-link">${machine_task.workType.workTypeGroup.name}/${machine_task.workType.name}<br>${machine_task.id}</a>
                        </td>
                        <td class="table-td time-cell">${machine_task.startTime} -<br>${machine_task.endTime}</td>
                        <td class="table-td machine-cell">
                            <a href="/machines/${machine_task.machine.id}" class="table-link">${machine_task.machine.name}</a>
                        </td>
                        <td class="table-td driver-cell">
                            <c:if test="${machine_task.driver == null}">
                                -
                            </c:if>
                            <c:if test="${machine_task.driver != null}">
                                <a href="/users/${machine_task.driver.id}" class="table-link">${machine_task.driver.username}</a>
                            </c:if>
                        </td>
                        <td class="table-td season-cell">${machine_task.season}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>