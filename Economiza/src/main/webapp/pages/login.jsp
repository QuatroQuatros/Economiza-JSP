<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>Entrar</title>
    <link rel="stylesheet" href="../css/style.css"/>
    <link rel="stylesheet" href="../css/forms.css"/>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Anek+Tamil:wght@100;200;300;400&family=Lato:wght@400;700&family=Poppins:wght@100;200;300;400;500;600&family=Roboto:wght@100;300&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
    
    <div class="container d-flex justify-content-center align-items-center">
        <div class="container-fluid container-form">
            <h1 class="titulo">Ol� novamente!</h1>
            <p class="sub-titulo">Por favor, insira seus dados:</p>
            <form method="POST" action="login">
                <div class=" form-group mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" name="email" id="email" placeholder="exemplo@exemplo.com" required>
                </div>
                
                <div class="form-group">
                    <label for="senha" class="form-label">Senha</label>
                    <input type="password" class="form-control" name="senha" id="senha" placeholder="********" required>
                </div>
                <a href="./forgot-password.jsp" class="forgot-pass">Esqueceu a senha?</a>
                <button class="btn btn-md btn-cadastrar" type="submit">Entrar</button>
            </form>
            <div class="app-login ">
                <p>ou fa�a login com:</p>
                <img src="../img/icons/google.svg" >
            </div>
            <a href="./register.jsp" class="link-register">N�o possui conta? cadastre-se</a>
           
            
        </div>

        <div class="container-fluid container-img">
            <img src ="../img/login.svg">
        </div>
        
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>

</body>
</html>