package secao_02_aula16;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class MeuCalendar {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date minhaData = Date.from(Instant.parse("2018-07-29T08:05:33Z"));
		System.out.println("Minha Data : " + sdf.format(minhaData));
		
		Calendar meuCalendario = Calendar.getInstance();
		meuCalendario.setTime(minhaData);
		meuCalendario.add(Calendar.DAY_OF_YEAR, 3);
		
		minhaData = meuCalendario.getTime();
		System.out.println("Minha Data : " + sdf.format(minhaData));		
		
		int minutos = meuCalendario.get(Calendar.MINUTE);
		System.out.println("Minutos: " + minutos);
		int ano = meuCalendario.get(Calendar.YEAR);
		System.out.println("Ano: " + ano);
	}

}
