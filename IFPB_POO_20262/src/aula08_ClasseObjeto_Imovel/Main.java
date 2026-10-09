package aula08_ClasseObjeto_Imovel;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de quartos: ");
		int quartos = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("Digite o bairro: ");
		String bairro = scanner.nextLine();
		
		System.out.print("Digite o valor do imóvel: ");
		double preco = scanner.nextDouble();
		
		System.out.println("Precisa de quintal?");
		boolean quintal = scanner.nextBoolean();
		
		Imovel meuImovel = new Imovel(quartos, bairro, preco, quintal);
		System.out.println("Bairro: "+meuImovel.getBairro());
		meuImovel.setBairro("Nordeste 2");
		System.out.println("Bairro: "+meuImovel.getBairro());
		
	}

}
