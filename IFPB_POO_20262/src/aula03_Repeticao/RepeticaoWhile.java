package aula03_Repeticao;

import java.util.Scanner;

public class RepeticaoWhile {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double soma = 0;
		System.out.println("Digite um valor: ");
		double numero = scanner.nextDouble();

		
		if(numero == 0) {
			System.out.println("Fim da execução");
			System.out.println("Soma = "+soma);
		} else {
			while(numero != 0) {
				System.out.println("Digite um valor: ");
				numero = scanner.nextDouble();
				soma = soma + numero;
				System.out.println("Soma parcial = "+soma);
			}
		}
		System.out.println("Soma total = "+soma);
	}

}
