import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int n1, n2, soma;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		n2 = sc.nextInt();

		soma = n1 + n2;

		System.out.printf("A soma dos valores %d e %d � %d", n1, n2, soma);

		sc.close();

	}

}
