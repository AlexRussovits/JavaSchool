<%-- 
    Document   : showListResources
    Created on : Sep 17, 2020, 1:53:15 PM
    Author     : pupil
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
       <h1>Список ресурсов</h1>
       <table>
            <c:forEach var="resource" items="${listResources}">
                <tr>
                    <td>
                        <li>Имя: ${resource.name}</li>
                        <li>URL: ${resource.url}</li>
                        <li>Логин: ${resource.login}</li>
                        <li>Пароль: ${resource.password}</li>
                        <li>-----------------------------------</li>
                    </td>
                    <td>
                        <a href="deleteResource?id=${resource.id}">Удалить</a>
                    </td>
                </tr>
            </c:forEach>
       </table>