import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int quad, cub;
		for(int i = 1; i <= n; i++) {
			quad = (int) Math.pow(i, 2);
			cub = (int) Math.pow(i, 3);
			System.out.printf("%d %d %d %n", i, quad, cub);
		}
		
		sc.close();

	}

}
