package aula11;

public class Aluno extends Pessoa{
	
	int matricula;
	
	public Aluno(String novoNome, double novoSalario, int novaMatricula) {
		super(novoNome, novoSalario);
		this.matricula = novaMatricula;
	}
	
	public int getMatricula(){
		return this.matricula;
	}
	
	public void setMatricula(int novaMatricula) {
		this.matricula = novaMatricula;
	}

}
