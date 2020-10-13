<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <form action="createGame" method="POST">
      <h3 class="w-100 text-center ">Добавление новой игры!</h3>
    <div class="form-group w-50 mx-auto">    
        <label for="name">Название игры</label>
        <input value="${name}" type="text" class="form-control" id="name" name="name" aria-describedby="nameHelp" placeholder="Название игры">
        <small id="nameHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
        <label for="devName">Разработчик игры</label>
        <input value="${devName}" type="text" class="form-control" id="devName" name="devName" aria-describedby="devNameHelp" placeholder="Разработчик игры">
        <small id="urlHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
        <label for="price">Цена</label>
        <input value="${price}" type="number" class="form-control" id="price" name="price" aria-describedby="priceHelp" placeholder="Цена">
        <small id="emailHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto text-center">
        <button type="submit" class="btn btn-primary w-50 mt-4">Добавить игру</button>
    </div>
    </form>
