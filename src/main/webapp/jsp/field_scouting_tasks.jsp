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
    <link rel="stylesheet" href="../../styles/field_scouting_tasks.css">
    <script src="../../js/field_scouting_tasks.js"></script>
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
                <a href="/fields/${field.id}/machine_tasks" class="field-menu-link">Роботи машин</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/scouting_tasks" class="field-menu-link" style="font-weight: bold;">Завдання на огляд</a>
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
            <h2 class="content-header">Завдання на огляд</h2>
            <input type="text" placeholder="Пошук завдання на огляд" class="main-content-search">
            <table class="main-table">
                <tr class="table-row">
                    <th class="table-th task-cell">Завдання</th>
                    <th class="table-th season-cell">Сезон</th>
                    <th class="table-th responsible-cell">Відповідальна особа</th>
                    <th class="table-th author-cell">Автор</th>
                    <th class="table-th dates-cell">Терміни (поч. - кін.)</th>
                    <th class="table-th status-cell">Статус</th>
                </tr>
                <c:forEach var="scouting_task" items="${scouting_tasks}">
                    <tr class="table-row table-td-row">
                        <td class="table-td task-cell">
                            <a href="/fields/${field.id}/scouting_tasks/${scouting_task.id}" class="table-link">${scouting_task.id}</a>
                        </td>
                        <td class="table-td season-cell">${scouting_task.season}</td>
                        <td class="table-td responsible-cell">
                            <a href="/users/${scouting_task.responsibleUser.id}" class="table-link">${scouting_task.responsibleUser.username}</a>
                        </td>
                        <td class="table-td author-cell">
                            <a href="/users/${scouting_task.author.id}" class="table-link">${scouting_task.author.username}</a>
                        </td>
                        <td class="table-td dates-cell">${scouting_task.startTime} -<br>${scouting_task.endTime}</td>
                        <td class="table-td status-cell">${scouting_task.status}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>