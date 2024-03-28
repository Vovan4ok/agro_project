<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список добрива</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../styles/fertilizers.css">
    <script src="../js/fertilizers.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Добрива</h1>
        <input type="text" class="main-content-search" placeholder="Пошук добрива">
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th name-cell">Назва</th>
                <th class="table-th">B</th>
                <th class="table-th">N</th>
                <th class="table-th">S</th>
                <th class="table-th">Ca</th>
                <th class="table-th">Cl</th>
                <th class="table-th">Co</th>
                <th class="table-th">Cu</th>
                <th class="table-th">Fe</th>
                <th class="table-th">Mn</th>
                <th class="table-th">Mo</th>
                <th class="table-th">Ni</th>
                <th class="table-th">Se</th>
                <th class="table-th">Zn</th>
            </tr>
            <c:forEach var="fertilizer_elements_dto" items="${fertilizer_elements_dtos}">
                <tr class="table-row table-td-row">
                    <td class="table-td name-cell">
                        <a href="/fertilizers/${fertilizer_elements_dto.fertilizer.id}" class="table-link">${fertilizer_elements_dto.fertilizer.name}</a>
                    </td>
                    <td class="table-td">${fertilizer_elements_dto.elements.getInt("B")}</td>
                    <td class="table-td">${fertilizer_elements_dto.elements.getInt("N")}</td>
                    <td class="table-td">${fertilizer_elements_dto.elements.getInt("S")}</td>
                    <td class="table-td">${fertilizer_elements_dto.elements.getInt("Ca")}</td>
                    <td class="table-td">${fertilizer_elements_dto.elements.getInt("Cl")}</td>
                    <td class="table-td">${fertilizer_elements_dto.elements.getInt("Co")}</td>
                    <td class="table-td">${fertilizer_elements_dto.elements.getInt("Cu")}</td>
                    <td class="table-td">${fertilizer_elements_dto.elements.getInt("Fe")}</td>
                    <td class="table-td">${fertilizer_elements_dto.elements.getInt("Mn")}</td>
                    <td class="table-td">${fertilizer_elements_dto.elements.getInt("Mo")}</td>
                    <td class="table-td">${fertilizer_elements_dto.elements.getInt("Ni")}</td>
                    <td class="table-td">${fertilizer_elements_dto.elements.getInt("Se")}</td>
                    <td class="table-td">${fertilizer_elements_dto.elements.getInt("Zn")}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>