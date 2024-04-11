<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список агрооперацій</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/agro_operations.css">
    <script src="${pageContext.request.contextPath}/js/agro_operations.js"></script>
    <script src="${pageContext.request.contextPath}/js/season_filter.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Агрооперації</h1>
        <input type="text" class="main-content-search" placeholder="Пошук агрооперацій">
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th status-cell">Статус</th>
                <th class="table-th field-cell">Поле</th>
                <th class="table-th season-cell">Сезон</th>
                <th class="table-th plan-cell">Заплановані терміни</th>
                <th class="table-th start-cell">Час початку</th>
                <th class="table-th end-cell">Час завершення</th>
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
                    <td class="table-td field-cell">
                        <a href="/fields/${agro_operation.field.id}" class="table-link">${agro_operation.field.name}</a>
                    </td>
                    <td class="table-td season-cell">${agro_operation.season}</td>
                    <td class="table-td plan-cell">${agro_operation.plannedStartDate} -<br>
                            ${agro_operation.plannedEndDate}</td>
                    <td class="table-td start-cell">
                        <c:if test="${agro_operation.actualStartDatetime != null}">
                            ${agro_operation.actualStartDatetime}
                        </c:if>
                        <c:if test="${agro_operation.actualStartDatetime == null}">
                            -
                        </c:if>
                    </td>
                    <td class="table-td end-cell">
                        <c:if test="${agro_operation.completedDatetime != null}">
                            ${agro_operation.completedDatetime}
                        </c:if>
                        <c:if test="${agro_operation.completedDatetime == null}">
                            -
                        </c:if>
                    </td>
                    <td class="table-td work-type-cell">
                        <div class="work-type-info">
                            <a href="/fields/${agro_operation.field.id}/agro_operations/${agro_operation.id}" class="table-link">№${agro_operation.id} ${agro_operation.workType.name}/${agro_operation.workType.workTypeGroup.name}</a>
                            <p class="agri-work-plan">План агро-роботи:
                                <c:if test="${agro_operation.agriWorkPlan != null}">
                                    <a href="/agri_work_plans/${agro_operation.agriWorkPlan.id}" class="table-link">${agro_operation.agriWorkPlan.id}</a>
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
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>