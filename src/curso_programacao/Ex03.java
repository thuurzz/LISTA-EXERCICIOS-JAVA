package exercicioFernando;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/* Calule dist�ncia percorrida por um ve�culo carro:
		 * km inicial
		 * km final
		 * qtade litros abastecidos para percurso
		 * m�dia de consumo?
		 */
		
		// chama Scanner
		Scanner sc = new Scanner(System.in);
		
		// Recebe valor da quilometragem no in�cio do trajeto
		System.out.println("Digite o valor da quilometragem do hod�metro no in�cio do trajeto: ");
		double inicio = sc.nextDouble();
		
		// Recebe valor daquilometragem no final do trajeto
		System.out.println("Digite o valor da quilometragem do hod�metro no final do trajeto: ");
		double fim = sc.nextDouble(); 
		
		// Recebe quantidade de litros abastecidos para o percurso
		System.out.println("Digite a quantidade de litros utilizada para completar o trajeto: ");
		double litrosAbastecidos = sc.nextDouble(); 
		
		// Calculo a m�dia de consumo por quilometragem
		double distancia = fim - inicio;
		double mediaAutonomia = distancia / litrosAbastecidos;
		
		// Exibe valores
		System.out.printf("Neste percurso, voc� percorreu %.2fkms, a m�dia de consumo de ve�culo foi de: %.2f kms/l.", distancia, mediaAutonomia);
		
		// fecha Scanner
		sc.close();
	}

}
