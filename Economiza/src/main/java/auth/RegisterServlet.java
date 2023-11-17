package auth;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.jsp.JspApplicationContext;

import org.apache.catalina.core.ApplicationContext;

import DAO.UsuarioDAOImpl;
import Helpers.Helpers;
import Models.Usuario;



/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/pages/register")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
				maxFileSize = 1024 * 1024 * 10,      // 10MB
				maxRequestSize = 1024 * 1024 * 50)   // 50MB


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static UsuarioDAOImpl userDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		userDao = new UsuarioDAOImpl();
		 	  
		 String nome = request.getParameter("nome");
		 String cpf = request.getParameter("cpf");
		 String dt_nascimento = request.getParameter("nascimento");
		 String foto = Helpers.uploadPhoto(request);
		 String email = request.getParameter("email");
		 String senha = request.getParameter("senha");
		 
		 Usuario user = new Usuario(nome, email, senha, dt_nascimento, foto, cpf);
		 if(userDao.inserirUsuario(user)) {
			 response.sendRedirect("./login.jsp");
		 }
		 
		 
		
		
	}
	
	

}
