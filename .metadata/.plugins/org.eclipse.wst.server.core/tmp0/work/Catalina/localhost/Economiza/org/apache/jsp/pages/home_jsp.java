/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-11-12 21:14:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\r\n");
      out.write("    <title>Economiza</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/index.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/home.css\" />\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://fonts.googleapis.com/css2?family=Anek+Tamil:wght@100;200;300;400&family=Lato:wght@400;700&family=Poppins:wght@100;200;300;400;500;600&family=Roboto:wght@100;300&display=swap\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    />\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <header id=\"home\">\r\n");
      out.write("      <nav class=\"navbar navbar-expand-md py-3 menu\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <a class=\"navbar-brand logo\" href=\"#\">Economiza</a>\r\n");
      out.write("          <button\r\n");
      out.write("            class=\"navbar-toggler\"\r\n");
      out.write("            type=\"button\"\r\n");
      out.write("            data-bs-toggle=\"collapse\"\r\n");
      out.write("            data-bs-target=\"#menuNavbar\"\r\n");
      out.write("          >\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"collapse navbar-collapse justify-content-center\"\r\n");
      out.write("            id=\"menuNavbar\"\r\n");
      out.write("            toggle=\"collapse\"\r\n");
      out.write("            data-target=\".navbar-collapse\"\r\n");
      out.write("          >\r\n");
      out.write("            <div class=\"navbar-nav ms-auto itens\">\r\n");
      out.write("              <a class=\"nav-link active\" aria-current=\"page\" href=\"#home\"\r\n");
      out.write("                >Início</a\r\n");
      out.write("              >\r\n");
      out.write("              <a class=\"nav-link\" aria-current=\"page\" href=\"#sobre\">Sobre</a>\r\n");
      out.write("              <a class=\"nav-link\" aria-current=\"page\" href=\"#contato\"\r\n");
      out.write("                >Contatos</a\r\n");
      out.write("              >\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"navbar-nav\">\r\n");
      out.write("              <div class=\"user-profile\">\r\n");
      out.write("                <div class=\"user-photo\">\r\n");
      out.write("                  <a href=\"./user.html\">\r\n");
      out.write("                    <img src=\"../img/user2.jpg\" />\r\n");
      out.write("                  </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"user-info\">\r\n");
      out.write("                  <h3>Olá, Guilherme!</h3>\r\n");
      out.write("                  <p>Bem vindo</p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"main-container\">\r\n");
      out.write("      <div class=\"menu-container\">\r\n");
      out.write("        <ul class=\"menu-tab\">\r\n");
      out.write("          <li><a href=\"#\">Resumo</a></li>\r\n");
      out.write("          <li><a href=\"#\">Metas</a></li>\r\n");
      out.write("          <li><a href=\"#\">Rendas</a></li>\r\n");
      out.write("          <li><a href=\"#\">Despesas</a></li>\r\n");
      out.write("          <li><a href=\"#\">Investimentos</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"chart-container\">\r\n");
      out.write("        <div id=\"chart_div\" style=\"width: 100%; height: 100%\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- <section id=\"sobre\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </section> -->\r\n");
      out.write("\r\n");
      out.write("    <footer class=\"text-center text-white\" id=\"contato\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <section>\r\n");
      out.write("          <!-- Linkedin -->\r\n");
      out.write("          <a\r\n");
      out.write("            class=\"btn btn-floating m-1\"\r\n");
      out.write("            href=\"https://www.linkedin.com/in/guilherme-cesar-c-4ab86a1aa/\"\r\n");
      out.write("            target=\"_blank\"\r\n");
      out.write("            role=\"button\"\r\n");
      out.write("            ><img src=\"../img/icons/linkedin.svg\" width=\"40\" height=\"40\"\r\n");
      out.write("          /></a>\r\n");
      out.write("\r\n");
      out.write("          <!-- Github -->\r\n");
      out.write("          <a\r\n");
      out.write("            class=\"btn btn-floating m-1\"\r\n");
      out.write("            href=\"https://github.com/QuatroQuatros\"\r\n");
      out.write("            target=\"_blank\"\r\n");
      out.write("            role=\"button\"\r\n");
      out.write("            ><img src=\"../img/icons/github.svg\" width=\"40\" height=\"40\"\r\n");
      out.write("          /></a>\r\n");
      out.write("        </section>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2)\">\r\n");
      out.write("        © 2022 Copyright: Quatro Quatros\r\n");
      out.write("      </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("    <script\r\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("      integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("    <script\r\n");
      out.write("      type=\"text/javascript\"\r\n");
      out.write("      src=\"https://www.gstatic.com/charts/loader.js\"\r\n");
      out.write("    ></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      function gerarArray() {\r\n");
      out.write("        const meses = [\r\n");
      out.write("          \"01\",\r\n");
      out.write("          \"02\",\r\n");
      out.write("          \"03\",\r\n");
      out.write("          \"04\",\r\n");
      out.write("          \"05\",\r\n");
      out.write("          \"06\",\r\n");
      out.write("          \"07\",\r\n");
      out.write("          \"08\",\r\n");
      out.write("          \"09\",\r\n");
      out.write("          \"10\",\r\n");
      out.write("          \"11\",\r\n");
      out.write("          \"12\",\r\n");
      out.write("        ];\r\n");
      out.write("        const ano = \"23\";\r\n");
      out.write("        const resultado = [];\r\n");
      out.write("\r\n");
      out.write("        resultado.push([\"Mês\", \"Economia\"]);\r\n");
      out.write("        for (let i = 0; i < meses.length; i++) {\r\n");
      out.write("          const data = `");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${meses[i]}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ano}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`;\r\n");
      out.write("          const valor = Math.floor(Math.random() * 500) - 250; // Gera valores aleatórios entre -250 e 250\r\n");
      out.write("          resultado.push([data, valor]);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        return resultado;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      google.charts.load(\"current\", { packages: [\"corechart\"] });\r\n");
      out.write("      google.charts.setOnLoadCallback(drawChart);\r\n");
      out.write("\r\n");
      out.write("      x = gerarArray();\r\n");
      out.write("      console.log(x);\r\n");
      out.write("      function drawChart() {\r\n");
      out.write("        // Crie um array de dados com os meses e os valores economizados\r\n");
      out.write("        var data = google.visualization.arrayToDataTable(\r\n");
      out.write("          gerarArray()\r\n");
      out.write("          //[\"Mês\", \"Economia\"]\r\n");
      out.write("          //[\"01/23\", 100],\r\n");
      out.write("          //[\"02/23\", -50],\r\n");
      out.write("          //[\"03/23\", 200],\r\n");
      out.write("          //[\"04/23\", -75],\r\n");
      out.write("          //[\"05/23\", 300],\r\n");
      out.write("          //[\"06/23\", -150],\r\n");
      out.write("          //[\"07/23\", 400],\r\n");
      out.write("          //[\"08/23\", 200],\r\n");
      out.write("        );\r\n");
      out.write("\r\n");
      out.write("        var options = {\r\n");
      out.write("          title: \"Economia Mensal\",\r\n");
      out.write("          curveType: \"function\",\r\n");
      out.write("          hAxis: { title: \"Mês\" },\r\n");
      out.write("          vAxis: { title: \"Economia\" },\r\n");
      out.write("          bars: \"vertical\",\r\n");
      out.write("          legend: \"none\",\r\n");
      out.write("          backgroundColor: \"transparent\",\r\n");
      out.write("          titleTextStyle: { color: \"#A5A0F5\" }, // Defina a cor do título\r\n");
      out.write("          hAxis: {\r\n");
      out.write("            textStyle: { color: \"#9790f8\" },\r\n");
      out.write("            titleTextStyle: { color: \"#9790f8\" },\r\n");
      out.write("          },\r\n");
      out.write("          vAxis: {\r\n");
      out.write("            textStyle: { color: \"#9790f8\" },\r\n");
      out.write("            titleTextStyle: { color: \"#9790f8\" },\r\n");
      out.write("          },\r\n");
      out.write("          colors: [\"#9790f8\"],\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        //var chart = new google.visualization.ColumnChart(\r\n");
      out.write("        //document.getElementById(\"chart_div\")\r\n");
      out.write("        //);\r\n");
      out.write("\r\n");
      out.write("        var chart = new google.visualization.LineChart(\r\n");
      out.write("          document.getElementById(\"chart_div\")\r\n");
      out.write("        );\r\n");
      out.write("\r\n");
      out.write("        chart.draw(data, options);\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
