package secao_08_aula100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as informações do cliente:");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("E-mail: ");
		String email = sc.next();
		System.out.println("Data de Nascimento (DD/MM/YYYY): ");
		Date dataNiver = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataNiver);
		System.out.println(cliente);
		
		sc.close();
	}
}
