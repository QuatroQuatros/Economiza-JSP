<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <title>Economiza</title>
    <link rel="stylesheet" href="../css/style.css" />
    <link rel="stylesheet" href="../css/index.css" />
    <link rel="stylesheet" href="../css/home.css" />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Anek+Tamil:wght@100;200;300;400&family=Lato:wght@400;700&family=Poppins:wght@100;200;300;400;500;600&family=Roboto:wght@100;300&display=swap"
      rel="stylesheet"
    />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <header id="home">
      <nav class="navbar navbar-expand-md py-3 menu">
        <div class="container">
          <a class="navbar-brand logo" href="#">Economiza</a>
          <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#menuNavbar"
          >
            <span class="navbar-toggler-icon"></span>
          </button>
          <div
            class="collapse navbar-collapse justify-content-center"
            id="menuNavbar"
            toggle="collapse"
            data-target=".navbar-collapse"
          >
            <div class="navbar-nav ms-auto itens">
              <a class="nav-link active" aria-current="page" href="#home"
                >In�cio</a
              >
              <a class="nav-link" aria-current="page" href="#sobre">Sobre</a>
              <a class="nav-link" aria-current="page" href="#contato"
                >Contatos</a
              >
            </div>
            <div class="navbar-nav">
              <div class="user-profile">
                <div class="user-photo">
                  <a href="./user.html">
                    <img src="../img/user2.jpg" />
                  </a>
                </div>
                <div class="user-info">
                  <h3>Ol�, Guilherme!</h3>
                  <p>Bem vindo</p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </nav>
    </header>

    <div class="main-container">
      <div class="menu-container">
        <ul class="menu-tab">
          <li><a href="#">Resumo</a></li>
          <li><a href="#">Metas</a></li>
          <li><a href="#">Rendas</a></li>
          <li><a href="#">Despesas</a></li>
          <li><a href="#">Investimentos</a></li>
        </ul>
      </div>
      <div class="chart-container">
        <div id="chart_div" style="width: 100%; height: 100%"></div>
      </div>
    </div>

    <!-- <section id="sobre">


    </section> -->

    <footer class="text-center text-white" id="contato">
      <div class="container">
        <section>
          <!-- Linkedin -->
          <a
            class="btn btn-floating m-1"
            href="https://www.linkedin.com/in/guilherme-cesar-c-4ab86a1aa/"
            target="_blank"
            role="button"
            ><img src="../img/icons/linkedin.svg" width="40" height="40"
          /></a>

          <!-- Github -->
          <a
            class="btn btn-floating m-1"
            href="https://github.com/QuatroQuatros"
            target="_blank"
            role="button"
            ><img src="../img/icons/github.svg" width="40" height="40"
          /></a>
        </section>
      </div>
      <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2)">
        � 2022 Copyright: Quatro Quatros
      </div>
    </footer>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
      crossorigin="anonymous"
    ></script>
    <script
      type="text/javascript"
      src="https://www.gstatic.com/charts/loader.js"
    ></script>
    <script type="text/javascript">
      function gerarArray() {
        const meses = [
          "01",
          "02",
          "03",
          "04",
          "05",
          "06",
          "07",
          "08",
          "09",
          "10",
          "11",
          "12",
        ];
        const ano = "23";
        const resultado = [];

        resultado.push(["M�s", "Economia"]);
        for (let i = 0; i < meses.length; i++) {
          const data = `${meses[i]}/${ano}`;
          const valor = Math.floor(Math.random() * 500) - 250; // Gera valores aleat�rios entre -250 e 250
          resultado.push([data, valor]);
        }

        return resultado;
      }

      google.charts.load("current", { packages: ["corechart"] });
      google.charts.setOnLoadCallback(drawChart);

      x = gerarArray();
      console.log(x);
      function drawChart() {
        // Crie um array de dados com os meses e os valores economizados
        var data = google.visualization.arrayToDataTable(
          gerarArray()
          //["M�s", "Economia"]
          //["01/23", 100],
          //["02/23", -50],
          //["03/23", 200],
          //["04/23", -75],
          //["05/23", 300],
          //["06/23", -150],
          //["07/23", 400],
          //["08/23", 200],
        );

        var options = {
          title: "Economia Mensal",
          curveType: "function",
          hAxis: { title: "M�s" },
          vAxis: { title: "Economia" },
          bars: "vertical",
          legend: "none",
          backgroundColor: "transparent",
          titleTextStyle: { color: "#A5A0F5" }, // Defina a cor do t�tulo
          hAxis: {
            textStyle: { color: "#9790f8" },
            titleTextStyle: { color: "#9790f8" },
          },
          vAxis: {
            textStyle: { color: "#9790f8" },
            titleTextStyle: { color: "#9790f8" },
          },
          colors: ["#9790f8"],
        };

        //var chart = new google.visualization.ColumnChart(
        //document.getElementById("chart_div")
        //);

        var chart = new google.visualization.LineChart(
          document.getElementById("chart_div")
        );

        chart.draw(data, options);
      }
    </script>
  </body>
</html>
