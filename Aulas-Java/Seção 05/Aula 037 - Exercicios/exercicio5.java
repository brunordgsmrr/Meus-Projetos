import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		
		double total;
		if (cod == 1) {
			total = qtd * 4.00;
		} 
		else if (cod == 2) {
			total = qtd * 4.50;
		} 
		else if (cod == 3) {
			total = qtd * 5.00;
		} 
		else if (cod == 4) {
			total = qtd * 2.00;
		} 
		else if (cod == 5) {
			total = qtd * 1.50;
		} 
		else {
			total = 0;
			System.out.println("C�digo inv�lido");
		}
		
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();

	}

}
