<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>План роботи ${agri_work_plan.id}</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../../styles/agri_work_plan_info.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">План роботи ${agri_work_plan.id} ${agri_work_plan.workType.name}/${agri_work_plan.workType.workTypeGroup.name}</h1>
    </div>
    <div class="main-content">
        <div class="info-block">
            <div class="info-part">
                <h3 class="info-part-header">Статус</h3>
                <span class="info-part-info">${agri_work_plan.status}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Тип роботи</h3>
                <span class="info-part-info">${agri_work_plan.workType.name}/${agri_work_plan.workType.workTypeGroup.name}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Сезон</h3>
                <span class="info-part-info">${agri_work_plan.season}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Заплановані терміни</h3>
                <span class="info-part-info">${agri_work_plan.plannedStartDate} -<br>
                    ${agri_work_plan.plannedEndDate}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Запланована площа, га</h3>
                <span class="info-part-info">${planned_area}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Оброблена площа, га</h3>
                <span class="info-part-info">${covered_area}</span>
            </div>
            <div class="info-part">
                <h3 class="info-part-header">Завершена площа, га</h3>
                <span class="info-part-info">${completed_area}</span>
            </div>
        </div>
    </div>
    <h2 class="small-header">Список полів</h2>
    <div class="main-content">
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th field-cell">Поле</th>
                <th class="table-th shape1-cell">Оброблена площа по треку, га</th>
                <th class="table-th shape2-cell">Запланована площа, га</th>
                <th class="table-th shape3-cell">Завершена площа, га</th>
                <th class="table-th start-cell">Початок</th>
                <th class="table-th end-cell">Завершення</th>
            </tr>
            <c:forEach var="agro_operation" items="${agro_operations}">
                <tr class="table-row">
                    <td class="table-td field-cell">
                        <a href="/fields/${agro_operation.field.id}" class="table-link">${agro_operation.field.name}</a>
                        <p class="field-shape">${agro_operation.fieldShape.calculatedArea}</p>
                    </td>
                    <td class="table-td shape1-cell">
                        <c:if test="${agro_operation.coveredAreaByTrack == null}">
                            0
                        </c:if>
                        <c:if test="${agro_operation.coveredAreaByTrack != null}">
                            ${agro_operation.coveredAreaByTrack}
                        </c:if>
                    </td>
                    <td class="table-td shape2-cell">
                        <c:if test="${agro_operation.plannedArea == null}">
                            0
                        </c:if>
                        <c:if test="${agro_operation.plannedArea != null}">
                            ${agro_operation.plannedArea}
                        </c:if>
                    </td>
                    <td class="table-td shape3-cell">
                        <c:if test="${agro_operation.completedArea == null}">
                            0
                        </c:if>
                        <c:if test="${agro_operation.completedArea != null}">
                            ${agro_operation.completedArea}
                        </c:if>
                    </td>
                    <td class="table-td start-cell">
                        <c:if test="${agro_operation.actualStartDatetime == null}">
                            -
                        </c:if>
                        <c:if test="${agro_operation.actualStartDatetime != null}">
                            ${agro_operation.actualStartDatetime}
                        </c:if>
                    </td>
                    <td class="table-td end-cell">
                        <c:if test="${agro_operation.completedDatetime == null}">
                            -
                        </c:if>
                        <c:if test="${agro_operation.completedDatetime != null}">
                            ${agro_operation.completedDatetime}
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>