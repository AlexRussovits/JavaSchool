<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <h3 class="w-100 text-center">Внесение изменений игры!</h3>
    <form action="updateResource" method="POST">
        <div class="form-group w-50 mx-auto">    
            <label for="name">Название игры</label>
            <input type="hidden" name="idGame" value="${game.id}">
            <input value="${game.name}"  type="text" class="form-control" id="name" name="name" aria-describedby="nameHelp" placeholder="Название игры">
            <small id="nameHelp" class="form-text text-muted"></small>
        </div>
        <div class="form-group w-50 mx-auto">    
            <label for="devName">Разработчик игры</label>
            <input value="${game.devName}"  type="text" class="form-control" id="devName" name="devName" aria-describedby="devNameHelp" placeholder="Разработчик игры">
            <small id="urlHelp" class="form-text text-muted"></small>
        </div>
        <div class="form-group w-50 mx-auto">    
            <label for="price">Цена</label>
            <input value="${game.price}"  type="number" class="form-control" id="price" name="price" aria-describedby="priceHelp" placeholder="Цена">
            <small id="emailHelp" class="form-text text-muted"></small>
        </div>
        <div class="form-group w-50 mx-auto text-center">
            <button type="submit" class="btn btn-primary w-50 mt-4">Изменить</button>
        </div>                  
    </form>