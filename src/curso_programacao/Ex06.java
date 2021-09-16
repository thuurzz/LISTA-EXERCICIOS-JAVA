package exercicioFernando;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*Receba uma temperatura (em grau celsius) e aplique a convers�o em Fahrenheit, 
		 * considerando a f�rmula de convers�o F=(9*C+160) / 5
		 */
		
		// chama Scanner
		Scanner sc = new Scanner(System.in);
		
		// Receber valor em celcius
		System.out.println("Digite a temperatura em graus C�: (ex: 24)");
		double grausC = sc.nextDouble();
		// Tranforma de C� para F�
		double grausF = (9 * grausC + 160) / 5;
		// Exibe valor
		System.out.printf("%s�C em Fahrenheit �: %.1f�F\n", grausC, grausF);
		
		// fecha Scanner
		sc.close();

	}

}
