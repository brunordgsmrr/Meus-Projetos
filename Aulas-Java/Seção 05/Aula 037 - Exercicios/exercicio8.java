import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto;
		
		if (salario >=0 && salario <= 2000.0) {
			System.out.println("Isento");
		}
		else if (salario > 2000.0 && salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
			System.out.printf("R$ %.2f", imposto);
		}
		else if (salario > 3000.0 && salario <= 4500.0) {
			imposto = (salario - 3000) * 0.18 + (1000 * 0.08);
			System.out.printf("R$ %.2f", imposto);
		}
		else if (salario > 4500) {
			imposto = (salario - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08);
			System.out.printf("R$ %.2f", imposto);
		} else {
			System.out.println("Valor inv�lido");
		}
		
		/* CORRE��O
		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		*/
		
		sc.close();

	}

}
