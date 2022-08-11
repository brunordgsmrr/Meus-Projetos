import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area, PI = 3.14159;
		
		raio = sc.nextDouble();
		
		area = PI * Math.pow(raio, 2);
		
		System.out.printf("O valor da �rea � %.4f", area);
		
		sc.close();

	}

}
