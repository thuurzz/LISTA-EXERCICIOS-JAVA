package exercicioFernando;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Chama Scanner para receber valores do teclado
		Scanner sc = new Scanner(System.in);
		
		// Declara variaveis e lê valores
		System.out.println("Digite 2 valores e eles serão somados: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// Soma valor das variaveis
		int soma = a + b;
		
		// Exibe valor da soma
		System.out.println("A soma vale: " + soma);
		
		// Fecha Scanner
		sc.close();
	}

}
