package aula03_Repeticao;

public class RepeticaoFOR {
	
	public static void main(String[] args) {
		//Programa para exibir os números
		//ímpares e pares entre 1 e 100
		int inicio = 1;
		int fim = 100;
		
		int repeticoes = 0;
		for(int i = inicio; i <= fim; i++) {
			if(i % 2 == 0) {
				System.out.println("O número "+i+" é par");
			} else {
				System.out.println("O número "+i+" é ímpar");
			}
			
			repeticoes = repeticoes + 1;
			
		}
		System.out.println("Repeticoes = "+repeticoes);
	}

}
