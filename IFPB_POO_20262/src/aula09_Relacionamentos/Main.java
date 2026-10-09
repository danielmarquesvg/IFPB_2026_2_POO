package aula09_Relacionamentos;

public class Main {
	
	public static void main(String[] args) {
		
		//criando objetos da classe ContaCorrente
		Pessoa pessoa1 = new Pessoa("Zélia", 1234567890 , "(83)98899-7766");
		
		ContaCorrente conta1 = new ContaCorrente(1111, 2222, 1000, pessoa1);
		ContaCorrente conta2 = new ContaCorrente(1234, 5678, 500, pessoa1);
	}

}
