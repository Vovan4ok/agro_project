<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${seed.name}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/seed_info.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${seed.name}</h1>
    </div>
    <div class="main-content">
        <div class="block-info">
            <h5 class="block-info-header">Сорт</h5>
            <span class="block-info-text">
                <c:if test="${seed.variety == null}">
                    -
                </c:if>
                <c:if test="${seed.variety != null}">
                    ${seed.variety}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Одиниця виміру</h5>
            <span class="block-info-text">
                <c:if test="${seed.unitsOfMeasurement == null}">
                    -
                </c:if>
                <c:if test="${seed.unitsOfMeasurement != null}">
                    ${seed.unitsOfMeasurement}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Репродукція</h5>
            <span class="block-info-text">
                <c:if test="${seed.reproduction == null}">
                    -
                </c:if>
                <c:if test="${seed.reproduction != null}">
                    ${seed.reproduction}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Культура</h5>
            <span class="block-info-text">
                <c:if test="${seed.crop.name == null}">
                    -
                </c:if>
                <c:if test="${seed.crop.name != null}">
                    ${seed.crop.name}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Додаткова інформація</h5>
            <span class="block-info-text">
                <c:if test="${seed.additionalInfo == null}">
                    -
                </c:if>
                <c:if test="${seed.additionalInfo != null}">
                    ${seed.additionalInfo}
                </c:if>
            </span>
        </div>
        <div class="block-info" style="margin-bottom: 0;">
            <h5 class="block-info-header">Опис</h5>
            <span class="block-info-text">
                <c:if test="${seed.description == null}">
                    -
                </c:if>
                <c:if test="${seed.description != null}">
                    ${seed.description}
                </c:if>
            </span>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>