<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${field.name}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../../styles/field_machine_tasks.css">
    <script src="../../js/field_machine_tasks.js"></script>
    <script src="../../js/season_filter.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${field.name}</h1>
        <span class="field-group">${field.fieldGroup.groupFolder.parent.name}/${field.fieldGroup.groupFolder.name}/${field.fieldGroup.name}</span>
    </div>
    <div class="main-content">
        <ul class="field-menu">
            <li class="field-menu-item">
                <a href="/fields/${field.id}" class="field-menu-link" >Інформація про поле</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/agro_operations" class="field-menu-link">Агрооперації</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/machine_tasks" class="field-menu-link" style="font-weight: bold;">Роботи машин</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/scouting_tasks" class="field-menu-link">Завдання на огляд</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/scout_reports" class="field-menu-link">Звіти оглядів</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/shape_land_parcels" class="field-menu-link">Площа поля та ділянки</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/notes" class="field-menu-link">Нотатки</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/alerts" class="field-menu-link">Тривоги</a>
            </li>
        </ul>
        <div class="content-info">
            <h2 class="content-header">Роботи машин</h2>
            <input type="text" placeholder="Пошук робіт машин" class="main-content-search">
            <table class="main-table">
                <tr class="table-row">
                    <th class="table-th work-type-cell">Вид робіт</th>
                    <th class="table-th machine-cell">Машина</th>
                    <th class="table-th implement-cell">Обладнання</th>
                    <th class="table-th shape1-cell">Оброблена площа, га</th>
                    <th class="table-th shape2-cell">Витрата палива, л</th>
                </tr>
                <c:forEach var="machine_task_dto" items="${machine_tasks_dtos}">
                    <tr class="table-row table-td-row">
                        <td class="table-td work-type-cell">
                            <a href="/machines/${machine_task_dto.machineTask.machine.id}/tasks/${machine_task_dto.machineTask.id}" class="table-link">${machine_task_dto.machineTask.id} ${machine_task_dto.machineTask.workType.name}/${machine_task_dto.machineTask.workType.workTypeGroup.name}</a>
                            <p class="date-start">${machine_task_dto.machineTask.startTime} -</p>
                            <p class="date-end">${machine_task_dto.machineTask.endTime}</p>
                        </td>
                        <td class="table-td machine-cell">
                            <a href="/machines/${machine_task_dto.machineTask.machine.id}" class="table-link">${machine_task_dto.machineTask.machine.name}</a>
                        </td>
                        <td class="table-td implement-cell">
                            <c:if test="${machine_task_dto.implement != null}">
                                <a href="/implements/${machine_task_dto.implement.id}" class="table-link">${machine_task_dto.implement.name}</a>
                            </c:if>
                            <c:if test="${machine_task_dto.implement == null}">
                                -
                            </c:if>
                        </td>
                        <td class="table-td shape1-cell">${machine_task_dto.machineTask.coveredArea}</td>
                        <td class="table-td shape2-cell">${machine_task_dto.machineTask.fuelConsumption}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>