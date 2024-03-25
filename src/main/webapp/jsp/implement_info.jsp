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