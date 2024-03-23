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
<header class="header">
    <img src="../images/logo.png" alt="лого" class="header-image">
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
        <img src="../images/user-avatar.png" alt="аватар">
    </div>
</header>
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