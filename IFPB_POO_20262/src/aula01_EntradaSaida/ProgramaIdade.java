package aula01_EntradaSaida;

import java.util.Scanner;

public class ProgramaIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Seu nome é: "+nome);
		
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		System.out.println("A sua idade é: "+idade);
		
		System.out.print("Digite sua altura: ");
		double altura = scanner.nextDouble();
		System.out.printf("A sua altura é: %.2f",altura);
		
		System.out.println("\nDigite sua turma: ");
		char turma = 'A';
		System.out.println("Sua turma é: "+turma);
		
		System.out.println("Você gosta do curso?");
		boolean decisao = scanner.nextBoolean();
		System.out.println("Resposta: "+decisao);
		
		double base = 3;
		double expoente = 2;
		double calculo = Math.pow(base, expoente);
		System.out.println("Resultado = "+calculo);
	}
	
}
