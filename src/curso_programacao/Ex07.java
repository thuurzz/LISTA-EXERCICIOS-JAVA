package exercicioFernando;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		// chama Scanner
		Scanner sc = new Scanner(System.in);
		
		// Receber valor Dolar
		System.out.println("Digite a cotação do Dolar hoje: (5,24)");
		double cotDolar = sc.nextDouble();
		
		// Receber valor Euro
		System.out.println("Digite a cotação do Euro hoje: (7,10)");
		double cotEuro = sc.nextDouble();
		
		// Receber valor em reais
		System.out.println("Digite que deseja realizar a transferência:");
		double valorEmReais = sc.nextDouble();

		// Calula valor em Dolares
		double calcDolar = valorEmReais / cotDolar;
		
		// Calula valor em Euros
		double calcEuro = valorEmReais / cotEuro;
		
		// Exibe valor
		System.out.printf("O valor R$ %.2f em dólares é: %.2f US\n", valorEmReais, calcDolar);
		System.out.printf("O valor R$ %.2f em euros é: %.2f EUR\n", valorEmReais, calcEuro);
		
		// fecha Scanner
		sc.close();

	}

}
