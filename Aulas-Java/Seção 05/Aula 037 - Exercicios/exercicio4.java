import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i, f, d;
		
		i = sc.nextInt();
		f = sc.nextInt();
		
		if (i >= f) {
			f += 24;
			d = f - i;
		} else {
			d = f - i;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(s)", d);

		/* CORRE��O
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		*/
		
		sc.close();

	}

}
