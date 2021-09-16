package exercicioFernando;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/* Calule distância percorrida por um veículo carro:
		 * km inicial
		 * km final
		 * qtade litros abastecidos para percurso
		 * média de consumo?
		 */
		
		// chama Scanner
		Scanner sc = new Scanner(System.in);
		
		// Recebe valor da quilometragem no início do trajeto
		System.out.println("Digite o valor da quilometragem do hodômetro no início do trajeto: ");
		double inicio = sc.nextDouble();
		
		// Recebe valor daquilometragem no final do trajeto
		System.out.println("Digite o valor da quilometragem do hodômetro no final do trajeto: ");
		double fim = sc.nextDouble(); 
		
		// Recebe quantidade de litros abastecidos para o percurso
		System.out.println("Digite a quantidade de litros utilizada para completar o trajeto: ");
		double litrosAbastecidos = sc.nextDouble(); 
		
		// Calculo a média de consumo por quilometragem
		double distancia = fim - inicio;
		double mediaAutonomia = distancia / litrosAbastecidos;
		
		// Exibe valores
		System.out.printf("Neste percurso, você percorreu %.2fkms, a média de consumo de veículo foi de: %.2f kms/l.", distancia, mediaAutonomia);
		
		// fecha Scanner
		sc.close();
	}

}
