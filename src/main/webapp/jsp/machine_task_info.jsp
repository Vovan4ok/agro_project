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
<jsp:include page="header.jsp"></jsp:include>
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
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>