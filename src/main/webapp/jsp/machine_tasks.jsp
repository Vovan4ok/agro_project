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
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/machine_tasks.css">
    <script src="${pageContext.request.contextPath}/js/machine_tasks.js"></script>
    <script src="${pageContext.request.contextPath}/js/season_filter.js"></script>
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
                <a href="/machines/${machine.id}/tasks" class="field-menu-link" style="font-weight: bold;">Завдання</a>
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
            <h2 class="content-header">Завдання</h2>
            <input type="text" placeholder="Пошук завдань" class="main-content-search">
            <table class="main-table">
                <tr class="table-row">
                    <th class="table-th work-type-cell">Вид робіт</th>
                    <th class="table-th time-cell">Терміни</th>
                    <th class="table-th implement-cell">Обладнання</th>
                    <th class="table-th distance-cell">Оброблена площа, га</th>
                    <th class="table-th fuel-cell">Витрата палива, л</th>
                </tr>
                <c:forEach var="machine_task_dto" items="${machine_tasks_dtos}">
                    <tr class="table-row table-td-row">
                        <td class="table-td work-type-cell">
                            <a href="/machines/${machine.id}/tasks/${machine_task_dto.machineTask.id}" class="table-link">${machine_task_dto.machineTask.workType.workTypeGroup.name}/${machine_task_dto.machineTask.workType.name}<br>${machine_task_dto.machineTask.id}</a>
                        </td>
                        <td class="table-td time-cell">${machine_task_dto.machineTask.startTime} -<br>
                            ${machine_task_dto.machineTask.endTime}</td>
                        <td class="table-td implement-cell">
                            <c:if test="${machine_task_dto.implement == null}">
                                -
                            </c:if>
                            <c:if test="${machine_task_dto.implement != null}">
                                <a href="/implements/${machine_task_dto.implement.id}" class="table-link">${machine_task_dto.implement.name}</a>
                            </c:if>
                        </td>
                        <td class="table-td distance-cell">
                            ${machine_task_dto.machineTask.coveredArea}
                        </td>
                        <td class="table-td fuel-cell">
                            ${machine_task_dto.machineTask.fuelConsumption}
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