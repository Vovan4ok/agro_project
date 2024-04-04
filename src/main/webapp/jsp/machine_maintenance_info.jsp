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
    <link rel="stylesheet" href="../../../styles/machine_maintenance_info.css">
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
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/photos" class="field-menu-link">Фото</a>
            </li>
        </ul>
        <div class="content-info">
            <h2 class="content-header">ТО ${maintenance_record_row.maintenanceRecord.id}</h2>
            <p class="status-block"><span style="font-weight: 500;">Статус:</span> ${maintenance_record_row.maintenanceRecord.status}</p>
            <div class="info-block">
                <div class="info-part">
                    <h3 class="info-part-header">Вид ТО</h3>
                    <span class="info-part-info">${maintenance_record_row.maintenanceType.maintenanceTypeGroup.name}/${maintenance_record_row.maintenanceType.name}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Сезон</h3>
                    <span class="info-part-info">${maintenance_record_row.maintenanceRecord.season}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Початок ТО за планом</h3>
                    <span class="info-part-info">${maintenance_record_row.maintenanceRecord.plannedStartTime}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Завершення ТО за планом</h3>
                    <span class="info-part-info">${maintenance_record_row.maintenanceRecord.plannedEndTime}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Пробіг, км</h3>
                    <span class="info-part-info">
                        <c:if test="${maintenance_record_row.maintenanceRecord.mileage == null}">
                            -
                        </c:if>
                        <c:if test="${maintenance_record_row.maintenanceRecord.mileage != null}">
                            ${maintenance_record_row.maintenanceRecord.mileage}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Мотогодини, год</h3>
                    <span class="info-part-info">
                        <c:if test="${maintenance_record_row.maintenanceRecord.motohours == null}">
                            -
                        </c:if>
                        <c:if test="${maintenance_record_row.maintenanceRecord.motohours != null}">
                            ${maintenance_record_row.maintenanceRecord.motohours}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Початок ТО</h3>
                    <span class="info-part-info">${maintenance_record_row.maintenanceRecord.startTime}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Кінець ТО</h3>
                    <span class="info-part-info">${maintenance_record_row.maintenanceRecord.endTime}</span>
                </div>
                <div class="info-part" style="width: 100%;">
                    <h3 class="info-part-header">Опис</h3>
                    <span class="info-part-info">
                        <c:if test="${maintenance_record_row.maintenanceRecord.description == null}">
                            -
                        </c:if>
                        <c:if test="${maintenance_record_row.maintenanceRecord.description != null}">
                            ${maintenance_record_row.maintenanceRecord.description}
                        </c:if>
                    </span>
                </div>
            </div>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>