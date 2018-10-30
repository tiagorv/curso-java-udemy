package secao_05_aula79;

import java.util.Scanner;

public class Matrizes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][] minhaMatriz = new int[n][m];
		
		for (int i = 0; i < minhaMatriz.length; i++){
			for(int j = 0; j < minhaMatriz[i].length; j++){
				minhaMatriz[i][j] = sc.nextInt();
			}
		}
		
		int valor = sc.nextInt();
		
		for (int i = 0; i < minhaMatriz.length; i++){
			for(int j = 0; j < minhaMatriz[i].length; j++){
				if (minhaMatriz[i][j] == valor){
					System.out.println("Posição["+i+","+j+"]");
					if (i > 0){
						System.out.println("Acima = " + minhaMatriz[i-1][j]);						
					}
					
					if (j > 0){
						System.out.println("Esquerda = " + minhaMatriz[i][j-1]);						
					}
					
					if (i < (minhaMatriz.length - 1)){
						System.out.println("Abaixo = " + minhaMatriz[i+1][j]);						
					}
					
					if (j < (minhaMatriz[i].length - 1)){
						System.out.println("Direita = " + minhaMatriz[i][j+1]);						
					}					
				}
			}
		}		
		
		sc.close();
		
	}

}
