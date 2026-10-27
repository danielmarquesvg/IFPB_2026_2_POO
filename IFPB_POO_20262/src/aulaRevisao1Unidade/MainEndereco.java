package aulaRevisao1Unidade;

public class MainEndereco {
	
	public static void main(String[] args) {
		Endereco meuEndereco = new Endereco("Rua do IFPB", 2700, "", "Nordeste", "Guarabira");
		meuEndereco.mostrarEndereco();
		
		//modificando a rua
		meuEndereco.setRua("Estrada para Mamanguape");
		meuEndereco.mostrarEndereco();
	}

}
