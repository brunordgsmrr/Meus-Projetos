import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * Imprimir todos os elementos do vetor
 * Mostrar na tela a soma e a média dos elementos do vetor 
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		// Inserção dos valores no vetor
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		System.out.println();

		// Exibição dos valores
		System.out.print("VALORES = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(" " + vect[i] + " ");
		}
		System.out.println();

		// Exibição da soma
		double soma = 0;
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		System.out.println("SOMA = " + soma);

		// Exibição da média dos valores
		double media = 0;
		for (int i = 0; i < vect.length; i++){
			media = soma/n;
		}
		System.out.println("Média = " + media);
		
		sc.close();

	}

}
