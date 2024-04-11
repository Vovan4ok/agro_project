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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/field_shape_land_parcels.css">
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
                <a href="/fields/${field.id}/scout_reports" class="field-menu-link">Звіти оглядів</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/shape_land_parcels" class="field-menu-link" style="font-weight: bold;">Площа поля та ділянки</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/notes" class="field-menu-link">Нотатки</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/alerts" class="field-menu-link">Тривоги</a>
            </li>
        </ul>
        <div class="content-info">
            <h1 class="content-header">Площа поля та ділянки</h1>
            <c:forEach var="field_shape_dto" items="${field_shape_dtos}">
                <div class="block-info">
                    <h2 class="block-info-header">${field_shape_dto.fieldShape.startTime} - <c:if test="${field_shape_dto.fieldShape.endTime == null}">наш час</c:if><c:if test="${field_shape_dto.fieldShape.endTime != null}">${field_shape_dto.fieldShape.endTime}</c:if></h2>
                    <div class="field-shape-block">
                        <h5 class="info-block-header">Площа поля</h5>
                        <div class="info-block-small-block">
                            <span class="info-block-small-block-header">Оброблювальна</span>
                            <span class="info-block-small-block-info">${field_shape_dto.fieldShape.tillableArea} га</span>
                        </div>
                        <div class="info-block-small-block">
                            <span class="info-block-small-block-header">Офіційна</span>
                            <span class="info-block-small-block-info">${field_shape_dto.fieldShape.legalArea} га</span>
                        </div>
                        <div class="info-block-small-block">
                            <span class="info-block-small-block-header">Розрахована</span>
                            <span class="info-block-small-block-info">${field_shape_dto.fieldShape.calculatedArea} га</span>
                        </div>
                    </div>
                    <div class="land-parcels-block">
                        <h5 class="info-block-header">Список ділянок</h5>
                        <table class="main-table">
                            <tr class="table-row">
                                <th class="table-th land-parcel-cell">Земельна ділянка</th>
                                <th class="table-th land-parcel-shape-cell">Кадастрова площа, га</th>
                            </tr>
                            <c:forEach var="land_parcel" items="${field_shape_dto.landParcels}">
                                <tr class="table-row">
                                    <td class="table-td land-parcel-cell">
                                        <a href="/land_parcels/${land_parcel.id}" class="land-parcel-link">${land_parcel.cadastralNumber}</a>
                                    </td>
                                    <td class="table-td land-parcel-shape-cell">${land_parcel.cadastralArea}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>