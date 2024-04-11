<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${machine.name}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/machine_weighing_info.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${machine.name}</h1>
        <span class="field-group">${machine.manufacturer} ${machine.model}</span>
    </div>
    <div class="main-content">
        <ul class="field-menu">
            <li class="field-menu-item">
                <a href="/machines/${machine.id}" class="field-menu-link">Інформація про машину</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/notes" class="field-menu-link">Нотатки</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/tasks" class="field-menu-link">Завдання</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/alerts" class="field-menu-link">Тривоги</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/maintenances" class="field-menu-link">Обслуговування</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/downtimes" class="field-menu-link">Зупинки</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/weighings" class="field-menu-link" style="font-weight: bold;">Зважування</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/regions" class="field-menu-link">Регіон</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/photos" class="field-menu-link">Фото</a>
            </li>
        </ul>
        <div class="content-info">
            <h2 class="content-header">Зважування ${weighing.id}</h2>
            <div class="info-block">
                <div class="info-part">
                    <h3 class="info-part-header">Час зважування</h3>
                    <span class="info-part-info">${weighing.weighingTime}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Сезон</h3>
                    <span class="info-part-info">${weighing.season}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Місце зважування</h3>
                    <span class="info-part-info">
                        <c:if test="${weighing.weighingplace == null}">
                            -
                        </c:if>
                        <c:if test="${weighing.weighingplace != null}">
                            <a href="/additional_objects/${weighing.weighingplace.id}" class="link">${weighing.weighingplace.name}</a>
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Тип маршруту</h3>
                    <span class="info-part-info">
                        <c:if test="${weighing.typeOfRoute == null}">
                            -
                        </c:if>
                        <c:if test="${weighing.typeOfRoute != null}">
                            ${weighing.typeOfRoute}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Вага (нетто), кг</h3>
                    <span class="info-part-info">17560.0</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Вага (брутто), кг</h3>
                    <span class="info-part-info">
                        <c:if test="${weighing.bruttoWeight == null}">
                            -
                        </c:if>
                        <c:if test="${weighing.bruttoWeight != null}">
                            ${weighing.bruttoWeight}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Вологість зерна</h3>
                    <span class="info-part-info">
                        <c:if test="${weighing.seedMoisture == null}">
                            -
                        </c:if>
                        <c:if test="${weighing.seedMoisture != null}">
                            ${weighing.seedMoisture}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Сміттєва домішка</h3>
                    <span class="info-part-info">
                        <c:if test="${weighing.seedAdmixture == null}">
                            -
                        </c:if>
                        <c:if test="${weighing.seedAdmixture != null}">
                            ${weighing.seedAdmixture}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Урожай з поля</h3>
                    <span class="info-part-info">
                        <c:if test="${weighing.field == null}">
                            -
                        </c:if>
                        <c:if test="${weighing.field != null}">
                            <a href="/field/${weighing.field.id}" class="link">${weighing.field.name}</a>
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Час відправки з поля</h3>
                    <span class="info-part-info">
                        <c:if test="${weighing.departureFromFieldTime == null}">
                            -
                        </c:if>
                        <c:if test="${weighing.departureFromFieldTime != null}">
                            ${weighing.departureFromFieldTime}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Довжина треку</h3>
                    <span class="info-part-info">
                        <c:if test="${weighing.trackLength == null}">
                            -
                        </c:if>
                        <c:if test="${weighing.trackLength != null}">
                            ${weighing.trackLength}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Опис</h3>
                    <span class="info-part-info">
                        <c:if test="${weighing.description == null}">
                            -
                        </c:if>
                        <c:if test="${weighing.description != null}">
                            ${weighing.description}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Номер ТТН</h3>
                    <span class="info-part-info">
                        <c:if test="${weighing.waybillNumber == null}">
                            -
                        </c:if>
                        <c:if test="${weighing.waybillNumber != null}">
                            ${weighing.waybillNumber}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Дата ТТН</h3>
                    <span class="info-part-info">
                        <c:if test="${weighing.waybillDate == null}">
                            -
                        </c:if>
                        <c:if test="${weighing.waybillDate != null}">
                            ${weighing.waybillDate}
                        </c:if>
                    </span>
                </div>
            </div>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>