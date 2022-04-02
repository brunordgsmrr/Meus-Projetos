package application;

import java.util.Scanner;

public class Aluno {

	private int id;
	private int faltas;
	private double p1, p2;
	private int aulasPeriodo;
	private double freq;
	private double mediaFinal;
	private boolean complementar;
	
	public Aluno(int id, int faltas, double p1, double p2, int aulasPeriodo) {
		this.id = id;
		this.faltas = faltas;
		this.p1 = p1;
		this.p2 = p2;
		this.aulasPeriodo = aulasPeriodo;
		this.mediaFinal = (this.p1 + this.p2)/2; // md = (p1 + p2) / 2
		this.complementar = false;
		this.setFreq();
		this.avaliacaoFaltas();
	}
	
	Scanner sc = new Scanner(System.in);;
	
	public int getId() {
		return id;
	}
	public int getFaltas() {
		return faltas;
	}
	public double getP1() {
		return p1;
	}
	public double getP2() {
		return p2;
	}	
	public double getFreq() {
		return freq;
	}
	public double getMediaFinal() {
		return mediaFinal;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public void setP1(double p1) {
		this.p1 = p1;
	}
	public void setP2(double p2) {
		this.p2 = p2;
	}	
	public void setFreq() { //frequencia = faltas / aulasPeriodo * 100
		this.freq = (double) this.faltas / this.aulasPeriodo * 100;
	}	

	/* Esse método avalia a frequência do aluno, caso seja aprovado
	 * ele invoca o método avaliaNotas()
	*/
	public void avaliacaoFaltas() {
		if (this.getFreq() >= 75) {
			System.out.println("Aluno aprovado no quesito de frequência");
			this.avaliaNotas();
		} else {
			System.out.println("Aluno reprovado, presença menor que 75%");
		}		
	}
	
	/* Esse método avalia a média fianl do aluno, retornando uma mensagem,
	 * caso o aluno tenha tirado uma nota mediana e ainda não tenha passado
	 * pela prova complementar, será invocado os método provaCompl() e depois
	 * invoca ele mesmo, porem dessa vez com ele tendo feito a complementar
	*/
	public void avaliaNotas() {
		if (this.getMediaFinal() <= 5.0) {
			System.out.println("Aluno reprovado, frequência maior que 75%, porem sua média final foi menor que 5.0");
		}
		else if (this.getMediaFinal() > 5.0 && this.getMediaFinal() < 7.0 && !this.complementar){
			System.out.print("Qual a nota da complementar: ");
			double pc = sc.nextDouble();
			provaCompl(pc);
			avaliaNotas();
		}
		else if(this.getMediaFinal() > 5.0 && this.getMediaFinal() < 7.0) {
			System.out.println("Aluno reprovado, frequência maior que 75% e falhou na prova complementar");
		}
		else {
			System.out.println("Aluno aprovado, parábens!");
		}
	}
	
	/*Caso o aluno tenha tirado uma nota media e tenha sido aprovado por 
	*frequência, esse método é invocado e a média final é recalculada, 
	*após isso o método avaliaNotas é re-invocado, passando de 4 
	*possibilidades para 3
	*/
	public void provaCompl(double pC) {
		this.mediaFinal = (this.p1 + this.p2 + pC) / 3;
		this.complementar = true;
	}	
	
}
