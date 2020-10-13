<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h3 class="w-100 text-center ">Список игр:</h3>
<div class="form-group w-50 mx-auto">
        <c:forEach var="game" items="${listGames}">
         <p>  
            <div class="form-group row w-100 mx-auto my-0">
                <label for="name" class="col-sm-5 col-form-label">Название игры</label>
                <div class="col-sm-7">
                    <input  value="${game.id}" type="hidden" name="idResource">
                    <input  value="${game.name}" class="form-control-plaintext" readonly="" type="text" id="name" name="name" aria-describedby="nameGame" placeholder="Введите название игры" >
                    <small id="nameGame" class="form-text text-muted"></small>
                </div>    
            </div>
            <div class="form-group row w-100 mx-auto my-0">   
                <label for="devName" class="col-sm-5 col-form-label">Разработчик игры</label>
                <div class="col-sm-7">
                    <input value="${game.devName}" class="form-control-plaintext" readonly="" type="text" id="devName" name="devName" aria-describedby="devNameHelp" 
                           placeholder="Введите разработчика игры">
                    <small id="devNameHelp" class="form-text text-muted"></small>
                </div>
            </div>
            <div class="form-group row w-100 mx-auto my-0">  
                <label for="login" class="col-sm-5 col-form-label">Цена</label>
                <div class="col-sm-7">
                    <input value="${game.price}" class="form-control-plaintext" readonly="" type="number" id="price" name="price" aria-describedby="priceHelp" placeholder="Введите цену">
                    <small id="priceHelp" class="form-text text-muted"></small>
                </div>
            </div>

            <div class="form-group w-100 mx-auto">
                <div class="col-sm-7">
                    <a class="btn btn-primary btn-sm mr-1" href="deleteGame?id=${game.id}">Удалить</a>
                    <a class="btn btn-primary btn-sm" href="showEditGame?idGame=${game.id}">Редактировать</a>
                </div>
            </div>
          </p>
        </c:forEach>
</div>