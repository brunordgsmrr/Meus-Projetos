/**
 * 
 */
package application;

/**
 * @author Bruno Rodrigues (11211501661@alunos.umc.br)
 * @author Bianca Gomes (11211101607@alunos.umc.br)
 *
 */
public class Operadores {

	public float adicao (float v1, float v2) {
		
		return v1+v2;
	}
	
	public float subtracao (float v1, float v2) {
		return v1-v2;
	}
	
	public float multiplicacao (float v1, float v2) {
		return v1*v2;
	}
	
	public float divisao (float v1, float v2) {
		return v1/v2;
	}
	
	public void areaCirculo (float raio) {
		float area = (float) Math.PI * (float) Math.pow(raio, 2);
		System.out.println("A área do círculo é de: " + area);
		System.out.println();
	}
	
	public void areaTrapezio (float baseMaior, float baseMenor, float altura) {
		float area = (baseMaior + baseMenor) * altura / 2;
		System.out.println("A área do trapézio é de: " + area);
		System.out.println();
	}
	
	public String avaliaAluno(float notaFinal, float frequencia) {
		if (notaFinal >= 6.0 && frequencia >= 75) {
			return "Aluno aprovado por nota e frequencia";
		} else if(notaFinal >= 6.0 || frequencia >= 75) {
			return "Aluno vai para conselho, teve aprovação apenas em um requisito";
		} else { return "Aluno reprovado, falhou nos dois requisitos";
		}
	}
	
	public String somaValores(int valor) {
		int soma = 0;
		for (int i = 0; i <= 100; i++) {
			soma += i;
		}
		return "A soma dos valores até " + valor + " é igual a " + soma;
	}
}
