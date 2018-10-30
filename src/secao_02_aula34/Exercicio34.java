package secao_02_aula34;

import java.util.Scanner;

public class Exercicio34 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N:");
		int n = sc.nextInt();
		while (n <= 0){
			System.out.printf("N = %d must be positive! Try again:", n);
			n = sc.nextInt();
		}
		
		int higher = Integer.MIN_VALUE;
		for(int i=1; i<=n; i++){
			System.out.printf("Value #%d :", i);
			int value = sc.nextInt();
			if (value > higher){
				higher = value;
			}
		}
		System.out.printf("Higher: %d", higher);
	}
}
