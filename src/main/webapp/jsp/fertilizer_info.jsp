<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${fertilizer.name}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../../styles/fertilizer_info.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${fertilizer.name}</h1>
    </div>
    <div class="main-content">
        <div class="block-info">
            <h5 class="block-info-header">Тип добрива</h5>
            <span class="block-info-text">
                <c:if test="${fertilizer.fertilizerType.equals('granular')}">Гранульоване</c:if>
                <c:if test="${fertilizer.fertilizerType.equals('liquid')}">Рідина</c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Тип походження</h5>
            <span class="block-info-text">
                <c:if test="${fertilizer.sourceType.equals('inorganic')}">Не органічне</c:if>
                <c:if test="${fertilizer.sourceType.equals('organic')}">Органічне</c:if>
                <c:if test="${fertilizer.sourceType.equals('other')}">Інше</c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Тип складу</h5>
            <span class="block-info-text">
                <c:if test="${fertilizer.nutrientType.equals('micronutrient')}">Мікроелемент</c:if>
                <c:if test="${fertilizer.nutrientType.equals('multinutrient')}">Багатонутрієнтний</c:if>
                <c:if test="${fertilizer.nutrientType.equals('nitrogen')}">Азот</c:if>
                <c:if test="${fertilizer.nutrientType.equals('other')}">Інше</c:if>
                <c:if test="${fertilizer.nutrientType.equals('phosphate')}">Фосфат</c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Одиниця виміру</h5>
            <span class="block-info-text">${fertlizer.unitsOfMeasurement}</span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Додаткова інформація</h5>
            <span class="block-info-text">
                <c:if test="${fertilizer.additionalInfo == null}">
                    -
                </c:if>
                <c:if test="${fertilizer.additionalInfo != null}">
                    ${fertilizer.additionalInfo}
                </c:if>
            </span>
        </div>
        <div class="block-info" style="margin-bottom: 0;">
            <h5 class="block-info-header">Опис</h5>
            <span class="block-info-text">
                <c:if test="${fertilizer.description == null}">
                    -
                </c:if>
                <c:if test="${fertilizer.description != null}">
                    ${fertilizer.description}
                </c:if>
            </span>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>