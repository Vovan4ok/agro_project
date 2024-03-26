<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${chemical.name}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../../styles/chemical_info.css">
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
                <option value="2024">2024</option>
                <option value="2024">2023</option>
                <option value="2024">2022</option>
                <option value="2024">2021</option>
                <option value="2024">2020</option>
            </select>
        </div>
        <img src="../../images/user-avatar.png" alt="аватар">
    </div>
</header>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${chemical.name}</h1>
    </div>
    <div class="main-content">
        <div class="block-info">
            <h5 class="block-info-header">Тип</h5>
            <span class="block-info-text">
                <c:choose>
                    <c:when test="${chemical.chemicalType.equals('adjuvant')}">Ад'ювант</c:when>
                    <c:when test="${chemical.chemicalType.equals('biological_supplements')}">Біологічна добавка</c:when>
                    <c:when test="${chemical.chemicalType.equals('defoliants_desiccants')}">Дефоліанти десиканти</c:when>
                    <c:when test="${chemical.chemicalType.equals('fungicide')}">Фунгіцид</c:when>
                    <c:when test="${chemical.chemicalType.equals('growth_regulator')}">Регулятор росту</c:when>
                    <c:when test="${chemical.chemicalType.equals('herbicide')}">Гербіцид</c:when>
                    <c:when test="${chemical.chemicalType.equals('insecticide')}">Інсектицид</c:when>
                    <c:when test="${chemical.chemicalType.equals('microbiological_agent')}">Мікробіологічний засіб</c:when>
                    <c:when test="${chemical.chemicalType.equals('nematicides')}">Нематицид</c:when>
                    <c:when test="${chemical.chemicalType.equals('nutrients')}">Поживна речовина</c:when>
                    <c:when test="${chemical.chemicalType.equals('other')}">Інше</c:when>
                    <c:when test="${chemical.chemicalType.equals('rodenticide')}">Родентицид</c:when>
                    <c:when test="${chemical.chemicalType.equals('seed_treatment')}">Обробка насіння</c:when>
                </c:choose>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Одиниця виміру</h5>
            <span class="block-info-text">${chemical.unitsOfMeasurement}</span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Ступінь токсичності</h5>
            <span class="block-info-text">
                <c:if test="${chemical.toxicityClass == null}">
                    -
                </c:if>
                <c:if test="${chemical.toxicityClass != null}">
                    ${chemical.toxicityClass}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Термін дії</h5>
            <span class="block-info-text">
                <c:if test="${chemical.actionTerm == null}">
                    -
                </c:if>
                <c:if test="${chemical.actionTerm != null}">
                    ${chemical.actionTerm} ${chemical.actionTermUnits}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Діюча речовина</h5>
            <span class="block-info-text">
                <c:if test="${chemical.activeSubstance == null}">
                    -
                </c:if>
                <c:if test="${chemical.activeSubstance != null}">
                    ${chemical.activeSubstance}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Спосіб дії</h5>
            <span class="block-info-text">
                <c:if test="${chemical.influenceMethod == null}">
                    -
                </c:if>
                <c:if test="${chemical.influenceMethod != null}">
                    ${chemical.influenceMethod}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Рекомендований термін ізоляції бджіл</h5>
            <span class="block-info-text">
                <c:if test="${chemical.beesIsolatingRecommendedTermUnits == null}">
                    -
                </c:if>
                <c:if test="${chemical.beesIsolatingRecommendedTermUnits != null}">
                    ${chemical.beesIsolatingRecommendedTermUnits}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Термін продажу</h5>
            <span class="block-info-text">
                <c:if test="${chemical.saleTerm == null}">
                    -
                </c:if>
                <c:if test="${chemical.saleTerm != null}">
                    ${chemical.saleTerm}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Термін використання</h5>
            <span class="block-info-text">
                <c:if test="${chemical.termOfUse == null}">
                    -
                </c:if>
                <c:if test="${chemical.termOfUse != null}">
                    ${chemical.termOfUse}
                </c:if>
            </span>
        </div>
        <div class="block-info">
            <h5 class="block-info-header">Додаткова інформація</h5>
            <span class="block-info-text">
                <c:if test="${chemical.additionalInfo == null}">
                    -
                </c:if>
                <c:if test="${chemical.additionalInfo != null}">
                    ${chemical.additionalInfo}
                </c:if></span>
        </div>
        <div class="block-info" style="margin-bottom: 0;">
            <h5 class="block-info-header">Опис</h5>
            <span class="block-info-text">
                <c:if test="${chemical.description == null}">
                    -
                </c:if>
                <c:if test="${chemical.description != null}">
                    ${chemical.description}
                </c:if>
            </span>
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