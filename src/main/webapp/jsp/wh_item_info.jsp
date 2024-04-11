<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${wh_item.name}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/wh_item_info.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${wh_item.name}</h1>
    </div>
    <div class="main-content">
        <div class="block-info">
            <h5 class="block-info-header">Група</h5>
            <span class="block-info-text">${wh_item.whItemGroup.name}</span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Одиниця виміру</h5>
            <span class="block-info-text">${wh_item.whItemBaseUnit.humanName}</span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Штрих-код</h5>
            <span class="block-info-text">
                <c:if test="${wh_item.barcode == null}">
                    -
                </c:if>
                <c:if test="${wh_item.barcode != null}">
                    ${wh_item.barcode}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Додаткова інформація</h5>
            <span class="block-info-text">
                <c:if test="${wh_item.additionalInfo == null}">
                    -
                </c:if>
                <c:if test="${wh_item.additionalInfo != null}">
                    ${wh_item.additionalInfo}
                </c:if>
            </span>
        </div>
        <div class="block-info" style="margin-bottom: 0;">
            <h5 class="block-info-header">Опис</h5>
            <span class="block-info-text">
                <c:if test="${wh_item.description == null}">
                    -
                </c:if>
                <c:if test="${wh_item.description != null}">
                    ${wh_item.description}
                </c:if>
            </span>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>