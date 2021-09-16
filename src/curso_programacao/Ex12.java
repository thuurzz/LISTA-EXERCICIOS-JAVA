package exercicioFernando;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 * Receba o pre�o de custo de um produto e mostre o valor de venda, se a
		 * quantidade maior de 0. Se a quantidade acima de 50 desconto de 15% Se acima
		 * de 100 desconto de 20%.
		 */

		Scanner sc = new Scanner(System.in);

		// Declara��o das vari�veis
		double valorProduto, valorCarrinho=0;
		double qtdProduto;

		// Receba o pre�o do custo de um produto e mostre o valor de venda.
		System.out.println("Digite o valor do produto: ");
		valorProduto = sc.nextDouble();

		// Recebe quantidade de produtos
		System.out.println("Digite a quantidade produtos: ");
		qtdProduto = sc.nextDouble();

		// Calcula valor do carrinho sem desconto
		valorCarrinho = valorProduto * qtdProduto;

		// Mostre o valor da venda, se maior que 0.
		if (qtdProduto > 0) {
			System.out.printf("Valor total do carrinho de compras: %.2fR$\n", valorCarrinho);
			// Se a quantidade acima de 50, desconto de 15%.
			if (qtdProduto > 50 && qtdProduto <= 100) {
				valorCarrinho -= valorCarrinho * (15.0 / 100.0);
				System.out.printf("Devido quantindade de produtos acima de 50, aplicado desconto de 15%%. Valor para pagamento: %.2fR$.", valorCarrinho);
			}
			// E acima de 100, desconto de 20%.
			else if (qtdProduto > 100) {
				valorCarrinho -= valorCarrinho * (20.0 / 100.0);
				System.out.printf("Devido quantindade de produtos acima de 100, aplicado desconto de 20%%. Valor para pagamento: %.2fR$.", valorCarrinho);
			}

		} else {
			System.out.printf("Seu carrinho de compras est� vazio.");
		}

		sc.close();
	}

}
