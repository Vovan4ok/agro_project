<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${implement.name}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../../styles/implement_info.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${implement.name}</h1>
        <span class="field-group">${implement.manufacturer} ${implement.model}</span>
    </div>
    <div class="main-content">
        <ul class="field-menu">
            <li class="field-menu-item">
                <a href="/implements/${implement.id}" class="field-menu-link" style="font-weight: bold;">Інформація про обладнання</a>
            </li>
            <li class="field-menu-item">
                <a href="/implements/${implement.id}/notes" class="field-menu-link">Нотатки</a>
            </li>
            <li class="field-menu-item">
                <a href="/implements/${implement.id}/tasks" class="field-menu-link">Завдання</a>
            </li>
            <li class="field-menu-item">
                <a href="/implements/${implement.id}/alerts" class="field-menu-link">Тривоги</a>
            </li>
            <li class="field-menu-item">
                <a href="/implements/${implement.id}/maintenances" class="field-menu-link">Обслуговування</a>
            </li>
            <li class="field-menu-item">
                <a href="/implements/${implement.id}/regions" class="field-menu-link">Регіон</a>
            </li>
        </ul>
        <div class="content-info">
            <h2 class="content-header">Інформація про обладнання</h2>
            <div class="info-block">
                <div class="info-part">
                    <h3 class="info-part-header">Назва</h3>
                    <span class="info-part-info">${implement.name}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Тип обладнання</h3>
                    <span class="info-part-info">
                        <c:choose>
                            <c:when test="${implement.implementType == 'planter'}">Сівалка</c:when>
                            <c:when test="${implement.implementType == 'cultivator'}">Культиватор</c:when>
                            <c:when test="${implement.implementType == 'roller'}">Каток</c:when>
                            <c:when test="${implement.implementType == 'sprayer'}">Розпилювач</c:when>
                            <c:when test="${implement.implementType == 'plow'}">Плуг</c:when>
                            <c:when test="${implement.implementType == 'harrow'}">Борона</c:when>
                            <c:when test="${implement.implementType == 'spreader'}">Розкидач</c:when>
                            <c:when test="${implement.implementType == 'disk'}">Диск</c:when>
                            <c:when test="${implement.implementType == 'reaper'}">Жатка</c:when>
                            <c:when test="${implement.implementType == 'baler'}">Прес-підбирач</c:when>
                            <c:when test="${implement.implementType == 'brush_cutter'}">Подрібнювач</c:when>
                            <c:when test="${implement.implementType == 'subsoiler'}">Глибокорозпушувач</c:when>
                            <c:when test="${implement.implementType == 'hindcarriage'}">Причіп</c:when>
                            <c:when test="${implement.implementType == 'barrel'}">Причіпна бочка</c:when>
                            <c:when test="${implement.implementType == 'other'}">Інше</c:when>
                            <c:when test="${implement.implementType == 'shredders'}">Каток</c:when>
                            <c:when test="${implement.implementType == 'mower'}">Косарка</c:when>
                            <c:when test="${implement.implementType == 'bunker'}">Перевантажувач</c:when>
                            <c:when test="${implement.implementType == 'disc_harrow'}">Подрібнювач</c:when>
                        </c:choose>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Виробник</h3>
                    <span class="info-part-info">${implement.manufacturer}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Модель</h3>
                    <span class="info-part-info">${implement.model}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Офіційна ширина, м</h3>
                    <span class="info-part-info">
                        <c:if test="${implement.officialWidth == null}">
                            -
                        </c:if>
                        <c:if test="${implement.officialWidth != null}">
                            ${implement.officialWidth}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Мін. ширина, м</h3>
                    <span class="info-part-info">
                        <c:if test="${implement.minWidth == null}">
                            -
                        </c:if>
                        <c:if test="${implement.minWidth != null}">
                            ${implement.minWidth}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Макс. ширина, м</h3>
                    <span class="info-part-info">
                        <c:if test="${implement.maxWidth == null}">
                            -
                        </c:if>
                        <c:if test="${implement.maxWidth != null}">
                            ${implement.maxWidth}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Ширина, м</h3>
                    <span class="info-part-info">
                        <c:if test="${implement.width == null}">
                            -
                        </c:if>
                        <c:if test="${implement.width != null}">
                            ${implement.width}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Рік випуску</h3>
                    <span class="info-part-info">
                        <c:if test="${implement.year == null}">
                            -
                        </c:if>
                        <c:if test="${implement.year != null}">
                            ${implement.year}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Реєстраційний номер</h3>
                    <span class="info-part-info">
                        <c:if test="${implement.registrationNumber == null}">
                            -
                        </c:if>
                        <c:if test="${implement.registrationNumber != null}">
                            ${implement.registrationNumber}
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Інвентарний номер</h3>
                    <span class="info-part-info">
                        <c:if test="${implement.inventoryNumber == null}">
                            -
                        </c:if>
                        <c:if test="${implement.inventoryNumber != null}">
                            ${implement.inventoryNumber}
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