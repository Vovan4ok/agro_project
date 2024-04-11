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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/field_agro_operation_info.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
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
                            <span class="info-block-small-block-info">${agro_operation.plannedStartDate} -<br>${agro_operation.plannedEndDate}</span>
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
                                ${agro_operation.actualStartDatetime} -<br>${agro_operation.completedDate}
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
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>