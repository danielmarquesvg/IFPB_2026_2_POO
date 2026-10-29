package aula11;

public class Pessoa {
	
	String nome;
	double salario;
	
	public Pessoa(String novoNome, double novoSalario) {
		this.nome = novoNome;
		this.salario = novoSalario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
