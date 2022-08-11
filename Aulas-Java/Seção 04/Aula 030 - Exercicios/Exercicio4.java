import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int func, horasTrab;
		double valorHora, salario;
		
		func = sc.nextInt();
		horasTrab = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = horasTrab * valorHora;
		
		System.out.println("Numero do funcion�rio " + func);
		System.out.printf("sal�rio � de R$%.2f", salario);
		sc.close();

	}

}
