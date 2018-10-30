package secao_03_aula43;

import java.util.Locale;
import java.util.Scanner;

public class CriaFuncionario {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee empregado = new Employee();
		System.out.print("Name:");
		empregado.name = sc.nextLine();
		System.out.print("Cross salary: ");
		empregado.crossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		empregado.tax = sc.nextDouble();
		
		System.out.println("Employee: " + empregado);
		
		System.out.print("Wich percentage to increase salary?");
		double perc = sc.nextDouble();
		empregado.increaseSalary(perc);
		
		System.out.println("Update data: " + empregado);		
		
		sc.close();
	}

}
