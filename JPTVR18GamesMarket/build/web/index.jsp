  <%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:if test="${loginOn == null || loginOn == false}">
    <div class="jumbotron bg-white">
        <h3 class="w-100 text-center ">Добро пожаловать в наш магазин игр!</h3>
    </div>
</c:if>
<c:if test="${loginOn != null && loginOn == true}">
    <div class="jumbotron bg-white text-center">
        <h4 class="w-100 text-center ">Добро пожаловать, ${customer.login}, в наш магазин игр!</h4>
        <p class="lead">Вы можете использовать наш магазин для своих нужд</p>
        <p class="lead">Наслаждайтесь :)</p>      
    </div>
</c:if>    