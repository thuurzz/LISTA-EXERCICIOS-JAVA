package exercicioFernando;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * Apresente a média de três notas de duas matérias, sabendo que: o aluno terá
		 * 02 semestres e deverá ser apresentado um resumo do primeiro semestre, um
		 * resumo do segundo semestre e a média final.
		 */

		// chama Scanner
		Scanner sc = new Scanner(System.in);

		// Valor para média anual
		double medAnualMat = 0;
		double medAnualPort = 0;
		
		for (int i = 0; i < 2; i++) {
			// Vetores para notas dos semestres
			double notasSemMat[] = new double[3];
			double notasSemPort[] = new double[3];

			// Recebe os 3 valores das provas do semestre da matéria A
			for (int j = 0; j < 3; j++) {
				System.out.printf("Digite os valores para a (%s)º prova do %sº semestre de Matemática: \n", (j + 1), i+1);
				notasSemMat[j] = sc.nextDouble();
			}

			// Recebe os 3 valores das provas do semestre da matéria B
			for (int k = 0; k < 3; k++) {
				System.out.printf("Digite os valores para a %sº prova do %sº semestre de Português: \n", (k + 1), i+1);
				notasSemPort[k] = sc.nextDouble();
			}

			// Exibe média semestral da matéria A
			double soma1 = 0;
			for (int j = 0; j < 3; j++) {
				soma1 += notasSemMat[j];
			}
			double mediaMat1 = soma1 / 3.0;
			System.out.printf("Média de Matemática no %s° Semestre é: %.1f\n", i+1, mediaMat1);

			// Exibe média semestral da matéria B
			double soma2 = 0;
			for (int j = 0; j < 3; j++) {
				soma2 += notasSemPort[j];
			}
			double mediaPot1 = soma2 / 3.0;
			System.out.printf("Média de Portugês no %s° Semestre é: %.1f\n", i+1, mediaPot1);
			
			// Soma os valores de cada semestre para mostrar a média anual depois
			medAnualMat += mediaMat1;
			medAnualPort += mediaPot1;
		}

		// Exibe média Anual
		System.out.println();
		System.out.printf("A média anual de Matemática é: %.1f \n", (medAnualMat/2));
		System.out.printf("A média anual de Portugês é: %.1f \n", (medAnualPort/2));

		// fecha Scanner
		sc.close();
		
	}
}
