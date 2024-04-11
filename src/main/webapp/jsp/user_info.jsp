<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${user.username}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/user_info.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${user.username}</h1>
    </div>
    <div class="main-content">
        <div class="block-info">
            <h5 class="block-info-header">Ім'я</h5>
            <span class="block-info-text">${user.username}</span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Електронна пошта</h5>
            <span class="block-info-text">
                <c:if test="${user.email == null}">
                    -
                </c:if>
                <c:if test="${user.email != null}">
                    ${user.email}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Позиція</h5>
            <span class="block-info-text">
                <c:if test="${user.position == null}">
                    -
                </c:if>
                <c:if test="${user.position != null}">
                    ${user.position}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Мова</h5>
            <span class="block-info-text">
                <c:choose>
                    <c:when test="${user.language == 'bg'}">Болгарська</c:when>
                    <c:when test="${user.language == 'cs'}">Чеська</c:when>
                    <c:when test="${user.language == 'de'}">Німецька</c:when>
                    <c:when test="${user.language.contains('en')}">Англійська</c:when>
                    <c:when test="${user.language == 'es'}">Естонська</c:when>
                    <c:when test="${user.language == 'fr'}">Французька</c:when>
                    <c:when test="${user.language == 'pl'}">Польська</c:when>
                    <c:when test="${user.language == 'pt-BR'}">Бразильська</c:when>
                    <c:when test="${user.language == 'ro'}">Румунська</c:when>
                    <c:when test="${user.language == 'ru'}">Російська</c:when>
                    <c:when test="${user.language == 'uk'}">Українська</c:when>
                </c:choose>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Часовий пояс</h5>
            <span class="block-info-text">${user.timeZone}</span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Індивідуальний страховий номер</h5>
            <span class="block-info-text">
                <c:if test="${user.individualInsuranceNumber == null}">
                    -
                </c:if>
                <c:if test="${user.individualInsuranceNumber != null}">
                    ${user.individualInsuranceNumber}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Диспетчер</h5>
            <span class="block-info-text">
                <c:if test="${user.dispatcher == true}">
                    Так
                </c:if>
                <c:if test="${user.dispatcher != true}">
                    Ні
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Водій</h5>
            <span class="block-info-text">
                <c:if test="${user.driver == true}">
                    Так
                </c:if>
                <c:if test="${user.driver != true}">
                    Ні
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Агроном</h5>
            <span class="block-info-text">
                <c:if test="${user.agronomist == true}">
                    Так
                </c:if>
                <c:if test="${user.agronomist != true}">
                    Ні
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Додаткова інформація</h5>
            <span class="block-info-text">
                <c:if test="${user.additionalInfo == null}">
                    -
                </c:if>
                <c:if test="${user.additionalInfo != null}">
                    ${user.additionalInfo}
                </c:if>
            </span>
        </div>
        <div class="block-info" style="margin-bottom: 0;">
            <h5 class="block-info-header">Опис</h5>
            <span class="block-info-text">
                <c:if test="${user.description == null}">
                    -
                </c:if>
                <c:if test="${user.description != null}">
                    ${user.description}
                </c:if>
            </span>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>