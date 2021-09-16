package exercicioFernando;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		/*
		 * Receba o valor de um produto e apresente o valor, de acordo com a quantidade
		 * de prestações escolhidas, considerando que acima de 05 prestações sofrerá o
		 * acréscimo de 1% ao mês.
		 */

		Scanner sc = new Scanner(System.in);

		// Recebe o valor do produto
		System.out.println("Digite o valor do produto: (ex:499,00)");
		double valorProduto = sc.nextDouble();

		// Apresenta valor do produto
		System.out.printf("Este valor de produto: %.2fR$ pode ser parcelado de 1x à 24x.\n", valorProduto);

		// Recebe quantidade de parcelas
		System.out.println("Em quantas parcelas deseja realizar o pagamento?");
		System.out.println("Acima de 5 parcelas, será acrescido 1% de juros ao mês no valor total da compra.");
		double qtdParcelas = sc.nextInt();

		// Calcula juros antes de divdir em parcelas
		double valorSomarJuros = 0;
		if (qtdParcelas > 5) {
			valorSomarJuros = (qtdParcelas / 100.0) * valorProduto;
			valorProduto += valorSomarJuros;
		}

		// Calcula valor das parcelas usando o valor do produto e qtdade de parcelas
		double valorParcelas = (valorProduto / qtdParcelas);

		// Apresente valor das parcelas, pela quantidade de parcelas
		System.out.printf(
				"O valor de produto: %.2fR$ parcelado em %sx, será acrescido no valor de %.2fR$ e o valor das parcelas será de %.2fR$.",
				valorProduto, qtdParcelas, valorSomarJuros, valorParcelas);

		sc.close();

	}

}
