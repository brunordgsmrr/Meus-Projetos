package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	
	public String status() {
		if (finalGrade() < 60) {
			double result = 60 - finalGrade(); 
			return "FAILED" 
					+ "%n" 
					+ "MISSING "
					+ String.format("%.2f", result)
					+ " POINTS";
		} else {
			return "PASS";
		}
	}
}