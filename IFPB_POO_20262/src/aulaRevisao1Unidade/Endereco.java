package aulaRevisao1Unidade;

public class Endereco {
	
	//atributos
	String rua;
	int numero;
	String letra;
	String bairro;
	String cidade;
	
	//construtor
	public Endereco(String novaRua, int novoNumero, String novaLetra, String novoBairro, String novaCidade) {
		this.rua = novaRua;
		this.numero = novoNumero;
		this.letra = novaLetra;
		this.bairro = novoBairro;
		this.cidade = novaCidade;
	}
	
	public void mostrarEndereco() {
		System.out.println(this.rua+", "+this.numero+", "+this.letra+", "+this.bairro+", "+this.cidade);
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	

}
