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
    <link rel="stylesheet" href="../../../styles/machine_task_info.css">
</head>
<body class="body">
<header class="header">
    <img src="../../../images/logo.png" alt="лого" class="header-image">
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
        <img src="../../../images/user-avatar.png" alt="аватар">
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
                <a href="/machines/${machine.id}" class="field-menu-link">Інформація про машину</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/notes" class="field-menu-link">Нотатки</a>
            </li>
            <li class="field-menu-item">
                <a href="/machines/${machine.id}/tasks" class="field-menu-link" style="font-weight: bold;">Завдання</a>
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
            <h2 class="content-header">Завдання ${machine_task_dto.machineTask.id}</h2>
            <div class="info-block">
                <div class="info-part">
                    <h3 class="info-part-header">Вид робіт</h3>
                    <span class="info-part-info">${machine_task_dto.machineTask.workType.workTypeGroup.name}/${machine_task_dto.machineTask.workType.name}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Сезон</h3>
                    <span class="info-part-info">${machine_task_dto.machineTask.season}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Початок</h3>
                    <span class="info-part-info">${machine_task_dto.machineTask.startTime}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Кінець</h3>
                    <span class="info-part-info">${machine_task_dto.machineTask.endTime}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Пройдений шлях,<br> м</h3>
                    <span class="info-part-info">${machine_task_dto.machineTask.totalDistance}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Робоча дистанція,<br> м</h3>
                    <span class="info-part-info">${machine_task_dto.machineTask.workDistance}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Площа роботи машини,<br> га</h3>
                    <span class="info-part-info">${machine_task_dto.machineTask.workArea}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Оброблена площа,<br> га</h3>
                    <span class="info-part-info">${machine_task_dto.machineTask.coveredArea}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Витрати палива,<br> л</h3>
                    <span class="info-part-info">${machine_task_dto.machineTask.fuelConsumption}</span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Рівень на початку,<br> л</h3>
                    <span class="info-part-info">
                        <c:if test="${machine_task_dto.machineTask.startFuelLevel != null}">
                            ${machine_task_dto.machineTask.startFuelLevel}
                        </c:if>
                        <c:if test="${machine_task_dto.machineTask.startFuelLevel == null}">
                            -
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Рівень наприкінці,<br> л</h3>
                    <span class="info-part-info">
                        <c:if test="${machine_task_dto.machineTask.endFuelLevel != null}">
                            ${machine_task_dto.machineTask.endFuelLevel}
                        </c:if>
                        <c:if test="${machine_task_dto.machineTask.endFuelLevel == null}">
                            -
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Заправлено,<br> л</h3>
                    <span class="info-part-info">
                        <c:if test="${machine_task_dto.machineTask.refuel != null}">
                            ${machine_task_dto.machineTask.refuel}
                        </c:if>
                        <c:if test="${machine_task_dto.machineTask.refuel == null}">
                            -
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Водій</h3>
                    <span class="info-part-info">
                        <c:if test="${machine_task_dto.machineTask.driver != null}">
                            <a href="/users/${machine_task_dto.machineTask.driver.id}" class="username">${machine_task_dto.machineTask.driver.username}</a>
                        </c:if>
                        <c:if test="${machine_task_dto.machineTask.driver == null}">
                            -
                        </c:if>
                    </span>
                </div>
                <div class="info-part">
                    <h3 class="info-part-header">Обладнання</h3>
                    <span class="info-part-info">
                        <c:if test="${machine_task_dto.implement != null}">
                            <a href="/implements/${machine_task_dto.implement.id}" class="username">${machine_task_dto.implement.name}</a>
                        </c:if>
                        <c:if test="${machine_task_dto.implement != null}">
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