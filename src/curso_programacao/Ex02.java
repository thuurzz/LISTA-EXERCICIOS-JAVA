package exercicioFernando;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Chama Scanner para receber valores do teclado
		Scanner sc = new Scanner(System.in);
		
		// Declara variaveis e lê valores
		System.out.println("Digite um número inteiro: ");
		int n1 = sc.nextInt();
		System.out.println("Digite outro número inteiro: ");
		int n2 = sc.nextInt();
		
		//soma
		int soma = n1 + n2;
		System.out.println("O valor da soma dos valores é: " + soma);
		
		//subtração
		int subtracao = n1 - n2;
		System.out.println("O valor da subtração do primeiro pelo segundo é: " + subtracao);
		
		//multiplicação
		int multiplicacao = n1 * n2;
		System.out.println("O valor da multiplicação dos valores é: " + multiplicacao);
		
		//divisão dos números
		double divisao = (double) n1 / n2;
		System.out.printf("O valor da divisão do primeiro pelo segundo é: %.2f", divisao);
		
		//fecha o Scanner
		sc.close();

	}

}
