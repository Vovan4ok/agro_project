<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список завдань на огляд</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/scouting_tasks.css">
    <script src="${pageContext.request.contextPath}/js/scouting_tasks.js"></script>
    <script src="${pageContext.request.contextPath}/js/season_filter.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Завдання на огляд</h1>
        <input type="text" class="main-content-search" placeholder="Пошук завдань на огляд">
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th plan-cell">Завдання</th>
                <th class="table-th status-cell">Сезон</th>
                <th class="table-th work-type-cell">Група полів</th>
                <th class="table-th season-cell">Поле</th>
                <th class="table-th start-cell">Терміни (поч. - кін.)</th>
                <th class="table-th end-cell">Статус</th>
            </tr>
            <c:forEach var="scouting_task" items="${scouting_tasks}">
                <tr class="table-row table-td-row">
                    <td class="table-td plan-cell">
                        <a href="/fields/${scouting_task.field.id}/scouting_tasks/${scouting_task.id}" class="table-link">${scouting_task.id}</a>
                    </td>
                    <td class="table-td status-cell">${scouting_task.season}</td>
                    <td class="table-td work-type-cell">${scouting_task.field.fieldGroup.name}</td>
                    <td class="table-td season-cell">
                        <a href="/fields/${scouting_task.field.id}" class="table-link">${scouting_task.field.name}</a>
                    </td>
                    <td class="table-td start-cell">${scouting_task.startTime} -<br>
                        ${scouting_task.endTime}</td>
                    <td class="table-td end-cell">${scouting_task.status}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>