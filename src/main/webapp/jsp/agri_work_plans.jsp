<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список планувань агрооперацій</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../styles/agri_work_plans.css">
    <script src="../js/agri_work_plans.js"></script>
    <script src="../js/season_filter.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Планування агрооперацій</h1>
        <input type="text" class="main-content-search" placeholder="Пошук планувань">
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th plan-cell"># плану</th>
                <th class="table-th status-cell">Статус</th>
                <th class="table-th work-type-cell">Тип робіт</th>
                <th class="table-th season-cell">Сезон</th>
                <th class="table-th start-cell">Початок по плану</th>
                <th class="table-th end-cell">Кінець по плану</th>
            </tr>
            <c:forEach var="agri_work_plan" items="${agri_work_plans}">
                <tr class="table-row table-td-row">
                    <td class="table-td plan-cell">
                        <a href="/agri_work_plans/${agri_work_plan.id}" class="table-link">${agri_work_plan.id}</a>
                    </td>
                    <td class="table-td status-cell">${agri_work_plan.status}</td>
                    <td class="table-td work-type-cell">${agri_work_plan.workType.name}/<br>${agri_work_plan.workType.workTypeGroup.name}</td>
                    <td class="table-td season-cell">${agri_work_plan.season}</td>
                    <td class="table-td start-cell">${agri_work_plan.plannedStartDate}</td>
                    <td class="table-td end-cell">${agri_work_plan.plannedEndDate}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>