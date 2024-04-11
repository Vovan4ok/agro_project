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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/field_scouting_task_info.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${field.name}</h1>
        <span class="field-group">${field.fieldGroup.groupFolder.parent.name}/${field.fieldGroup.groupFolder.name}/${field.fieldGroup.name}"</span>
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
        <div>
            <div class="content-info">
                <h1 class="content-header">Завдання на огляд ${scouting_task.id}</h1>
                <div class="info-block">
                    <div class="info-part">
                        <h3 class="info-part-header">Терміни</h3>
                        <span class="info-part-info">${scouting_task.startTime} -<br> ${scouting_task.endTime}</span>
                    </div>
                    <div class="info-part">
                        <h3 class="info-part-header">Статус</h3>
                        <span class="info-part-info">${scouting_task.status}</span>
                    </div>
                    <div class="info-part">
                        <h3 class="info-part-header">Сезон</h3>
                        <span class="info-part-info">${scouting_task.season}</span>
                    </div>
                </div>
                <div class="info-block2">
                    <div class="part1">
                        <h3 class="info-part-header">Відповідальна особа</h3>
                        <a href="/users/${scouting_task.responsibleUser.id}" class="username">${scouting_task.responsibleUser.username}</a>
                        <p class="user-email">${scouting_task.responsibleUser.email}</p>
                    </div>
                    <div class="part2">
                        <h3 class="info-part-header">Автор</h3>
                        <a href="/users/${scouting_task.author.id}" class="username">${scouting_task.author.id}</a>
                        <p class="user-email">${scouting_task.author.username}</p>
                    </div>
                </div>
            </div>
            <div class="content-info" style="margin-top: 50px; width: 700px;">
                <h1 class="content-header">Точки</h1>
                <table class="main-table">
                    <tr class="table-row">
                        <th class="table-th number-cell">#</th>
                        <th class="table-th long-cell">Довгота</th>
                        <th class="table-th lat-cell">Широта</th>
                    </tr>
                    <c:forEach var="scouting_task_point" items="${scouting_task_points}">
                        <tr class="table-row">
                            <td class="table-td number-cell">${scouting_task_point.id}</td>
                            <td class="table-td long-cell">${scouting_task_point.longitude}</td>
                            <td class="table-td lat-cell">${scouting_task_point.latitude}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>