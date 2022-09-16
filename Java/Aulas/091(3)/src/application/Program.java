package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

/*
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
 * bem como os nomes dessas pessoas caso houver. 
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de pessoas: ");
		int n = sc.nextInt(); //Quantidade de pessoas
		Pessoa[] pessoa = new Pessoa[n];
		
		// Repetição para leitura os dados
		for(int i = 0; i < pessoa.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("idade: ");
			int idade = sc.nextInt();
			System.out.print("altura: ");
			double altura = sc.nextDouble();
			pessoa[i] = new Pessoa(nome, idade, altura);
		}
		
		System.out.println();
		
		// Exibir Media das alturas
		double somaAltura = 0;
		for (int i = 0; i < pessoa.length; i++) {
			somaAltura += pessoa[i].getAltura();
		}
		System.out.printf("Altura média: %.2f%n", somaAltura/n);
		
		// Exibir porcentagem de menores de 16
		int menores16 = 0;
		for (int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getIdade() < 16) {
				menores16++;
			}
		}
		System.out.printf("Pessoas com menos de 16 anos: %d%%%n", menores16 * 100 / n);
		
		//Exibir menor de 16 anos
		for (int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}
		
		sc.close();
		
		
	}

}
