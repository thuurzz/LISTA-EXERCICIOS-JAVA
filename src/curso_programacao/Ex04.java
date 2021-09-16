package exercicioFernando;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * Calcule a comiss�o de vendas ao final de um per�odo, considerando que: a
		 * comiss�o fixa � de 15%, voc� precisa receber o sal�rio fixo, o valor de
		 * venda. Apresentar o salario fixo, o total de vendas, o valor total de
		 * comiss�o e o sal�rio final.
		 */

		// chama Scanner
		Scanner sc = new Scanner(System.in);

		// Define porcentagem fixa de comiss�o
		double comissaoFixa = (double) 15 / 100;

		// Receber valor do sal�rio fixo
		System.out.println("Digite o valor do sal�rio fixo: (ex: 1000,00): ");
		double salFixo = sc.nextDouble();

		// Receber valor total das vendas
		System.out.println("Digite o valor do total de vendas do per�odo: (ex: 5000,00): ");
		double valorVendido = sc.nextDouble();

		// Calcula valor da comiss�o
		double comissao = valorVendido * comissaoFixa;

		// Sal�rio fixo
		System.out.printf("O valor do sal�rio fixo �: %.2fR$\n", salFixo);
		// Total de vendas
		System.out.printf("O valor do total de vendas no per�odo �: %.2fR$\n", valorVendido);
		// Valor total de comiss�o
		System.out.printf("O valor do total da comiss�o no per�odo �: %.2fR$\n", comissao);
		// Sal�rio final
		System.out.printf("O valor do total da comiss�o no per�odo �: %.2f R$\n", (comissao + salFixo));

		// fecha Scanner
		sc.close();
	}
}
