package exercicioFernando;

import java.util.Scanner;

public class Ex07_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Fa�a um programa que pergunte se o valor das cota��es est� correta, se n�o 		// estiver, substitua e calcule o valores da real para dolar e euro.
		
		// Valores fixos para:
		// Dolar = 5,26
		double cotDolar = 5.26;
		// Euro = 6,20
		double cotEuro = 6.20;
		
		// Mostra a cota��o US
		System.out.printf("O valor da cota��o do dolar �: %s\n", cotDolar);
		// Perguntar se a cota��o est� correta USD
		System.out.println("O valor � o atual?\n"
				+ "Caso sim [DIGITE: -1]\n"
				+ "Caso n�o [DIGITE O VALOR: (ex: 5,50)]");
		double cotDolUser = sc.nextDouble();
		// Se !=, atualiza valor
		if (cotDolUser != -1) {cotDolar = cotDolUser;}
		
		// Mostra a cota��o EUR
		System.out.printf("O valor da cota��o do euro �: %s", cotEuro);
		// Perguntar se a cota��o est� correta EUR
		System.out.println("O valor � o atual?\n"
				+ "Caso sim [DIGITE:-1]\n"
				+ "Caso n�o [DIGITE O VALOR: (ex: 7,50)]");
		double cotEurUser = sc.nextDouble();
		// Se !=, atualiza valor
		if (cotDolUser != -1) {cotDolar = cotEurUser;}
		
		// Solicita valor em reais para convers�o
		System.out.println("Digite o valor em reais para cota��o: (ex: 200,50)");
		double valorEmReais = sc.nextDouble();
		
		// Realiza transfer�ncia para USD
		double realEmDolar = valorEmReais / cotDolar; 
		
		// Realiza transfer�ncia para EUR
		double realEmEuro = valorEmReais / cotEuro; 
		
		// Exibe valores para o usu�rio
		System.out.printf("%.2fBRL em Dolar �: %.2fUSD.\n", valorEmReais, realEmDolar);
		System.out.printf("%.2fBRL em Euro �: %.2fEUR.\n", valorEmReais, realEmEuro);
		
		sc.close();
	}

}
