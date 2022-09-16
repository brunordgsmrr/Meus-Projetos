package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/**
 * Programa para mostrar preço médio dos produtos, utilizando 
 * Tendo N como quantidade de produtos, e nome e preço com atributos dos produtos
 *
 */
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Quantidade de produtos
		int n = sc.nextInt(); 
		Product[] vect = new Product[n];
		
		// for para adicionar produtos ao vetor 
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		// Soma dos valores utilizando o método getPrice();
		double sum = 0.0;// Quantidade de produtos
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		// Calculo da média
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();

	}

}
