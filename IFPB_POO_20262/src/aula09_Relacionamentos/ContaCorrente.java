package aula09_Relacionamentos;

public class ContaCorrente {
	
	//atributos
	int numeroDaConta;
	int numeroDaAgencia;
	double saldo;
	Pessoa pessoa;
	
	//Construtor
	public ContaCorrente(int numero, int agencia, double saldo, Pessoa p1) {
		this.numeroDaConta = numero;
		this.numeroDaAgencia = agencia;
		this.saldo = saldo;
		this.pessoa = p1;
	}

}
