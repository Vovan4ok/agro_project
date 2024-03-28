<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список витратних матеріалів</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../styles/spare_parts.css">
    <script src="../js/spare_parts.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Витратні матеріали</h1>
        <input type="text" class="main-content-search" placeholder="Пошук">
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th">Назва</th>
                <th class="table-th">Виробник</th>
                <th class="table-th">Артикул</th>
                <th class="table-th">В архіві</th>
            </tr>
            <c:forEach var="spare_part" items="${spare_parts}">
                <tr class="table-row table-td-row">
                    <td class="table-td">${spare_part.name}</td>
                    <td class="table-td">${spare_part.sparePartManufacturer.name}</td>
                    <td class="table-td">${spare_part.partNumber}</td>
                    <td class="table-td">
                        <c:if test="${spare_part.archived == true}">
                            Так
                        </c:if>
                        <c:if test="${spare_part.archived == false}">
                            Ні
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