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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/field_scout_report.css">
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
            <div class="scout-report">
                <h3 class="content-header">2021-07-06 #46121</h3>
                <div class="scout-report-block-info">
                    <h5 class="block-info-header">Додаткова інформація</h5>
                    <span class="block-info-text">
                        <c:if test="${scout_report.additionalInfo == null}">
                            <span class="info-part-info">Інформація відсутня</span>
                        </c:if>
                        <c:if test="${!scout_report.additionalInfo.contains('http')}">
                            <span class="info-part-info">${scout_report.additionalInfo}</span>
                        </c:if>
                        <c:if test="${scout_report.additionalInfo.contains('http')}">
                            <a href="${scout_report.additionalInfo}" class="videolink" style="font-size: 18px; margin-top: 10px;">Посилання на відео</a>
                        </c:if>
                    </span>
                </div>
                <div class="scout-report-block-info">
                    <h5 class="block-info-header">Автор</h5>
                    <div class="block-info-text">
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
                </div>
                <div class="scout-report-block-info">
                    <h5 class="block-info-header">Дата створення</h5>
                    <span class="block-info-text">${scout_report.reportTime}</span>
                </div>
                <div class="scout-report-block-info">
                    <h5 class="block-info-header">Сезон</h5>
                    <span class="block-info-text">${scout_report.season}</span>
                </div>
                <div class="photos">
                    <h5 class="photos-header">Фото</h5>
                    <div class="photos-block">
                        <c:forEach var="photo" items="${photos}">
                            <img src="${photo.url}" alt="photo" class="photos-block-image">
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>
<footer class="footer">
    <div class="footer-info">
        <div class="footer-contacts-block">
            <h1 class="footer-contacts-block-header">Контакти</h1>
            <div class="footer-contacts-block-info-phone">
                <div>
                    <span class="footer-text-header">Телефон:</span>
                    <span class="footer-text-info">+38 (067) 690-58-26</span>
                </div>
                <div class="footer-contacts-block-info-email">
                    <span class="footer-text-header">E-mail:</span>
                    <span class="footer-text-info">info@agrocontrol.net</span>
                </div>
            </div>
        </div>
        <div class="footer-about-block">
            <h1 class="footer-about-block-header">Про нас</h1>
            <div class="footer-about-block-info">
                <div class="footer-about-block-info-website">
                    <span class="footer-text-header">Сайт:</span>
                    <a href="https://agrocontrol.net/" class="footer-text-info">https://agrocontrol.net/</a>
                </div>
                <div class="footer-about-block-info-facebook">
                    <span class="footer-text-header">Facebook:</span>
                    <a href="http://www.facebook.com/agrocontrol.net"
                       class="footer-text-info">http://www.facebook.com/agrocontrol.net</a>
                </div>
            </div>
        </div>
    </div>
    <span class="rights-text">© 2024–24 AgroControl. All rights reserved.</span>
</footer>
</body>

</html>