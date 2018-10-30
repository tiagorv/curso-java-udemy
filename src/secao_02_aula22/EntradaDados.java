package secao_02_aula22;

import java.util.Scanner;

public class EntradaDados {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palavra1 = sc.nextLine();
		String palavra2, palavra3, palavra4, palavra5, palavra6, palavra7;
		
		palavra2 = sc.next();
		palavra3 = sc.next();
		palavra4 = sc.next();
		palavra5 = sc.next();
		palavra6 = sc.next();
		palavra7 = sc.next();
		
		System.out.println("Palavra 1 - " + palavra1);
		System.out.println("Palavra 2 - " + palavra2);
		System.out.println("Palavra 3 - " + palavra3);
		System.out.println("Palavra 4 - " + palavra4);
		System.out.println("Palavra 5 - " + palavra5);
		System.out.println("Palavra 6 - " + palavra6);
		System.out.println("Palavra 7 - " + palavra7);
		
		sc.close();
	}

}
