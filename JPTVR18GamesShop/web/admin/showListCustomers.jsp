<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form action="showGame" method="POST" id="formShowGame">   
    
        <h3 class="w-100 text-center">Список покупателей:</h3>
            <div class="form-group w-50 mx-auto">
              <c:forEach var="entry" items="${usersMap}" varStatus="status">
                    <p>${status.index + 1}. ${entry.key.login} роль: ${entry.value} 
                      <a href="editCustomerRoles?customerId=${entry.key.id}">Редактировать</a>
                    </p>
                </c:forEach>
            </div>

</form>
