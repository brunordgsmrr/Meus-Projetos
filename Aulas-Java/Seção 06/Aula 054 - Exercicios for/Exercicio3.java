import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double x1, x2, x3;
		
		for(int i = 0 ; i < n; i++) {
			
			x1 = sc.nextDouble();
			x2 = sc.nextDouble();
			x3 = sc.nextDouble();
			
			double media = (x1 * 2.0 + x2 * 3.0 + x3 * 5.0)/10;
			
			System.out.printf("%.1f", media);
		}
		sc.close();

	}

}
