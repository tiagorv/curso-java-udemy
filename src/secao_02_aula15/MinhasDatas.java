package secao_02_aula15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MinhasDatas {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date data1 = sdf1.parse("12/01/1981 03:22:11");
		Date data2 = new Date();
		
		System.out.println("Data 1 : " + sdf1.format(data1));
		System.out.println("Data 2 : " + sdf1.format(data2));
		
		sdf1.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		System.out.println("Data 1 : " + sdf1.format(data1));
		System.out.println("Data 2 : " + sdf1.format(data2));		
	}

}
