package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Leitura dos n�meros
		System.out.println("Qual o numero de linhas e colunas? ");
		int m = sc.nextInt(); //Linhas
		int n = sc.nextInt(); //Colunas
		
		//Cria��o da matriz
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++) { //for para linhas
			for (int j = 0; j < mat[i].length; j++) { //for para colunas
				mat[i][j] = sc.nextInt();
			}
		}
				
		//Mostrar dados
		int valor = sc.nextInt();
		for(int i = 0; i < mat.length; i++) { //for para linhas
			for (int j = 0; j < mat[i].length; j++) { //for para colunas
				if(mat[i][j] == valor) { //Testa se o valor � igual ao digitado
					System.out.println("Position " + i + "," + j);					
					if(j > 0) { //Testa se posi��o da coluna � maior que zero
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if(j < mat[i].length-1) { //Testa se posi��o da coluna � menor que o total
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if(i > 0) { //Testa se posi��o da linha � maior que zero
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if(i < m) { //Testa se posi��o da linha � menor que o total
						System.out.println("Down: " + mat[i + 1][j]);
					}					
				}
			}
		}			
		sc.close();		
	}
}
