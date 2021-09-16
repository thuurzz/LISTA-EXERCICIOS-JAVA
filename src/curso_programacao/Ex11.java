package exercicioFernando;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/* Receba um valor e mostre o valor se o valor for acima de 15.*/

		Scanner sc = new Scanner(System.in);

		// Declaração de variáveis
		int num, limite = 15;
		char continua;

		// Executa programa até usuário selecionar NÃO[N]
		do {
			// Recebe um número
			System.out.println("Digite um número: ");
			num = sc.nextInt();

			// Mostrar valor se maior que 15.
			if (num > limite) {
				System.out.printf("%s é maior que %s.", num, limite);
			} else {
				System.out.print("Número digitado menor que o limite.");
			}

			// Colocar uma opção pra fazer uma nova leitura
			// depois se a pessoa quiser e ele deve dizer o limite.
			System.out.println("Deseja digitar outro número? SIM[S] NÃO[N]");
			continua = sc.next().charAt(0);
			if (continua == 'S') {
				System.out.println("Digite um número para o limite: ");
				limite = sc.nextInt();
			}
		} while (continua != 'N');

		sc.close();
	}

}
