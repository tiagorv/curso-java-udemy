package secao_03_aula43;

import java.util.Locale;
import java.util.Scanner;

public class CriadorAluno {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.print("Nome do Aluno:");
		aluno.nome = sc.nextLine();
		System.out.print("Nota 1:");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota 2:");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota 3:");
		aluno.nota3 = sc.nextDouble();
		System.out.println("FINAL GRADE: " + String.format("%.2f", aluno.notaFinal()));
		System.out.println(aluno.resultado());
	}

}
