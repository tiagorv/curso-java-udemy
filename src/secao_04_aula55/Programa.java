package secao_04_aula55;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		String numero = sc.nextLine();
		System.out.println("Enter account holder: ");
		String donoConta = sc.nextLine();
		System.out.println("Enter initial deposite value: ");		
		char depositoInicial = sc.next().charAt(0);
		double valorDeposito = 0;
		sc.nextLine();
		if (depositoInicial == 'y'){
			System.out.println("Enter account initial: ");
			valorDeposito = sc.nextDouble();
		}
		
		Conta novaConta = new Conta(numero, donoConta, valorDeposito);
		
		System.out.println("Account data: ");
		System.out.println(novaConta);
		
		System.out.println("Enter a deposite value: ");
		valorDeposito = sc.nextDouble();
		novaConta.deposito(valorDeposito);
		System.out.println("Update account data: ");
		System.out.println(novaConta);
		
		System.out.println("Enter a withdraw value: ");
		double valorSaque = sc.nextDouble();
		novaConta.saque(valorSaque);
		System.out.println("Update account data: ");
		System.out.println(novaConta);		
		
		
		sc.close();
	}

}
