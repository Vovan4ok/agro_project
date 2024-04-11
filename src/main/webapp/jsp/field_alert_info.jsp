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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/field_alert_info.css">
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
                <a href="/fields/${field.id}/alerts" class="field-menu-link" style="font-weight: bold;">Тривоги</a>
            </li>
        </ul>
        <div class="content-info">
            <h2 class="content-header">Тривога ${alert.id}</h2>
            <p class="status-block"><span style="font-weight: 500;">Статус:</span> ${alert.status}</p>
            <div class="info-block">
                <div class="info-part">
                    <h3 class="info-part-header">Назва тривоги</h3>
                    <span class="info-part-info">${alert.alertType.name}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Тип тривоги</h3>
                    <span class="info-part-info">
                        <c:if test="${alert.alertType.alertType == null}">
                            -
                        </c:if>
                        <c:if test="${alert.alertType.alertType != null}">
                            ${alert.alertType.alertType}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Створена</h3>
                    <span class="info-part-info">${alert.createdAt}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Закрита</h3>
                    <span class="info-part-info">
                        <c:if test="${alert.alertClosedAt == null}">
                            тривога відкрита
                        </c:if>
                        <c:if test="${alert.alertClosedAt != null}">
                            ${alert.alertClosedAt}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Початок події</h3>
                    <span class="info-part-info">${alert.eventStartTime}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Кінець події</h3>
                    <span class="info-part-info">
                        <c:if test="${alert.eventStopTime == null}">
                            тривога відкрита
                        </c:if>
                        <c:if test="${alert.eventStopTime != null}">
                            ${alert.eventStopTime}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Відповідальна особа</h3>
                    <c:if test="${alert.responsiblePerson == null}">
                        <span class="info-part-info">-</span>
                    </c:if>
                    <c:if test="${alert.responsiblePerson != null}">
                        <a href="/users/${alert.responsiblePerson.id}" class="info-part-info username">${alert.responsiblePerson.username}</a>
                    </c:if>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Створена</h3>
                    <c:if test="${alert.createdByUser == null}">
                        <span class="info-part-info">-</span>
                    </c:if>
                    <c:if test="${alert.createdByUser != null}">
                        <a href="/users/${alert.createdByUser.id}" class="info-part-info username">${alert.createdByUser.username}</a>
                    </c:if>
                </div>
                <div class="info-part" style="width: 100%;">
                    <h3 class="info-part-header">Додаткова інформація</h3>
                    <span class="info-part-info">
                        <c:if test="${alert.description == null}">
                            -
                        </c:if>
                        <c:if test="${alert.description != null}">
                            ${alert.description}
                        </c:if>
                    </span>
                </div>
            </div>
        </div>
    </div>
</main>
<jsp:include page="header.jsp"></jsp:include>
</body>
</html>