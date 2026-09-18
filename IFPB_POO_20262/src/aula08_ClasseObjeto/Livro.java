package aula08_ClasseObjeto;

public class Livro {
	
	//atributos ou características
	String titulo;
	String autor;
	boolean sumario;
	int volume;
	int paginas;
	String genero;
	
	//Construtor
	public Livro(String novoTitulo, String novoAutor, boolean novoSumario,
		 int novoVolume, int novaPagina, String novoGenero) {
		this.titulo = novoTitulo;
		this.autor = novoAutor;
		this.sumario = novoSumario;
		this.volume = novoVolume;
		this.paginas = novaPagina;
		this.genero = novoGenero;
	}
	
	//ações ou métodos
	public void verInformacoesDoLivro() {
		System.out.print("Título do livro: = "+titulo+"\n");
		System.out.print("Autor = "+autor+"\n");
		if(sumario == true) {
			System.out.print("Sumário = sim\n");
		} else {
			System.out.print("Sumário = não\n");
		}
		System.out.print("Volume = "+volume+"\n");
		System.out.print("Quantidade de páginas"+paginas+"\n");
		System.out.print("Gênero: = "+genero+"\n\n");
	}

}
