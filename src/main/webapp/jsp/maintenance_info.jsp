<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Обслуговування</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../../styles/maintenance_info.css">
</head>
<body class="body">
<header class="header">
    <img src="../../images/logo.png" alt="лого" class="header-image">
    <nav class="header-menu">
        <ul class="header-menu-list">
            <li class="header-menu-list-item">
                <a href="/fields" class="header-menu-list-item-link">Поля</a>
            </li>
            <li class="header-menu-list-item">
                <a class="header-menu-list-item-link dropdown">Машини</a>
                <ul class="dropdown-list">
                    <li class="dropdown-list-item">
                        <a href="/machines" class="dropdown-list-item-link">Список машин</a>
                    </li>
                    <li class="dropdown-list-item">
                        <a href="/implements" class="dropdown-list-item-link">Список обладнання</a>
                    </li>
                    <li class="dropdown-list-item">
                        <a href="/maintenances" class="dropdown-list-item-link">Список технічних обслуговувань</a>
                    </li>
                    <li class="dropdown-list-item">
                        <a href="/spare_parts" class="dropdown-list-item-link">Список витратних матеріалів</a>
                    </li>
                </ul>
            </li>
            <li class="header-menu-list-item">
                <a class="header-menu-list-item-link dropdown">Агро</a>
                <ul class="dropdown-list">
                    <li class="dropdown-list-item">
                        <a href="/agro_operations" class="dropdown-list-item-link">Список агрооперацій</a>
                    </li>
                    <li class="dropdown-list-item">
                        <a href="/agri_work_plans" class="dropdown-list-item-link">Список планування робіт</a>
                    </li>
                    <li class="dropdown-list-item">
                        <a href="/scouting_tasks" class="dropdown-list-item-link">Список завдань на огляд</a>
                    </li>
                </ul>
            </li>
            <li class="header-menu-list-item">
                <a class="header-menu-list-item-link dropdown">WMS</a>
                <ul class="dropdown-list">
                    <li class="dropdown-list-item">
                        <a href="/warehouses" class="dropdown-list-item-link">Список складів</a>
                    </li>
                    <li class="dropdown-list-item">
                        <a href="/wh_items" class="dropdown-list-item-link">Список номенклатури</a>
                    </li>
                    <li class="dropdown-list-item">
                        <a href="/counterparties" class="dropdown-list-item-link">Список контрагентів</a>
                    </li>
                    <li class="dropdown-list-item">
                        <a href="/units" class="dropdown-list-item-link">Список одиниць вимірювань</a>
                    </li>
                </ul>
            </li>
            <li class="header-menu-list-item">
                <a class="header-menu-list-item-link dropdown">Ще</a>
                <ul class="dropdown-list">
                    <li class="dropdown-list-item">
                        <a href="/seeds" class="dropdown-list-item-link">Список насіння</a>
                    </li>
                    <li class="dropdown-list-item">
                        <a href="/fertilizers" class="dropdown-list-item-link">Список добрив</a>
                    </li>
                    <li class="dropdown-list-item">
                        <a href="/chemicals" class="dropdown-list-item-link">Список засобів захисту рослин</a>
                    </li>
                    <li class="dropdown-list-item">
                        <a href="/land_parcels" class="dropdown-list-item-link">Список земельних ділянок</a>
                    </li>
                    <li class="dropdown-list-item">
                        <a href="/additional_objects" class="dropdown-list-item-link">Список об'єктів</a>
                    </li>
                </ul>
            </li>
        </ul>
    </nav>
    <div class="header-right-block">
        <div class="header-right-block-season">
            <label for="season-select" class="season-label">Сезон:</label>
            <select name="season-select" id="season-select">
                <c:forEach var="season" items="${seasons}">
                    <option value="${season.year}">${season.year}</option>
                </c:forEach>
            </select>
        </div>
        <img src="../../images/user-avatar.png" alt="аватар">
    </div>
</header>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">Обслуговування ${maintenance_record_row.maintenanceRecord.id} ${maintenance_record_row.maintenanceType.maintenanceTypeGroup.name}/${maintenance_record_row.maintenanceType.name}</h1>
    </div>
    <div class="main-content">
        <div class="info-block">
            <div class="info-part">
                <h3 class="info-part-header">Вид ТО</h3>
                <span class="info-part-info">${maintenance_record_row.maintenanceType.maintenanceTypeGroup.name}/${maintenance_record_row.maintenanceType.name}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Статус</h3>
                <span class="info-part-info">${maintenance_record_row.maintenanceRecord.status}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Сезон</h3>
                <span class="info-part-info">${maintenance_record_row.maintenanceRecord.season}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Техніка</h3>
                <span class="info-part-info">
                    <a href="/<c:if test="${maintenance_record_row.maintenanceRecord.maintainableType.equals('Machine')}">machines</c:if><c:if test="${maintenance_record_row.maintenanceRecord.maintainableType.equals('Implement')}">implements</c:if>/${machine.id}" class="link">${machine.name}</a>
                </span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Планові терміни</h3>
                <span class="info-part-info">${maintenance_record_row.maintenanceRecord.plannedStartTime} -<br>
                    ${maintenance_record_row.maintenanceRecord.plannedEndTime}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Реальні терміни</h3>
                <span class="info-part-info">${maintenance_record_row.maintenanceRecord.startTime} -<br>
                    ${maintenance_record_row.maintenanceRecord.endTime}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Мотогодини, год</h3>
                <span class="info-part-info">
                    <c:if test="${maintenance_record_row.maintenanceRecord.motohours == null}">
                        -
                    </c:if>
                    <c:if test="${maintenance_record_row.maintenanceRecord.motohours != null}">
                        ${maintenance_record_row.maintenanceRecord.motohours}
                    </c:if>
                </span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Пробіг, км</h3>
                <span class="info-part-info">
                    <c:if test="${maintenance_record_row.maintenanceRecord.mileage == null}">
                        -
                    </c:if>
                    <c:if test="${maintenance_record_row.maintenanceRecord.mileage != null}">
                        ${maintenance_record_row.maintenanceRecord.mileage}
                    </c:if>
                </span>
            </div>
        </div>
    </div>
</main>
<footer class="footer">
    <div class="footer-info">
        <div class="footer-contacts-block">
            <h1 class="footer-contacts-block-header">Контакти</h1>
            <div class="footer-contacts-block-info-phone">
                <div>
                    <span class="footer-text-header">Телефон:</span>
                    <span class="footer-text-info">+38 (067) 690-58-26</span>
                </div>
                <div class="footer-contacts-block-info-email">
                    <span class="footer-text-header">E-mail:</span>
                    <span class="footer-text-info">info@agrocontrol.net</span>
                </div>
            </div>
        </div>
        <div class="footer-about-block">
            <h1 class="footer-about-block-header">Про нас</h1>
            <div class="footer-about-block-info">
                <div class="footer-about-block-info-website">
                    <span class="footer-text-header">Сайт:</span>
                    <a href="https://agrocontrol.net/" class="footer-text-info">https://agrocontrol.net/</a>
                </div>
                <div class="footer-about-block-info-facebook">
                    <span class="footer-text-header">Facebook:</span>
                    <a href="http://www.facebook.com/agrocontrol.net" class="footer-text-info">http://www.facebook.com/agrocontrol.net</a>
                </div>
            </div>
        </div>
    </div>
    <span class="rights-text">© 2024–24 AgroControl. All rights reserved.</span>
</footer>
</body>
</html>