import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		/*
		 * String product1 = "Computer"; String product2 = "Office desk";
		 * 
		 * int age = 30; int code = 5290; char gender = 'F';
		 * 
		 * double price1 = 2100.0; double price2 = 650.50; double measure = 53.234567;
		 * 
		 * System.out.println("Products:");
		 * System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		 * System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		 * System.out.println();
		 * System.out.printf("Record: %d years old, code %d and geder: %c%n", age, code,
		 * gender); System.out.println();
		 * System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		 * System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		 * Locale.setDefault(Locale.US); System.out.printf("US decimal point: %.3f%n",
		 * measure);
		 */

		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		int y = 32;
		double x = 10.35784;

		System.out.println(y); // Output: 32
		System.out.println(x); // Output: 10.35784
		System.out.printf("%.2f%n", x); // Output: 10,36
		System.out.printf("%.4f%n", x); // Output: 10,3578
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x); // Output: 10.3578
		System.out.println("RESULTADO = " + x + " METROS"); // Output: RESULTADO = 10.35784 METROS
		System.out.printf("RESULTADO = %.2f metros%n", x); // Output: RESULTADO = 10.36 metros

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // Output: Maria tem 31 anos e ganha R$ 4000.00 reais
	}
}