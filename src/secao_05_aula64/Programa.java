package secao_05_aula64;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Estudante quartos[] = new Estudante[10];
		
		int qtdAluguel = sc.nextInt();
		sc.nextLine();
		
		for (int i=1; i<=qtdAluguel; i++){
			System.out.println("#Rent " + i);
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			quartos[quarto] = new Estudante(nome, email);
		}
		
		System.out.println("Busy Rooms");
		for (int i=0; i<quartos.length; i++){
			if (quartos[i] != null){
				System.out.println(i + " " + quartos[i]);
			}
		}
	}
}
