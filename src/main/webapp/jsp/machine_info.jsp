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
    <link rel="stylesheet" href="../styles/machine_info.css">
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
                <a href="/machines/${machine.id}" class="field-menu-link" style="font-weight: bold;">Інформація про машину</a>
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
                <a href="/machines/${machine.id}/weighings" class="field-menu-link">Зважування</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/regions" class="field-menu-link">Регіон</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/photos" class="field-menu-link">Фото</a>
            </li>
        </ul>
        <div class="content-info">
            <h2 class="content-header">Інформація про машину</h2>
            <div class="info-block">
                <div class="info-part">
                    <h3 class="info-part-header">Назва</h3>
                    <span class="info-part-info">${machine.name}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Тип машини</h3>
                    <span class="info-part-info">
                        <c:if test="${machine.machineType.equals('agri')}">
                            Агро
                        </c:if>
                        <c:if test="${machine.machineType.equals('transport')}">
                            Транспорт
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Підтип машини</h3>
                    <span class="info-part-info">
                        <c:choose>
                            <c:when test="${machine.machineSubtype == null}">
                                -
                            </c:when>
                            <c:when test="${machine.machineSubtype == 'tractor'}">
                                Трактор
                            </c:when>
                            <c:when test="${machine.machineSubtype == 'lorrie'}">
                                Вантажівка
                            </c:when>
                            <c:when test="${machine.machineSubtype == 'harvester'}">
                                Комбайн
                            </c:when>
                            <c:when test="${machine.machineSubtype == 'tipper'}">
                                Самоскид
                            </c:when>
                            <c:when test="${machine.machineSubtype == 'truck_crane'}">
                                Автокран
                            </c:when>
                            <c:when test="${machine.machineSubtype == 'car'}">
                                Машина
                            </c:when>
                            <c:when test="${machine.machineSubtype == 'telehandler'}">
                                Телескопічний навантажувач
                            </c:when>
                            <c:when test="${machine.machineSubtype == 'minibus'}">
                                Мікроавтобус
                            </c:when>
                            <c:when test="${machine.machineSubtype == 'sprayer'}">
                                Розпилювач
                            </c:when>
                            <c:when test="${machine.machineSubtype == 'fuel_bowser'}">
                                Паливний насос
                            </c:when>
                        </c:choose>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Група машин</h3>
                    <span class="info-part-info">${machine.machineGroup.name}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Виробник</h3>
                    <span class="info-part-info">${machine.manufacturer}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Модель</h3>
                    <span class="info-part-info">${machine.model}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Рік випуску</h3>
                    <span class="info-part-info">
                        <c:if test="${machine.year == null}">
                            -
                        </c:if>
                        <c:if test="${machine.year != null}">
                            ${machine.year}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Тип пального</h3>
                    <span class="info-part-info">${machine.fuelType.name}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Реєстраційний номер</h3>
                    <span class="info-part-info">
                        <c:if test="${machine.registrationNumber == null}">
                            -
                        </c:if>
                        <c:if test="${machine.registrationNumber != null}">
                            ${machine.registrationNumber}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Водій за замовчуванням</h3>
                    <span class="info-part-info">
                        <c:if test="${machine.defaultDriver != null}">
                            <a href="/users/${machine.defaultDriver.id}" class="username">${machine.defaultDriver.username}</a>
                        </c:if>
                        <c:if test="${machine.defaultDriver == null}">
                            -
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Обладнання за замовчуванням</h3>
                    <span class="info-part-info">
                        <c:if test="${machine.defaultImplement != null}">
                            <a href="/implements/${machine.defaultImplement.id}" class="username">${machine.defaultImplement.name}</a>
                        </c:if>
                        <c:if test="${machine.defaultImplement == null}">
                            -
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