import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		
		if (num >= 0 && num <= 25.0) {
			System.out.println("Intervalo (0,25)");
		} 
		else if (num > 25.0 && num <= 50.0) {
			System.out.println("Intervalo (25,50)");
		} 
		else if (num > 50.0 && num <= 75.0) {
			System.out.println("Intervalo (50,75)");
		}
		else if (num > 75.0 && num <= 100.0) {
			System.out.println("Intervalo (75,100)");
		} 
		else {
			System.out.println("Fora de intevalo");
		}
		
		/* CORRE��O
		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		*/
		
		sc.close();

	}

}
