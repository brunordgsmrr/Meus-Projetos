package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec1 = new Rectangle();

		System.out.println("Enter rectangle width and height: ");
		
		rec1.width = sc.nextDouble();
		rec1.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rec1.Area());
		System.out.printf("PERIMETER = %.2f%n", rec1.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rec1.Diagonal());
		
		sc.close();
	}

}