package secao_03_aula46;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dolar price:");
		double cotacaoDolar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought: ");
		double valorEmDolar = sc.nextDouble();
		
		double valorEmReais = CurrencyConverter.valorEmReais(valorEmDolar, cotacaoDolar);
		
		System.out.printf("Reais: %.2f", valorEmReais);
		sc.close();
	}

}
