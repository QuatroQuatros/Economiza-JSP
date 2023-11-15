

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.UsuarioDAOImpl;
import Helpers.Helpers;
import Models.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/pages/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static UsuarioDAOImpl userDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		Usuario user = userDao.Login(email, senha);
		System.out.println(user);
		System.out.println(user.getNome());
		if(user != null && Helpers.checkHash(senha, user.getSenha())) {
			HttpSession session = request.getSession();
//			session.setAttribute("user", user);
			session.setAttribute("name", user.getNome());
				
		    String caminhoAbsoluto = user.getFoto();   	    
		    File arquivoOrigem = new File(caminhoAbsoluto);
		    String urlCompleta = request.getContextPath() + "/uploads/" + arquivoOrigem.getName();

		    
			session.setAttribute("foto", urlCompleta );
			
			response.sendRedirect("./user.jsp");
		}else {
			response.sendRedirect("error.jsp");
		}
		
		
		
	}

}
