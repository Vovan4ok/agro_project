<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список одиниць вимірювання</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/units.css">
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Одиниці вимірювання</h1>
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th">Назва</th>
                <th class="table-th">Системна назва</th>
                <th class="table-th">Базова одиниця вимірювання</th>
                <th class="table-th">Коефіцієнт до базової одиниці вимірювання</th>
            </tr>
            <c:forEach var="unit" items="${units}">
                <tr class="table-row">
                    <td class="table-td">${unit.humanName}</td>
                    <td class="table-td">
                        <c:if test="${unit.systemName == null}">
                            -
                        </c:if>
                        <c:if test="${unit.systemName != null}">
                            ${unit.systemName}
                        </c:if>
                    </td>
                    <td class="table-td">
                        <c:if test="${unit.baseUnit == null}">
                            -
                        </c:if>
                        <c:if test="${unit.baseUnit != null}">
                            ${unit.baseUnit}
                        </c:if>
                    </td>
                    <td class="table-td">
                        <c:if test="${unit.coefficientToBaseUnit == null}">
                            -
                        </c:if>
                        <c:if test="${unit.coefficientToBaseUnit != null}">
                            ${unit.coefficientToBaseUnit}
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