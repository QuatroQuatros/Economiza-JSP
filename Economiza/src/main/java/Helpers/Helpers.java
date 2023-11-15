package Helpers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

}
