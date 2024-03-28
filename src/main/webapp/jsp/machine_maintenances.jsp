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
    <link rel="stylesheet" href="../../styles/machine_maintenances.css">
    <script src="../../js/machine_maintenances.js"></script>
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
                <a href="/machines/${machine.id}/maintenances" class="field-menu-link" style="font-weight: bold;">Обслуговування</a>
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
            <h1 class="content-header">Історія Обслуговування</h1>
            <input type="text" class="main-content-search" placeholder="Пошук обслуговувань">
            <table class="main-table">
                <tr class="table-row">
                    <th class="table-th type-cell">Вид ТО</th>
                    <th class="table-th status-cell">Статус</th>
                    <th class="table-th season-cell">Сезон</th>
                    <th class="table-th distance-cell">Пробіг, км</th>
                    <th class="table-th motohours-cell">Мотогодини, год</th>
                    <th class="table-th description-cell">Опис</th>
                </tr>
                <c:forEach var="maintenance_record_row" items="${maintenance_record_rows}">
                    <tr class="table-row table-td-row">
                        <td class="table-td type-cell">
                            <a href="/machines/${machine.id}/maintenances/${maintenance_record_row.maintenanceRecord.id}" class="type-link">${maintenance_record_row.maintenanceType.maintenanceTypeGroup.name}/${maintenance_record_row.maintenanceType.name}<br> ${maintenance_record_row.maintenanceRecord.id}</a>
                        </td>
                        <td class="table-td status-cell">${maintenance_record_row.maintenanceRecord.status}</td>
                        <td class="table-td season-cell">${maintenance_record_row.maintenanceRecord.season}</td>
                        <td class="table-td distance-cell">
                            <c:if test="${maintenance_record_row.maintenanceRecord.mileage == null}">
                                -
                            </c:if>
                            <c:if test="${maintenance_record_row.maintenanceRecord.mileage != null}">
                                ${maintenance_record_row.maintenanceRecord.mileage}
                            </c:if>
                        </td>
                        <td class="table-td motohours-cell">
                            <c:if test="${maintenance_record_row.maintenanceRecord.motohours == null}">
                                -
                            </c:if>
                            <c:if test="${maintenance_record_row.maintenanceRecord.motohours != null}">
                                ${maintenance_record_row.maintenanceRecord.motohours}
                            </c:if>
                        </td>
                        <td class="table-td description-cell">
                            <c:if test="${maintenance_record_row.maintenanceRecord.description == null}">
                                -
                            </c:if>
                            <c:if test="${maintenance_record_row.maintenanceRecord.description != null}">
                                ${maintenance_record_row.maintenanceRecord.description}
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