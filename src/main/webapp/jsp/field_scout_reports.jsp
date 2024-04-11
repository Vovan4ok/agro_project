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
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap"
          rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/field_scout_reports.css">
</head>

<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main" <c:if test="${scout_reports.size() <= 2}">style="margin-bottom: 50px;"</c:if>>
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
                <a href="/fields/${field.id}/scouting_tasks" class="field-menu-link">Завдання на огляд</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/scout_reports" class="field-menu-link" style="font-weight: bold;">Звіти оглядів</a>
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
        <div class="block-info">
            <c:if test="${scout_reports.size() == 0}">
                <h1 style="font-size: 30px; font-weight: bold;">Інформація відсутня</h1>
            </c:if>
            <c:if test="${scout_reports.size() != 0}">
                <c:forEach var="scout_report" items="${scout_reports}">
                    <div class="scout-report">
                    <a href="/fields/${field.id}/scout_reports/${scout_report.id}" class="content-header">${scout_report.reportTime} ${scout_report.id}</a>
                    <div class="blocks">
                        <div class="scout-report-block1">
                            <h3 class="info-part-header">Додаткова інформація</h3>
                            <c:if test="${scout_report.additionalInfo == null}">
                                <span class="info-part-info">Інформація відсутня</span>
                            </c:if>
                            <c:if test="${!scout_report.additionalInfo.contains('http')}">
                                <span class="info-part-info">${scout_report.additionalInfo}</span>
                            </c:if>
                            <c:if test="${scout_report.additionalInfo.contains('http')}">
                                <a href="${scout_report.additionalInfo}" class="videolink" style="font-size: 18px; margin-top: 10px;">Посилання на відео</a>
                            </c:if>
                        </div>
                        <div class="scout-report-block2">
                            <h3 class="info-part-header">Автор</h3>
                            <a href="/users/${scout_report.user.id}" class="username">${scout_report.user.username}</a>
                            <p class="email">${scout_report.user.email}</p>
                            <p class="profession">
                                <c:if test="${scout_report.user.position != null}">
                                    ${scout_report.user.position}
                                </c:if>
                                <c:if test="${scout_report.user.position == null}">
                                    -
                                </c:if>
                            </p>
                        </div>
                        <div class="scout-report-block3">
                            <div>
                                <h3 class="info-part-header">Дата створення</h3>
                                <span class="info-part-info">${scout_report.reportTime}</span>
                            </div>
                            <div style="margin-top: 20px;">
                                <h3 class="info-part-header">Сезон</h3>
                                <span class="info-part-info">${scout_report.season}</span>
                            </div>
                        </div>
                    </div>
                </div>
                </c:forEach>
            </c:if>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>