package exercicioFernando;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Chama Scanner para receber valores do teclado
		Scanner sc = new Scanner(System.in);
		
		// Declara variaveis e l� valores
		System.out.println("Digite um n�mero inteiro: ");
		int n1 = sc.nextInt();
		System.out.println("Digite outro n�mero inteiro: ");
		int n2 = sc.nextInt();
		
		//soma
		int soma = n1 + n2;
		System.out.println("O valor da soma dos valores �: " + soma);
		
		//subtra��o
		int subtracao = n1 - n2;
		System.out.println("O valor da subtra��o do primeiro pelo segundo �: " + subtracao);
		
		//multiplica��o
		int multiplicacao = n1 * n2;
		System.out.println("O valor da multiplica��o dos valores �: " + multiplicacao);
		
		//divis�o dos n�meros
		double divisao = (double) n1 / n2;
		System.out.printf("O valor da divis�o do primeiro pelo segundo �: %.2f", divisao);
		
		//fecha o Scanner
		sc.close();

	}

}
