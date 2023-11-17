package Helpers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.mindrot.jbcrypt.BCrypt;

public class Helpers {
    private static final int BCRYPT_ROUNDS = 12;
	
	public Date formatStringToDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimentoDate = null;
		try {
			dataNascimentoDate = dateFormat.parse(date);
		} catch (ParseException e) {
			System.out.println("erro ao formatar data");
			e.printStackTrace();
		}
        return new java.sql.Date(dataNascimentoDate.getTime());
	}
	
	public static Date formatDatabaseDate(String date) {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dataFormatada = null;
		try {
			dataFormatada = formato.parse(date);

		} catch (ParseException e) {
			System.out.println("erro ao formatar data");
			e.printStackTrace();
		}
		return dataFormatada;

	}
	
	public static String dateToString(Date date) {
		String formattedDate = "";
			
		SimpleDateFormat otputFormat = new SimpleDateFormat("yyyy-MM-dd");
		formattedDate = otputFormat.format(date);
				
		return formattedDate;
		
	}
	
	public static BigDecimal ConversaoDoubleParaOracleNumber(double numero) {
		BigDecimal valorBigDecimal = new BigDecimal(numero).setScale(2, RoundingMode.HALF_UP);;
		return valorBigDecimal;
	}
	
	public static String limparCPF(String cpf) {
        if (cpf == null) {
            return null;
        }
        cpf = cpf.replaceAll("[.-]", "");
        return cpf;
    }
	
	public static String hashPassword(String password) {
        String salt = BCrypt.gensalt(BCRYPT_ROUNDS);
        
        String hashedPassword = BCrypt.hashpw(password, salt);
        
        return hashedPassword;
    }
	
    public static boolean checkHash(String senhaInserida, String senhaHash) {
        return BCrypt.checkpw(senhaInserida, senhaHash);
    }
    
    public static String uploadPhoto(HttpServletRequest request) throws IOException, ServletException {
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
       System.out.println(filePath);
       return filePath;
	}
	
	private static String extractFileName(Part part) {
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
