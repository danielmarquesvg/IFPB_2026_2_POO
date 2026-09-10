package aula04_Array;

import java.util.Scanner;

public class CriacaoArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//criando o tamanho do array
		System.out.print("Digite o tamanho do array: ");
		int tamanhoArray = scanner.nextInt();
		
		int [] l1 = {3,5,2,2,5,6,2,45,2,3,4,5,6,1,2,3,4,1,2,3,41,2,3,4,12,2,1,2,12,32,23,23,23,23,2,23,23,23,23,23,12,21,12,12,2112,21,3,23123,132,132,213,132,132,12,132,132,132,132,132,132,132,132,132,132,132,132,132,132,213,132,132,312,312,312,312,312,32,32,32,32,32,32,32,32,32,324,324,324,324,324,32};
		
		//criando o meu array
		double [] listaDeNotas = new double [tamanhoArray];
		
		//percorrendo e adicionando elementos no meu array
		for(int i = 0; i < listaDeNotas.length; i++) {
			System.out.print("listaDeNotas["+i+"] = ");
			listaDeNotas[i] = scanner.nextDouble();
		}
		
		//exibindo os elementos do meu array
		for(int i = 0; i < listaDeNotas.length; i++) {
			System.out.println("listaDeNotas["+i+"] = "+listaDeNotas[i]);
		}
		
	}

}
