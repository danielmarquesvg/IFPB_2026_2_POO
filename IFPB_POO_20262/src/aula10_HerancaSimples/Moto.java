package aula10_HerancaSimples;

public class Moto extends Automovel{
	
	//atributos
	int cilidradas;
	
	public Moto(String marca, String modelo, int cilindradas) {
		super(marca, modelo);
		this.cilidradas = cilindradas;
	}

	public int getCilidradas() {
		return cilidradas;
	}

	public void setCilidradas(int cilidradas) {
		this.cilidradas = cilidradas;
	}
	
	

}
