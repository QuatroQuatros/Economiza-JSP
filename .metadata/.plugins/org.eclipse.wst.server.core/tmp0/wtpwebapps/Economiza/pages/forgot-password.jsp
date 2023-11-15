<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>Esqueci a senha</title>
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
            <h1 class="titulo">Esqueceu a senha?</h1>
            <p class="sub-titulo">Sem problemas! insira seu email que enviaremos o link para voc� resetar sua senha.</p>
            <form method="POST" action="">
                <div class=" form-group mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" name="email" id="email" placeholder="exemplo@exemplo.com" required>
                </div>
                <button class="btn btn-md btn-cadastrar" type="submit">Enviar</button>
            </form>
           
            <a href="./login.jsp" class="link-register">Voltar para o Login</a>
           
            
        </div>

        <div class="container-fluid container-img">
            <img src ="../img/forgot.svg">
        </div>
        
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>

</body>
</html>