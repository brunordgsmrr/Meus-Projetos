package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Enter the name of employee, Gross salary and Tax: ");
		employee.name = sc.nextLine();
		employee.grossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}

}