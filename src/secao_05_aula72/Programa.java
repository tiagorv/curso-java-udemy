package secao_05_aula72;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de Funcionários: ");
		int quantidade = sc.nextInt();
		
		ArrayList<Empregados> minhaLista = new ArrayList<Empregados>();
		
		for(int i=0; i<quantidade; i++){
			System.out.println("Empregado : " + i);
			System.out.print("Código: ");
			int codigo = sc.nextInt();
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			Empregados empregado = new Empregados(codigo, nome, salario);
			minhaLista.add(empregado);
		}
		
		System.out.print("Qual Empregado ganhará aumento: ");
		int codigo = sc.nextInt();
		
		boolean aumentou = false;
		for (Empregados empregados : minhaLista) {
			if (empregados.getCodigo() == codigo){
				System.out.print("Percentual de Aumento: ");
				Double percentual = sc.nextDouble();
				empregados.aumentaSalario(percentual);
				aumentou = true;
			}
		}
		
	    if (aumentou){
	    	for (Empregados empregados : minhaLista) {
				System.out.println(empregados);
			}
	    }else{
	    	System.out.println("Funcionario Inexistente!!!");
	    }
		
		
		
		sc.close();
	}

}
