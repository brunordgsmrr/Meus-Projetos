import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("SAO MULTIPLOS");
		} else {System.out.println("NAO SAO MULTIPLOS");}

		sc.close();

	}

}
