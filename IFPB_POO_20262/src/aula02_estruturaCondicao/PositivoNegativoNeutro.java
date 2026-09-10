package aula02_estruturaCondicao;

import java.util.Scanner;

public class PositivoNegativoNeutro {
	
	public static void main(String[] args) {
		/* Escreva um programa que o usuário
		 * Digite um número e diga se esse número
		 * é positivo, neutro ou negativo
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double valor = scanner.nextDouble();
		
		if(valor > 0) {
			System.out.println("O valor "+valor+" é positivo");
		} else if(valor < 0) {
				System.out.println("O valor "+valor+" é negativo");
		} else {
			System.out.println("O valor "+valor+" é neutro");
		}
	}

}
