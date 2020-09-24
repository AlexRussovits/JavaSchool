<%-- 
    Document   : showFormAddUser
    Created on : Sep 15, 2020, 12:34:53 PM
    Author     : pupil
--%>

        <h1>Добавление пользователя</h1>
        <form action="createUser" method="POST">
            Имя пользователя: <input type="text" name="login"><br>
            Пароль: <input type="text" name="password"><br>
            <input type="submit" value="Создать">
        </form>
