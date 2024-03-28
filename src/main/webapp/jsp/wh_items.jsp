<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список номенклатури</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../styles/wh_items.css">
    <script src="../js/wh_items.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Номенклатура</h1>
        <input type="text" class="main-content-search" placeholder="Пошук номенклатури">
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th name-cell">Назва</th>
                <th class="table-th group-cell">Група</th>
                <th class="table-th unit-cell">Одиниця виміру</th>
                <th class="table-th code-cell">Штрих-код</th>
                <th class="table-th description-cell">Опис</th>
            </tr>
            <c:forEach var="wh_item" items="${wh_items}">
                <tr class="table-row table-td-row">
                    <td class="table-td name-cell">
                        <a href="/wh_items/${wh_item.id}" class="table-link">${wh_item.name}</a>
                    </td>
                    <td class="table-td group-cell">${wh_item.whItemGroup.name}</td>
                    <td class="table-td unit-cell">${wh_item.whItemBaseUnit.humanName}</td>
                    <td class="table-td code-cell">
                        <c:if test="${wh_item.barcode == null}">
                            -
                        </c:if>
                        <c:if test="${wh_item.barcode != null}">
                            ${wh_item.barcode}
                        </c:if>
                    </td>
                    <td class="table-td description-cell">
                        <c:if test="${wh_item.description == null}">
                            -
                        </c:if>
                        <c:if test="${wh_item.description != null}">
                            ${wh_item.description}
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