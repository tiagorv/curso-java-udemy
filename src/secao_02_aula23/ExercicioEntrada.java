package secao_02_aula23;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEntrada {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String nome = sc.nextLine();
		System.out.println("How many bedrooms are there in your house: ");
		int quartos = sc.nextInt();
		System.out.println("Enter Product Price: ");
		double preco = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		String ultimoNome = sc.next();
		int idade = sc.nextInt();
		double altura = sc.nextDouble();
		
		System.out.println("Name: " + nome);
		System.out.println("BedRooms: " + quartos);		
		System.out.println("Price: " + preco);
		System.out.println("Last Name: " + ultimoNome);
		System.out.println("Age: " + idade);
		System.out.println("Height: " + altura);		
		
		sc.close();
	}

}
