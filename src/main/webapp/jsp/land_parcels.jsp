<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Список земельних ділянок</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../styles/land_parcels.css">
    <script src="../js/land_parcels.js"></script>
</head>
<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="main-content">
        <h1 class="main-content-header">Земельні ділянки</h1>
        <input type="text" class="main-content-search" placeholder="Пошук земельних ділянок">
        <table class="main-table">
            <tr class="table-row">
                <th class="table-th number-cell">#</th>
                <th class="table-th group-cell">Група полів</th>
                <th class="table-th cadastr-cell">Кадастровий номер</th>
                <th class="table-th shape1-cell">Кадастрова площа, га</th>
                <th class="table-th shape2-cell">Розрахункова площа, га</th>
                <th class="table-th country-cell">Країна</th>
            </tr>
            <c:forEach var="land_parcel" items="${land_parcels}">
                <tr class="table-row table-td-row">
                    <td class="table-td number-cell">${land_parcel.id}</td>
                    <td class="table-td group-cell">${land_parcel.fieldGroup.name}</td>
                    <td class="table-td cadastr-cell">
                        <a href="/land_parcels/${land_parcel.id}" class="table-link">${land_parcel.cadastralNumber}</a>
                    </td>
                    <td class="table-td shape1-cell">${land_parcel.cadastralArea}</td>
                    <td class="table-td shape2-cell">${land_parcel.calculatedArea}</td>
                    <td class="table-td country-cell">
                        <c:if test="${land_parcel.countryCode == 'UA'}">
                            Україна
                        </c:if>
                        <c:if test="${land_parcel.countryCode != 'UA'}">
                            -
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