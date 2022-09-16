package application;

import java.util.Scanner;

/*
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
 * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
 */

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você quer digitar? ");
		int n = sc.nextInt();
		
		Integer[] num = new Integer[n];		
		
		// a cada repetição, inserir o valor <valores> no vetor <num>
		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextInt();			
		}

		// Mostrar os número negativos
		System.out.println("Números negativos: ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0){
				System.out.println(num[i]);
			}
		}
		
		sc.close();

	}

}
