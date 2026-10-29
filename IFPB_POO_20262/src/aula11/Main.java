package aula11;

public class Main {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João", 5000);
		System.out.print("Nome = "+p1.getNome()+"\n");
		System.out.print("Salario = "+p1.getSalario()+"\n");
		p1.setNome("Biu");
		System.out.print("Nome = "+p1.getNome()+"\n");
		
		System.out.println();
		
		Aluno a1 = new Aluno("Maria", 8000, 12345678);
		System.out.print("Nome = "+a1.getNome()+"\n");
		System.out.print("Salario = "+a1.getSalario()+"\n");
		System.out.print("Matricula = "+a1.getMatricula()+"\n");
	}
	


}
