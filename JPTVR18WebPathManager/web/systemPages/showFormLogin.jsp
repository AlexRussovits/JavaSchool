<%-- 
    Document   : showFormLogin
    Created on : Sep 15, 2020, 1:21:12 PM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <h1>Введите логин и пароль</h1>
        <form action="login" method="POST">
            Логин: <input type="text" name="login"><br>
            Пароль: <input type="text" name="password"><br>
            <input type="submit" value="Войти">
            <br> Нет логина? <a href="showFormAddUser">Регистрация</a>
        </form>
