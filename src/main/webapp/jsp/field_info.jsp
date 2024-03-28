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
    <link rel="stylesheet" href="../styles/field_info.css">
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
                <a href="/fields/${field.id}" class="field-menu-link" style="font-weight: bold;">Інформація про поле</a>
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
                <a href="/fields/${field.id}/alerts" class="field-menu-link">Тривоги</a>
            </li>
        </ul>
        <div class="content-info">
            <h2 class="content-header">Інформація про поле</h2>
            <div class="info-block">
                <div class="info-part">
                    <h3 class="info-part-header">Назва</h3>
                    <span class="info-part-info">${field.name}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Довгота (коорд.)</h3>
                    <span class="info-part-info">${fieldShape.pointLon}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Широта (коорд.)</h3>
                    <span class="info-part-info">${fieldShape.pointLat}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Оброблювальна площа, га</h3>
                    <span class="info-part-info">${fieldShape.tillableArea}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Офіційна площа, га</h3>
                    <span class="info-part-info">${fieldShape.legalArea}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Розрахункова площа, га</h3>
                    <span class="info-part-info">${fieldShape.calculatedArea}</span>
                </div>
            </div>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>