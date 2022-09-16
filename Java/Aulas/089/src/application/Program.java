package application;

import java.util.Locale;
import java.util.Scanner;

/*
 * Aula 87 -  Arrays parte 1
 * Exempo para calcular a média aritmetica das alturas
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //Leitura da quantidade de alturas ( int n )
		double[] vect = new double[n]; // Array das alturas
		
		//Leitura das alturas
		for (int i = 0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		
		//Soma dos valores das alturas
		double sum = 0.0;
		for (int i = 0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n; // Calculo da média aritmética
		
		System.out.printf("AVEGARE HEIGHT: %.2f%n", avg);
		
		sc.close();

	}

}
