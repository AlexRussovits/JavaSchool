class ResourceModule {
    createResource() {
        let name = document.getElementById("name").value;
    let url = document.getElementById("url").value;
    let login = document.getElementById("login").value;
    let password = document.getElementById("password").value;
    let data = {
        "name": name,
        "url": url,
        "login": login,
        "password": password
    };
    fetch("createResourceJson", {"method":"POST",
        "headers":{'Content-Type':'application/json;charset=utf-8'},
        "body": JSON.stringify(data)
    }).then(response => {
        if(response.status >= 200 & response.status < 300) {
            return Promise.resolve(response);
        }
    }).then(response => {
        return response.json();
    }).catch((ex) => console.log("Fetch Exception",ex))
    .then(function(response) {
        if(response === null || response === undefined) {
            document.getElementById("info").innerHTML = `Не получены данные`
        }else{
            document.getElementById("info").innerHTML = `Ресурс ` + response.data.name+ ` добавлен`
        }
        });
    }
    addNewResource() {
        if(id === "showFormAddResource") {
            console.log(content);
            content.innerHTML =
            ` 
                <form action="createResource" method="POST">
                    <div class="jumbotron bg-white">
                        <h4 class="w-100 text-center ">Создание нового ресурса</h4>
                            <div class="form-group w-50 mx-auto">
                                <label for="name">Название ресурса</label>
                                <input type="text" class="form-control" id="name" name="name" aria-describedby="nameResource" placeholder="Введите имя ресурса">
                                <small id="nameResource" class="form-text text-muted"></small>
                            </div>
                            <div class="form-group w-50 mx-auto">    
                                <label for="url">URL ресурса</label>
                                <input type="text" class="form-control" id="url" name="url" aria-describedby="urlHelp" placeholder="Введите url ресурса">
                                <small id="urlHelp" class="form-text text-muted"></small>
                            </div>
                            <div class="form-group w-50 mx-auto">    
                                <label for="login">Логин</label>
                                <input type="text" class="form-control" id="login" name="login" aria-describedby="loginHelp" placeholder="Логин">
                                <small id="emailHelp" class="form-text text-muted"></small>
                            </div>
                            <div class="form-group w-50 mx-auto">    
                                <label for="password">Пароль</label>
                                <input type="password" class="form-control" id="password" name="password" aria-describedby="passwordHelp" placeholder="Пароль">
                                <small id="emailHelp" class="form-text text-muted"></small>
                            </div>
                            <div class="form-group w-50 mx-auto text-center">
                                <button type="submit" class="btn btn-primary w-50 mt-4">Записать</button>
                            </div>
                    </div>
                </form>
                `;
        }
    }
}