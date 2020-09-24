
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:if test="${loginOn ne null && loginOn eq true}">
    <p>
        <a href="logout">Выйти</a><br>
        <a href="showFormAddResource">Добавить новый ресурс</a><br>
        <a href="showFormAddUser">Добавить нового пользователя</a><br>
        <a href="listResources">Список ресурсов</a><br>
    </p>
</c:if>
    
    <c:if test="${loginOn eq null or loginOn eq false}">
    <p>
        <a href="showFormLogin">Войти в систему</a><br>
    </p>
</c:if>
<p>
    
</p>