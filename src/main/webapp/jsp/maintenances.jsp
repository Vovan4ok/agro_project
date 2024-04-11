<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список історії обслуговувань</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/maintenances.css">
    <script src="${pageContext.request.contextPath}/js/maintenances.js"></script>
    <script src="${pageContext.request.contextPath}/js/season_filter.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Історія обслуговування</h1>
        <input type="text" class="main-content-search" placeholder="Пошук">
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th field-cell">Вид ТО</th>
                <th class="table-th country-cell">Статус</th>
                <th class="table-th region-cell">Сезон</th>
                <th class="table-th district-cell">Терміни</th>
            </tr>
            <c:forEach var="maintenance_record_row" items="${maintenance_record_rows}">
                <tr class="table-row table-td-row">
                    <td class="table-td">
                        <a href="/maintenances/${maintenance_record_row.maintenanceRecord.id}" class="table-link">${maintenance_record_row.maintenanceType.maintenanceTypeGroup.name}/${maintenance_record_row.maintenanceType.name}<br>${maintenance_record_row.maintenanceRecord.id}</a>
                    </td>
                    <td class="table-td">${maintenance_record_row.maintenanceRecord.status}</td>
                    <td class="table-td">${maintenance_record_row.maintenanceRecord.season}</td>
                    <td class="table-td">${maintenance_record_row.maintenanceRecord.startTime} -<br>
                            ${maintenance_record_row.maintenanceRecord.endTime}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>