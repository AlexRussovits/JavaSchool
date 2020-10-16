<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form action="updateGame" method="POST">
    <h3 class="w-100 text-center ">Игра: ${game.name}</h3>
    <div class="form-group w-50 mx-auto">
        <label for="name">Название игры</label>
        <input  value="${game.id}" type="hidden" name="idGame">
        <input  value="${game.name}" disabled type="text" class="form-control" id="name" name="name" aria-describedby="nameGame" placeholder="Введите название игры" >
        <small id="nameResource" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
        <label for="url">Разработчик игры</label>
        <input value="${game.devName}" disabled type="text" class="form-control" id="devName" name="devName" aria-describedby="devNameHelp" placeholder="Введите разработчика игры">
        <small id="devNameHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
        <label for="price">Цена</label>
        <input value="${game.price}" disabled type="number" class="form-control" id="price" name="price" aria-describedby="priceHelp" placeholder="Введите цену">
        <small id="emailHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
      <a class="btn btn-primary" href="deleteGame?idGame=${game.id}">Удалить</a>
        <button type="submit" class="btn btn-primary">Изменить</button>
    </div>
</form>
