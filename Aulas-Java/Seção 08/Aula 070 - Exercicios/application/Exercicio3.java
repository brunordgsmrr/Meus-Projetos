package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", aluno.finalGrade());
		System.out.printf(aluno.status());
		
		sc.close();
	}

}