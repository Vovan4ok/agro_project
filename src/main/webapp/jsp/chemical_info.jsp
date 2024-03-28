<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${chemical.name}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../../styles/chemical_info.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${chemical.name}</h1>
    </div>
    <div class="main-content">
        <div class="block-info">
            <h5 class="block-info-header">Тип</h5>
            <span class="block-info-text">
                <c:choose>
                    <c:when test="${chemical.chemicalType.equals('adjuvant')}">Ад'ювант</c:when>
                    <c:when test="${chemical.chemicalType.equals('biological_supplements')}">Біологічна добавка</c:when>
                    <c:when test="${chemical.chemicalType.equals('defoliants_desiccants')}">Дефоліанти десиканти</c:when>
                    <c:when test="${chemical.chemicalType.equals('fungicide')}">Фунгіцид</c:when>
                    <c:when test="${chemical.chemicalType.equals('growth_regulator')}">Регулятор росту</c:when>
                    <c:when test="${chemical.chemicalType.equals('herbicide')}">Гербіцид</c:when>
                    <c:when test="${chemical.chemicalType.equals('insecticide')}">Інсектицид</c:when>
                    <c:when test="${chemical.chemicalType.equals('microbiological_agent')}">Мікробіологічний засіб</c:when>
                    <c:when test="${chemical.chemicalType.equals('nematicides')}">Нематицид</c:when>
                    <c:when test="${chemical.chemicalType.equals('nutrients')}">Поживна речовина</c:when>
                    <c:when test="${chemical.chemicalType.equals('other')}">Інше</c:when>
                    <c:when test="${chemical.chemicalType.equals('rodenticide')}">Родентицид</c:when>
                    <c:when test="${chemical.chemicalType.equals('seed_treatment')}">Обробка насіння</c:when>
                </c:choose>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Одиниця виміру</h5>
            <span class="block-info-text">${chemical.unitsOfMeasurement}</span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Ступінь токсичності</h5>
            <span class="block-info-text">
                <c:if test="${chemical.toxicityClass == null}">
                    -
                </c:if>
                <c:if test="${chemical.toxicityClass != null}">
                    ${chemical.toxicityClass}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Термін дії</h5>
            <span class="block-info-text">
                <c:if test="${chemical.actionTerm == null}">
                    -
                </c:if>
                <c:if test="${chemical.actionTerm != null}">
                    ${chemical.actionTerm} ${chemical.actionTermUnits}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Діюча речовина</h5>
            <span class="block-info-text">
                <c:if test="${chemical.activeSubstance == null}">
                    -
                </c:if>
                <c:if test="${chemical.activeSubstance != null}">
                    ${chemical.activeSubstance}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Спосіб дії</h5>
            <span class="block-info-text">
                <c:if test="${chemical.influenceMethod == null}">
                    -
                </c:if>
                <c:if test="${chemical.influenceMethod != null}">
                    ${chemical.influenceMethod}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Рекомендований термін ізоляції бджіл</h5>
            <span class="block-info-text">
                <c:if test="${chemical.beesIsolatingRecommendedTermUnits == null}">
                    -
                </c:if>
                <c:if test="${chemical.beesIsolatingRecommendedTermUnits != null}">
                    ${chemical.beesIsolatingRecommendedTermUnits}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Термін продажу</h5>
            <span class="block-info-text">
                <c:if test="${chemical.saleTerm == null}">
                    -
                </c:if>
                <c:if test="${chemical.saleTerm != null}">
                    ${chemical.saleTerm}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Термін використання</h5>
            <span class="block-info-text">
                <c:if test="${chemical.termOfUse == null}">
                    -
                </c:if>
                <c:if test="${chemical.termOfUse != null}">
                    ${chemical.termOfUse}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Додаткова інформація</h5>
            <span class="block-info-text">
                <c:if test="${chemical.additionalInfo == null}">
                    -
                </c:if>
                <c:if test="${chemical.additionalInfo != null}">
                    ${chemical.additionalInfo}
                </c:if></span>
        </div>
        <div class="block-info" style="margin-bottom: 0;">
            <h5 class="block-info-header">Опис</h5>
            <span class="block-info-text">
                <c:if test="${chemical.description == null}">
                    -
                </c:if>
                <c:if test="${chemical.description != null}">
                    ${chemical.description}
                </c:if>
            </span>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>