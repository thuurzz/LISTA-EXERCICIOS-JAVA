package exercicioFernando;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/* Receba um valor e mostre o valor se o valor for acima de 15.*/

		Scanner sc = new Scanner(System.in);

		// Declara��o de vari�veis
		int num, limite = 15;
		char continua;

		// Executa programa at� usu�rio selecionar N�O[N]
		do {
			// Recebe um n�mero
			System.out.println("Digite um n�mero: ");
			num = sc.nextInt();

			// Mostrar valor se maior que 15.
			if (num > limite) {
				System.out.printf("%s � maior que %s.", num, limite);
			} else {
				System.out.print("N�mero digitado menor que o limite.");
			}

			// Colocar uma op��o pra fazer uma nova leitura
			// depois se a pessoa quiser e ele deve dizer o limite.
			System.out.println("Deseja digitar outro n�mero? SIM[S] N�O[N]");
			continua = sc.next().charAt(0);
			if (continua == 'S') {
				System.out.println("Digite um n�mero para o limite: ");
				limite = sc.nextInt();
			}
		} while (continua != 'N');

		sc.close();
	}

}
