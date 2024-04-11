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
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap"
          rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/field_notes.css">
    <script src="${pageContext.request.contextPath}/js/field_notes.js"></script>
</head>

<body class="body">
<jsp:include page="header.jsp"></jsp:include>
<main class="main">
    <div class="field-name-block">
        <h1 class="field-name">${field.name}</h1>
        <span class="field-group">${field.fieldGroup.groupFolder.parent.name}/${field.fieldGroup.groupFolder.name}/${field.fieldGroup.name}</span>
    </div>
    <div class="main-content">
        <ul class="field-menu">
            <li class="field-menu-item">
                <a href="/fields/${field.id}" class="field-menu-link" >Інформація про поле</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/agro_operations" class="field-menu-link">Агрооперації</a>
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
                <a href="/fields/${field.id}/notes" class="field-menu-link" style="font-weight: bold;">Нотатки</a>
            </li>
            <li class="field-menu-item">
                <a href="/fields/${field.id}/alerts" class="field-menu-link">Тривоги</a>
            </li>
        </ul>
        <div class="content-info">
            <h1 class="content-header">Нотатки</h1>
            <input type="text" class="main-content-search" placeholder="Пошук нотаток">
            <c:forEach var="note" items="${notes}">
                <div class="block-info">
                    <h2 class="block-info-header">${note.id}</h2>
                    <div class="blocks">
                        <div class="author-block">
                            <h3 class="info-part-header">Автор</h3>
                            <a href="/users/${note.user.id}" class="username">${note.user.username}</a>
                            <p class="email">${note.user.email}</p>
                            <p class="profession">
                                <c:if test="${note.user.position != null}">
                                    ${note.user.position}
                                </c:if>
                                <c:if test="${note.user.position == null}">
                                    -
                                </c:if>
                            </p>
                        </div>
                        <div class="information-block">
                            <h3 class="info-part-header">Інформація</h3>
                                <div class="information-block-div">
                                    <div class="information-block-part" style="width: 80px;">
                                        <h4 class="information-block-part-header">Заголовок</h4>
                                        <div class="information-block-part-text">
                                            <c:if test="${note.title == null}">
                                                -
                                            </c:if>
                                            <c:if test="${note.title.contains('youtube')}">
                                                <a href="${note.title}" class="username">Посилання</a>
                                            </c:if>
                                            <c:if test="${!note.title.contains('youtube')}">
                                                ${note.title}
                                            </c:if>
                                        </div>
                                    </div>
                                    <div class="information-block-part" style="width: 170px;">
                                        <h4 class="information-block-part-header">Опис</h4>
                                        <div class="information-block-part-text">
                                            <c:if test="${note.description == null}">
                                                -
                                            </c:if>
                                            <c:if test="${note.description.contains('youtube')}">
                                                <a href="${note.description}" class="username">Посилання</a>
                                            </c:if>
                                            <c:if test="${!note.description.contains('youtube')}">
                                                ${note.description}
                                            </c:if>
                                        </div>
                                    </div>
                                </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>