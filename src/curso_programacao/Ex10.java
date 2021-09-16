package exercicioFernando;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		/*Receba dois valores e ao final, exibir em ordem diferente.*/
		// Inverter os valores das variaveis e mostrar ap�s inverter.
		
		Scanner sc = new Scanner(System.in);
		
		// Declara vari�veis
		int a, b, aux;
		
		// Receber valor para a
		System.out.println("Digite um valor para a: ");
		a = sc.nextInt();
		// Receber valor para b
		b = sc.nextInt();
		
		// Exibe valores antes da troca
		System.out.printf("[a] = %s\n", a);
		System.out.printf("[b] = %s\n", b);
		
		// Titulo para troca de valores
		System.out.println("====VALOR AP�S TROCA====");
		
		// Faz troca dos valores das vari�veis
		aux = a;
		a = b;
		b = aux;

		// Exibe valores depois da troca
		System.out.printf("[a] = %s\n", a);
		System.out.printf("[b] = %s\n", b);
		
		sc.close();
	}

}
