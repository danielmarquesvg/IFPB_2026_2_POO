package aula10_HerancaSimples;

public class Automovel {
	
	//atributos
	String marca;
	String modelo;
	
	//Construtor
	public Automovel(String novaMarca, String novoModelo) {
		this.marca = novaMarca;
		this.modelo = novoModelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
