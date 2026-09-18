package aula08_ClasseObjeto_Imovel;

public class Imovel {
	
	//atributos
	int quantidadeQuartos;
	String bairro;
	double valor;
	boolean quintal;
	
	//construtor
	public Imovel(int quartos, String bairro, double valor, boolean quintal) {
		this.quantidadeQuartos = quartos;
		this.bairro = bairro;
		this.valor = valor;
		this.quintal = quintal;
	}
	
	//metodos ou funcoes
	public void setBairro(String novoBairro) {
		this.bairro = novoBairro;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	

}
