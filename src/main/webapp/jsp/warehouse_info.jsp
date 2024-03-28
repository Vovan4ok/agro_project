<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${warehouse_assignment.warehouse.name}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../../styles/warehouse_info.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${warehouse_assignment.warehouse.name}</h1>
    </div>
    <div class="main-content">
        <div class="block-info">
            <h5 class="block-info-header">Назва</h5>
            <span class="block-info-text">${warehouse_assignment.warehouse.name}</span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Група</h5>
            <span class="block-info-text">
                <c:if test="${warehouse_assignment.warehouse.warehouseGroup != null}">
                    ${warehouse_assignment.warehouse.warehouseGroup.name}
                </c:if>
                <c:if test="${warehouse_assignment.warehouse.warehouseGroup == null}">
                    -
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Прив'язано до поля</h5>
            <a href="/fields/${warehouse_assignment.field.id}" class="block-info-text">горенко</a>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Відповідальна особа</h5>
            <span class="block-info-text">
                <c:if test="${warehouse_assignment.warehouse.responsibleUser != null}">
                    <a href="/users/${warehouse_assignment.warehouse.responsibleUser.id}" class="block-info-text"></a>
                </c:if>
                <c:if test="${warehouse_assignment.warehouse.responsibleUser == null}">
                    -
                </c:if>
            </span>
        </div>
        <div class="block-info" style="margin-bottom: 0;">
            <h5 class="block-info-header">Опис</h5>
            <span class="block-info-text">
                <c:if test="${warehouse_assignment.warehouse.description != null}">
                    ${warehouse_assignment.warehouse.description}
                </c:if>
                <c:if test="${warehouse_assignment.warehouse.description == null}">
                    -
                </c:if>
            </span>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>