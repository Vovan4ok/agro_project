<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Обслуговування</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/maintenance_info.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">Обслуговування ${maintenance_record_row.maintenanceRecord.id} ${maintenance_record_row.maintenanceType.maintenanceTypeGroup.name}/${maintenance_record_row.maintenanceType.name}</h1>
    </div>
    <div class="main-content">
        <div class="info-block">
            <div class="info-part">
                <h3 class="info-part-header">Вид ТО</h3>
                <span class="info-part-info">${maintenance_record_row.maintenanceType.maintenanceTypeGroup.name}/${maintenance_record_row.maintenanceType.name}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Статус</h3>
                <span class="info-part-info">${maintenance_record_row.maintenanceRecord.status}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Сезон</h3>
                <span class="info-part-info">${maintenance_record_row.maintenanceRecord.season}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Техніка</h3>
                <span class="info-part-info">
                    <a href="/<c:if test="${maintenance_record_row.maintenanceRecord.maintainableType.equals('Machine')}">machines</c:if><c:if test="${maintenance_record_row.maintenanceRecord.maintainableType.equals('Implement')}">implements</c:if>/${machine.id}" class="link">${machine.name}</a>
                </span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Планові терміни</h3>
                <span class="info-part-info">${maintenance_record_row.maintenanceRecord.plannedStartTime} -<br>
                    ${maintenance_record_row.maintenanceRecord.plannedEndTime}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Реальні терміни</h3>
                <span class="info-part-info">${maintenance_record_row.maintenanceRecord.startTime} -<br>
                    ${maintenance_record_row.maintenanceRecord.endTime}</span>
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
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>