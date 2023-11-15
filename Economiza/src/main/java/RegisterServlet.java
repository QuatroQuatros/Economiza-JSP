

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
		 
        PrintWriter out = response.getWriter();
        out.println("Upload de arquivos concluído com sucesso! ");

		  
		 String nome = request.getParameter("nome");
		 String cpf = request.getParameter("cpf");
		 String dt_nascimento = request.getParameter("nascimento");
		 String foto = uploadPhoto(request);
		 String email = request.getParameter("email");
		 String senha = request.getParameter("senha");
		 
		 Usuario user = new Usuario(nome, email, senha, dt_nascimento, foto, cpf);
		 if(userDao.inserirUsuario(user)) {
			 response.sendRedirect("./login.jsp");
		 }
		 
		 
		
		
	}
	
	private String uploadPhoto(HttpServletRequest request) throws IOException, ServletException {
		String relativePath = "/uploads";
		String savePath = request.getServletContext().getRealPath(relativePath);
		String filePath = "";
		 
       // Cria o diretório se não existir
       File fileSaveDir = new File(savePath);
       if (!fileSaveDir.exists()) {
           fileSaveDir.mkdir();
       }
      
       // Processa cada parte do pedido (cada arquivo enviado)
       for (Part part : request.getParts()) {
           String fileName = extractFileName(part);
           
           if (fileName != null && !fileName.isEmpty()) {
        	   filePath = savePath + File.separator + fileName;
           	   try {
           		   part.write(filePath);
           	   } catch (IOException e) {
           		   e.printStackTrace();
           	   }
           }
           
       }
       return filePath;
	}
	
	private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }

}
