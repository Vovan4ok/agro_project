<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${field.name}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../../../styles/field_agro_operation_info.css">
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
                <c:forEach var="season" items="${seasons}">
                    <option value="${season.year}">${season.year}</option>
                </c:forEach>
            </select>
        </div>
        <img src="../../../images/user-avatar.png" alt="аватар">
    </div>
</header>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${field.name}</h1>
        <span class="field-group">${field.fieldGroup.groupFolder.parent.name}/${field.fieldGroup.groupFolder.name}/${field.fieldGroup.name}"</span>
    </div>
    <div class="main-content">
        <ul class="field-menu">
            <li class="field-menu-item">
                <a href="/fields/${field.id}" class="field-menu-link" >Інформація про поле</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/agro_operations" class="field-menu-link" style="font-weight: bold;">Агрооперації</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/machine_tasks" class="field-menu-link">Роботи машин</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/scouting_tasks" class="field-menu-link">Завдання на огляд</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/scout_reports" class="field-menu-link">Звіти оглядів</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/shape_land_parcels" class="field-menu-link">Площа поля та ділянки</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/notes" class="field-menu-link">Нотатки</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/alerts" class="field-menu-link">Тривоги</a>
            </li>
        </ul>
        <div>
            <div class="content-info">
                <h1 class="content-header">${agro_operation.id} ${agro_operation.workType.name}/${agro_operation.workType.workTypeGroup.name}</h1>
                <h3 class="agri-work-plan">План агророботи:
                    <c:if test="${agro_operation.agriWorkPlan != null}">
                        <a href="/agri_work_plans/${agro_operation.agriWorkPlan.id}" class="agri-work-plan-link" style="color: #8E8E8E; transition: font-weight 0.5s;">${agro_operation.agriWorkPlan.id} ${agro_operation.agriWorkPlan.workType.name}/${agro_operation.agriWorkPlan.workType.workTypeGroup.name}</a>
                    </c:if>
                    <c:if test="${agro_operation.agriWorkPlan == null}">
                        -
                    </c:if>
                </h3>
                <p class="status-block"><span style="font-weight: 500;">Статус:</span> ${agro_operation.status}</p>
                <div class="info-block">
                    <div class="info-block-part part1">
                        <h5 class="info-block-header">Площа поля</h5>
                        <div class="info-block-small-block">
                            <span class="info-block-small-block-header">Оборблювальна</span>
                            <span class="info-block-small-block-info">${agro_operation.fieldShape.tillableArea}</span>
                        </div>
                        <div class="info-block-small-block">
                            <span class="info-block-small-block-header">Офіційна</span>
                            <span class="info-block-small-block-info">${agro_operation.fieldShape.legalArea}</span>
                        </div>
                        <div class="info-block-small-block">
                            <span class="info-block-small-block-header">Розрахована</span>
                            <span class="info-block-small-block-info">${agro_operation.fieldShape.calculatedArea}</span>
                        </div>
                    </div>
                    <div class="info-block-part part2">
                        <h5 class="info-block-header">План агрооперації</h5>
                        <div class="info-block-small-block">
                            <span class="info-block-small-block-header">Сезон</span>
                            <span class="info-block-small-block-info">${agro_operation.season}</span>
                        </div>
                        <div class="info-block-small-block">
                            <span class="info-block-small-block-header">Терміни</span>
                            <span class="info-block-small-block-info">${agro_operation.plannedStartDate} - ${agro_operation.plannedEndDate}</span>
                        </div>
                        <div class="info-block-small-block">
                            <span class="info-block-small-block-header">Запланована площа</span>
                            <span class="info-block-small-block-info">${agro_operation.plannedArea}</span>
                        </div>
                    </div>
                    <div class="info-block-part part3">
                        <h5 class="info-block-header">Результати агрооперації</h5>
                        <div class="info-block-small-block">
                            <span class="info-block-small-block-header">Терміни</span>
                            <span class="info-block-small-block-info">
                                ${agro_operation.actualStartDatetime} - ${agro_operation.completedDate}
                            </span>
                        </div>
                        <div class="info-block-small-block">
                            <span class="info-block-small-block-header">Завершена площа: </span>
                            <span class="info-block-small-block-info">${agro_operation.completedArea}</span>
                        </div>
                    </div>
                    <div class="info-block-part part4">
                        <h5 class="info-block-header">Дані агрооперації</h5>
                        <div class="info-block-small-block">
                            <span class="info-block-small-block-header">Оброблена площа</span>
                            <span class="info-block-small-block-info">
                                <c:if test="${agro_operation.coveredArea} == null}">
                                    -
                                </c:if>
                                <c:if test="${agro_operation.coveredArea} != null}">
                                    ${agro_operation.coveredArea}
                                </c:if>
                            </span>
                        </div>
                        <div class="info-block-small-block">
                            <span class="info-block-small-block-header">Оброблена площа по треку</span>
                            <span class="info-block-small-block-info">
                                <c:if test="${agro_operation.coveredAreaByTrack == null}">
                                    -
                                </c:if>
                                <c:if test="${agro_operation.coveredAreaByTrack != null}">
                                    ${agro_operation.coveredAreaByTrack}
                                </c:if>
                            </span>
                        </div>
                        <div class="info-block-small-block">
                            <span class="info-block-small-block-header">Площа роботи машини</span>
                            <span class="info-block-small-block-info">
                                <c:if test="${agro_operation.machineWorkArea} == null}">
                                    -
                                </c:if>
                                <c:if test="${agro_operation.machineWorkArea} != null}">
                                    ${agro_operation.machineWorkArea}
                                </c:if>
                            </span>
                        </div>
                    </div>
                </div>
            </div>
            <div class="content-info" style="margin-top: 50px; width: 940px;">
                <h1 class="content-header" style="margin: 0 auto;">Роботи машин</h1>
                <table class="main-table">
                    <tr class="table-row">
                        <th class="table-th machine-task-cell">Робота машини</th>
                        <th class="table-th machine-cell">Машина</th>
                        <th class="table-th implement-cell">Обладнання</th>
                        <th class="table-th result-cell">Результати роботи</th>
                    </tr>
                    <c:forEach var="machine_task_dto" items="${machine_tasks_dtos}">
                        <tr class="table-row">
                            <td class="table-td machine-task-cell">
                                <a href="/machines/${machine_task_dto.machineTask.machine.id}/tasks/${machine_task_dto.machineTask.id}" class="table-link">${machine_task_dto.machineTask.id} ${machine_task_dto.machineTask.workType.name}/${machine_task_dto.machineTask.workType.workTypeGroup.name}</a>
                                <p class="date-start">${machine_task_dto.machineTask.startTime} -</p>
                                <p class="date-end">${machine_task_dto.machineTask.endTime}</p>
                            </td>
                            <td class="table-td machine-cell">
                                <div class="machine-cell-wrapper">
                                    <a href="/machines/${machine_task_dto.machineTask.machine.id}" class="table-link">${machine_task_dto.machineTask.machine.name}</a>
                                    <c:if test="${machine_task_dto.machineTask.driver != null}">
                                        <a href="/users/${machine_task_dto.machineTask.driver.id}" class="driver-link">${machine_task_dto.machineTask.driver.username}</a>
                                    </c:if>
                                    <c:if test="${machine_task_dto.machineTask.driver == null}">
                                        <p style="font-size: 14px; margin-top: 20px; color: #8E8E8E;">Інформація про водія відсутня</p>
                                    </c:if>
                                </div>
                            </td>
                            <td class="table-td implement-cell">
                                <c:if test="${machine_task_dto.implement != null}">
                                    <a href="/implements/${machine_task_dto.implement.id}" class="table-link">${machine_task_dto.implement.name}</a>
                                </c:if>
                                <c:if test="${machine_task_dto.implement == null}">
                                    -
                                </c:if>
                            </td>
                            <td class="table-td result-cell">
                                <div class="info-block-small-block">
                                    <span class="info-block-small-block-header">Оброблена площа</span>
                                    <span class="info-block-small-block-info">${machine_task_dto.machineTask.coveredArea}</span>
                                </div>
                                <div class="info-block-small-block">
                                    <span class="info-block-small-block-header">Площа роботи машини</span>
                                    <span class="info-block-small-block-info">${machine_task_dto.machineTask.workArea}</span>
                                </div>
                                <div class="info-block-small-block">
                                    <span class="info-block-small-block-header">Витрати палива</span>
                                    <span class="info-block-small-block-info">${machine_task_dto.machineTask.fuelConsumption} л (${machine_task_dto.machineTask.fuelConsumptionPerHa} л/га)</span>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
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