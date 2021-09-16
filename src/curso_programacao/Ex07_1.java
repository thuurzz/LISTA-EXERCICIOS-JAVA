package exercicioFernando;

import java.util.Scanner;

public class Ex07_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Faça um programa que pergunte se o valor das cotações está correta, se não 		// estiver, substitua e calcule o valores da real para dolar e euro.
		
		// Valores fixos para:
		// Dolar = 5,26
		double cotDolar = 5.26;
		// Euro = 6,20
		double cotEuro = 6.20;
		
		// Mostra a cotação US
		System.out.printf("O valor da cotação do dolar é: %s\n", cotDolar);
		// Perguntar se a cotação está correta USD
		System.out.println("O valor é o atual?\n"
				+ "Caso sim [DIGITE: -1]\n"
				+ "Caso não [DIGITE O VALOR: (ex: 5,50)]");
		double cotDolUser = sc.nextDouble();
		// Se !=, atualiza valor
		if (cotDolUser != -1) {cotDolar = cotDolUser;}
		
		// Mostra a cotação EUR
		System.out.printf("O valor da cotação do euro é: %s", cotEuro);
		// Perguntar se a cotação está correta EUR
		System.out.println("O valor é o atual?\n"
				+ "Caso sim [DIGITE:-1]\n"
				+ "Caso não [DIGITE O VALOR: (ex: 7,50)]");
		double cotEurUser = sc.nextDouble();
		// Se !=, atualiza valor
		if (cotDolUser != -1) {cotDolar = cotEurUser;}
		
		// Solicita valor em reais para conversão
		System.out.println("Digite o valor em reais para cotação: (ex: 200,50)");
		double valorEmReais = sc.nextDouble();
		
		// Realiza transferência para USD
		double realEmDolar = valorEmReais / cotDolar; 
		
		// Realiza transferência para EUR
		double realEmEuro = valorEmReais / cotEuro; 
		
		// Exibe valores para o usuário
		System.out.printf("%.2fBRL em Dolar é: %.2fUSD.\n", valorEmReais, realEmDolar);
		System.out.printf("%.2fBRL em Euro é: %.2fEUR.\n", valorEmReais, realEmEuro);
		
		sc.close();
	}

}
