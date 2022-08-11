import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, result;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		// a) a area do triangulo ret�ngulo que tem A por base e C por altura. 
		result = (a * c) / 2;
		System.out.printf("Tri�ngulo: %.3f%n", result);
		
		// b) a area do circulo de raio C. (pi = 3.14159) 
		result = Math.PI * Math.pow(c, 2);
		System.out.printf("C�rculo: %.3f%n", result);
		
		// c) a area do trapezio que tem A e B por bases e C por altura.
		result = ((a + b) * c) / 2 ;
		System.out.printf("Trap�zio: %.3f%n", result);
		
		//d) a area do quadrado que tem lado B. 
		result = b * b;
		System.out.printf("Quadrado: %.3f%n", result);
		
		//e) a area do retangulo que tem lados A e B.
		result = a * b;
		System.out.printf("Ret�ngulo: %.3f%n", result);
		
		sc.close();

	}

}
