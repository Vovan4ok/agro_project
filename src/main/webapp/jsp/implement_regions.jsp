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
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap"
          rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/implement_regions.css">
</head>

<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${implement.name}</h1>
        <span class="field-group">${implement.manufacturer} ${implement.model}</span>
    </div>
    <div class="main-content">
        <ul class="field-menu">
            <li class="field-menu-item">
                <a href="/implements/${implement.id}" class="field-menu-link">Інформація про обладнання</a>
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
                <a href="/implements/${implement.id}/regions" class="field-menu-link" style="font-weight: bold;">Регіон</a>
            </li>
        </ul>
        <div class="content-info">
            <h1 class="content-header">Регіони</h1>
            <table class="main-table">
                <tr class="table-row">
                    <th class="table-th region-cell">Регіон</th>
                    <th class="table-th start-cell">Початок знаходження у регіоні</th>
                    <th class="table-th end-cell">Кінець знаходження у регіоні</th>
                </tr>
                <c:forEach var="region_item" items="${region_items}">
                    <tr class="table-row">
                        <td class="table-td region-cell">${region_item.machineRegion.name}</td>
                        <td class="table-td start-cell">${region_item.dateStart}</td>
                        <td class="table-td end-cell">
                            <c:if test="${region_item.noDateEnd == true}">
                                -
                            </c:if>
                            <c:if test="${region_item.noDateEnd == false}">
                                ${region_item.dateEnd}
                            </c:if>
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