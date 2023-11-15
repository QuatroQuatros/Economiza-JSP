package br.com.quatroquatros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Helpers {

	
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
}
