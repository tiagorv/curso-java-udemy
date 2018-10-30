package secao_02_aula25;

import java.util.Scanner;

public class MinhaCondicao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();
		
		int maior = n1;
		
		if (n2 > maior){
			maior = n2;
		}
		
		if (n3 > maior){
			maior = n3;
		}
		
		System.out.printf("High : %d", maior);
	}

}
