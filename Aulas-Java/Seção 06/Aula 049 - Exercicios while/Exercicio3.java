import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt(); 
		int alc = 0;
		int gas = 0;
		int die = 0;
		
		while (cod != 4) {
			switch (cod) {
			case 1:
				alc += 1;
				cod = sc.nextInt(); 
				break;
			case 2:
				gas += 1;
				cod = sc.nextInt(); 
				break;
			case 3:
				die += 1;
				cod = sc.nextInt(); 
				break;
			case 4:
				break;
			default:
				System.out.println("C�digo inv�lido");
				cod = sc.nextInt();
				break;
			}
		}
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + die);
		
		/*
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		 */
		sc.close();

	}

}
