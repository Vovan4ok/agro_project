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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/field_agro_operations.css">
    <script src="${pageContext.request.contextPath}/js/field_agro_operations.js"></script>
    <script src="${pageContext.request.contextPath}/js/season_filter.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
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
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>