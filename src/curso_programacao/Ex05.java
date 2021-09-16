package exercicioFernando;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * Apresente a m�dia de tr�s notas de duas mat�rias, sabendo que: o aluno ter�
		 * 02 semestres e dever� ser apresentado um resumo do primeiro semestre, um
		 * resumo do segundo semestre e a m�dia final.
		 */

		// chama Scanner
		Scanner sc = new Scanner(System.in);

		// Valor para m�dia anual
		double medAnualMat = 0;
		double medAnualPort = 0;
		
		for (int i = 0; i < 2; i++) {
			// Vetores para notas dos semestres
			double notasSemMat[] = new double[3];
			double notasSemPort[] = new double[3];

			// Recebe os 3 valores das provas do semestre da mat�ria A
			for (int j = 0; j < 3; j++) {
				System.out.printf("Digite os valores para a (%s)� prova do %s� semestre de Matem�tica: \n", (j + 1), i+1);
				notasSemMat[j] = sc.nextDouble();
			}

			// Recebe os 3 valores das provas do semestre da mat�ria B
			for (int k = 0; k < 3; k++) {
				System.out.printf("Digite os valores para a %s� prova do %s� semestre de Portugu�s: \n", (k + 1), i+1);
				notasSemPort[k] = sc.nextDouble();
			}

			// Exibe m�dia semestral da mat�ria A
			double soma1 = 0;
			for (int j = 0; j < 3; j++) {
				soma1 += notasSemMat[j];
			}
			double mediaMat1 = soma1 / 3.0;
			System.out.printf("M�dia de Matem�tica no %s� Semestre �: %.1f\n", i+1, mediaMat1);

			// Exibe m�dia semestral da mat�ria B
			double soma2 = 0;
			for (int j = 0; j < 3; j++) {
				soma2 += notasSemPort[j];
			}
			double mediaPot1 = soma2 / 3.0;
			System.out.printf("M�dia de Portug�s no %s� Semestre �: %.1f\n", i+1, mediaPot1);
			
			// Soma os valores de cada semestre para mostrar a m�dia anual depois
			medAnualMat += mediaMat1;
			medAnualPort += mediaPot1;
		}

		// Exibe m�dia Anual
		System.out.println();
		System.out.printf("A m�dia anual de Matem�tica �: %.1f \n", (medAnualMat/2));
		System.out.printf("A m�dia anual de Portug�s �: %.1f \n", (medAnualPort/2));

		// fecha Scanner
		sc.close();
		
	}
}
