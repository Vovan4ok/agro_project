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
    <link rel="stylesheet" href="../../styles/field_agro_operations.css">
    <script src="../../js/field_agro_operations.js"></script>
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
        <h1 class="field-name">${field.name}</h1>
        <span class="field-group">${field.fieldGroup.groupFolder.parent.name}/${field.fieldGroup.groupFolder.name}/${field.fieldGroup.name}</span>
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
        <div class="content-info">
            <h2 class="content-header">Агрооперації</h2>
            <input type="text" placeholder="Пошук агрооперацій" class="main-content-search">
            <table class="main-table">
                <tr class="table-row">
                    <th class="table-th status-cell">Статус</th>
                    <th class="table-th shape-cell">Завершена площа, га</th>
                    <th class="table-th season-cell">Сезон</th>
                    <th class="table-th planned-dates-cell">Заплановані терміни</th>
                    <th class="table-th start-time-cell">Час початку</th>
                    <th class="table-th end-time-cell">Час завершення</th>
                    <th class="table-th work-type-cell">Вид робіт</th>
                </tr>

                <c:forEach var="agro_operation" items="${agro_operations}">
                    <tr class="table-row table-td-row">
                        <td class="table-td status-cell">
                            <div class="status-info-block">
                                <p class="status-info">${agro_operation.status}</p>
                                <p class="end-date-info">
                                    <c:if test="${agro_operation.completedDate != null}">
                                        ${agro_operation.completedDate}
                                    </c:if>
                                    <c:if test="${agro_operation.completedDate == null}">
                                        -
                                    </c:if>
                                </p>
                            </div>
                        </td>
                        <td class="table-td shape-cell">
                            <div class="shape-info-block">
                                <p class="shape-info">
                                    <c:if test="${agro_operation.coveredArea != null && agro_operation.coveredAreaByTrack != null}">
                                        ${agro_operation.coveredArea},<br>по треку ${agro_operation.coveredAreaByTrack}
                                    </c:if>
                                    <c:if test="${agro_operation.coveredArea == null && agro_operation.coveredAreaByTrack == null}">
                                        0,<br>по треку 0
                                    </c:if>
                                </p>
                                <p class="shape-percentage">
                                    <c:if test="${agro_operation.coveredArea == null || agro_operation.coveredAreaByTrack == null || agro_operation.coveredArea == 0}">
                                        0
                                    </c:if>
                                    <c:if test="${agro_operation.coveredArea != null && agro_operation.coveredAreaByTrack != null && agro_operation.coveredArea != 0}">
                                        ${agro_operation.coveredAreaByTrack / agro_operation.coveredArea * 100}
                                    </c:if>
                                    %
                                </p>
                            </div>
                        </td>
                        <td class="table-td season-cell">${agro_operation.season}</td>
                        <td class="table-td planned-dates-cell">${agro_operation.plannedStartDate} -<br>${agro_operation.plannedEndDate}</td>
                        <td class="table-td start-time-cell">
                            <c:if test="${agro_operation.actualStartDatetime != null}">
                                ${agro_operation.actualStartDatetime}
                            </c:if>
                            <c:if test="${agro_operation.actualStartDatetime == null}">
                                -
                            </c:if>
                        </td>
                        <td class="table-td end-time-cell">
                            <c:if test="${agro_operation.completedDatetime != null}">
                                ${agro_operation.completedDatetime}
                            </c:if>
                            <c:if test="${agro_operation.completedDatetime == null}">
                                -
                            </c:if>
                        </td>
                        <td class="table-td work-type-cell">
                            <div class="work-type-info">
                                <a href="/fields/${field.id}/agro_operations/${agro_operation.id}" class="agrooperation-link">№${agro_operation.id} ${agro_operation.workType.name}/${agro_operation.workType.workTypeGroup.name}</a>
                                <p class="agri-work-plan">План агро-роботи:
                                    <c:if test="${agro_operation.agriWorkPlan != null}">
                                        <a href="/agri_work_plans/${agro_operation.agriWorkPlan.id}">${agro_operation.agriWorkPlan.id}</a>
                                    </c:if>
                                    <c:if test="${agro_operation.agriWorkPlan == null}">
                                        -
                                    </c:if>
                                </p>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
            </table>
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