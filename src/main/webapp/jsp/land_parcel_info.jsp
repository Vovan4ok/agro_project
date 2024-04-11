<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${land_parcel.cadastralNumber}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/land_parcel_info.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${land_parcel.cadastralNumber}</h1>
        <span class="field-group">${land_parcel.fieldGroup.name}</span>
    </div>
    <div class="main-content">
        <div class="info-block">
            <div class="info-part">
                <h3 class="info-part-header">Кадастровий номер ділянки</h3>
                <span class="info-part-info">${land_parcel.cadastralNumber}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Кадастрова площа, га</h3>
                <span class="info-part-info">${land_parcel.cadastralArea}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Розрахункова площа, га</h3>
                <span class="info-part-info">${land_parcel.calculatedArea}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Цільове призначення</h3>
                <span class="info-part-info">
                    <c:if test="${land_parcel.permittedUse == null}">
                        -
                    </c:if>
                    <c:if test="${land_parcel.permittedUse != null}">
                        ${land_parcel.permittedUse}
                    </c:if>
                </span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Тип землі</h3>
                <span class="info-part-info">
                    <c:if test="${land_parcel.areaType == null}">
                        -
                    </c:if>
                    <c:if test="${land_parcel.areaType != null}">
                        Рілля
                    </c:if>
                </span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Форма власності</h3>
                <span class="info-part-info">
                    <c:if test="${land_parcel.ownershipType == null}">
                        -
                    </c:if>
                    <c:if test="${land_parcel.ownershipType.equals('private')}">
                        Приватна
                    </c:if>
                    <c:if test="${land_parcel.ownershipType.equals('state')}">
                        Державна
                    </c:if>
                    <c:if test="${land_parcel.ownershipType.equals('communal')}">
                        Комунальна
                    </c:if>
                </span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Країна</h3>
                <span class="info-part-info">
                    <c:if test="${land_parcel.countryCode.equals('UA')}">
                        Україна
                    </c:if>
                    <c:if test="${land_parcel.countryCode == null}">
                        -
                    </c:if>
                </span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Власник ділянки</h3>
                <span class="info-part-info">
                    <c:if test="${land_parcel.vlasnik != null}">
                        ${land_parcel.vlasnik}
                    </c:if>
                    <c:if test="${land_parcel.vlasnik == null}">
                        -
                    </c:if>
                </span>
            </div>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>