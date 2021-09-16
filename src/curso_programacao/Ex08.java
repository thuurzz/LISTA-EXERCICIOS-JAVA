package exercicioFernando;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/*Receba o valor de um produto e apresente o valor, 
		 * de acordo com a quantidade de prestações escolhidas.*/
		Scanner sc = new Scanner(System.in);
		
		// Recebe o valor do produto
		System.out.println("Digite o valor do produto: (ex:499,00)");
		double valorProduto = sc.nextDouble();
		
		// Apresenta valor do produto
		System.out.printf("Este valor de produto: %.2fR$ pode ser parcelado de 1x à 24x.\n", valorProduto);
		
		// Recebe quantidade de parcelas
		System.out.println("Em quantas parcelas deseja realizar o pagamento?");
		int qtdParcelas = sc.nextInt();
		
		// Calcula valor das parcelas usando o valor do produto e qtdade de parcelas
		double valorParcelas = valorProduto / qtdParcelas;
		
		// Apresente valor das parcelas, pela quantidade de parcelas
		System.out.printf("O valor de produto: %.2fR$ parcelado em %sx, serão %s parcelas de %.2fR$.", 
				valorProduto, qtdParcelas, qtdParcelas, valorParcelas);
		
		sc.close();
	}

}
