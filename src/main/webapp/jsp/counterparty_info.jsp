<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${counterparty.lastName} ${counterparty.firstName}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../../styles/counterparty_info.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${counterparty.lastName} ${counterparty.firstName} ${counterparty.middleName}</h1>
    </div>
    <div class="main-content">
        <div class="block-info">
            <h5 class="block-info-header">Дата народження</h5>
            <span class="block-info-text">
                <c:if test="${counterparty.birthDate == null}">
                    -
                </c:if>
                <c:if test="${counterparty.birthDate != null}">
                    ${counterparty.birthDate}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Номер паспорту</h5>
            <span class="block-info-text">
                <c:if test="${counterparty.passportCode == null}">
                    -
                </c:if>
                <c:if test="${counterparty.passportCode != null}">
                    ${counterparty.passportCode}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Дата видачі паспорту</h5>
            <span class="block-info-text">
                <c:if test="${counterparty.passportIssuingDate == null}">
                    -
                </c:if>
                <c:if test="${counterparty.passportIssuingDate != null}">
                    ${counterparty.passportIssuingDate}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Був виданий</h5>
            <span class="block-info-text">
                <c:if test="${counterparty.passportIssuedBy == null}">
                    -
                </c:if>
                <c:if test="${counterparty.passportIssuedBy != null}">
                    ${counterparty.passportIssuedBy}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Ідентифікаційний код</h5>
            <span class="block-info-text">
                <c:if test="${counterparty.identificationCode == null}">
                    -
                </c:if>
                <c:if test="${counterparty.identificationCode != null}">
                    ${counterparty.identificationCode}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Область</h5>
            <span class="block-info-text">
                <c:if test="${counterparty.region == null}">
                    -
                </c:if>
                <c:if test="${counterparty.region != null}">
                    ${counterparty.region}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Район</h5>
            <span class="block-info-text">
                <c:if test="${counterparty.district == null}">
                    -
                </c:if>
                <c:if test="${counterparty.district != null}">
                    ${counterparty.district}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Населений пункт</h5>
            <span class="block-info-text">
                <c:if test="${counterparty.locality == null}">
                    -
                </c:if>
                <c:if test="${counterparty.locality != null}">
                    ${counterparty.locality}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Вулиця</h5>
            <span class="block-info-text">
                <c:if test="${counterparty.street == null}">
                    -
                </c:if>
                <c:if test="${counterparty.street != null}">
                    ${counterparty.street}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Номер будинку</h5>
            <span class="block-info-text">
                <c:if test="${counterparty.houseNumber == null}">
                    -
                </c:if>
                <c:if test="${counterparty.houseNumber != null}">
                    ${counterparty.houseNumber}
                </c:if>
            </span>
        </div>
        <div class="block-info" style="margin-bottom: 0;">
            <h5 class="block-info-header">Поштовий код</h5>
            <span class="block-info-text">
                <c:if test="${counterparty.postcode == null}">
                    -
                </c:if>
                <c:if test="${counterparty.postcode != null}">
                    ${counterparty.postcode}
                </c:if>
            </span>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>