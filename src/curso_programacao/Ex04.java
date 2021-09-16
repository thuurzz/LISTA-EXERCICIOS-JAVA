package exercicioFernando;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * Calcule a comissão de vendas ao final de um período, considerando que: a
		 * comissão fixa é de 15%, você precisa receber o salário fixo, o valor de
		 * venda. Apresentar o salario fixo, o total de vendas, o valor total de
		 * comissão e o salário final.
		 */

		// chama Scanner
		Scanner sc = new Scanner(System.in);

		// Define porcentagem fixa de comissão
		double comissaoFixa = (double) 15 / 100;

		// Receber valor do salário fixo
		System.out.println("Digite o valor do salário fixo: (ex: 1000,00): ");
		double salFixo = sc.nextDouble();

		// Receber valor total das vendas
		System.out.println("Digite o valor do total de vendas do período: (ex: 5000,00): ");
		double valorVendido = sc.nextDouble();

		// Calcula valor da comissão
		double comissao = valorVendido * comissaoFixa;

		// Salário fixo
		System.out.printf("O valor do salário fixo é: %.2fR$\n", salFixo);
		// Total de vendas
		System.out.printf("O valor do total de vendas no período é: %.2fR$\n", valorVendido);
		// Valor total de comissão
		System.out.printf("O valor do total da comissão no período é: %.2fR$\n", comissao);
		// Salário final
		System.out.printf("O valor do total da comissão no período é: %.2f R$\n", (comissao + salFixo));

		// fecha Scanner
		sc.close();
	}
}
