/**
 * 
 */
package application;

import java.util.Scanner;

/**
 * @author bruno
 *
 */
public class SistemaAcademico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//id, faltas, p1, p2, aulasPeriodo
		
		System.out.println();
		System.out.println("=============================");
		System.out.println("=========Teste 1=============");
		Aluno aluno1 = new Aluno(1, 90, 2, 4, 100);
		
		System.out.println();
		System.out.println("=============================");
		System.out.println("=========Teste 2=============");
		Aluno aluno2 = new Aluno(1, 90, 5, 6, 100);
		
		System.out.println();
		System.out.println("=============================");
		System.out.println("=========Teste 3=============");
		Aluno aluno3 = new Aluno(1, 90, 5, 6, 100);
		
		System.out.println();
		System.out.println("=============================");
		System.out.println("=========Teste 4=============");
		Aluno aluno4 = new Aluno(1, 90, 8, 9, 100);
		
		System.out.println();
		System.out.println("=============================");
		System.out.println("=========Teste 5=============");
		Aluno aluno5 = new Aluno(1, 50, 10, 10, 100);
				
		sc.close();

	}

}
