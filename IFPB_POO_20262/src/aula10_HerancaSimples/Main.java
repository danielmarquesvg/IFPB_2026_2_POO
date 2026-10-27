package aula10_HerancaSimples;

public class Main {
	
	public static void main(String[] args) {
		
		Automovel auto1 = new Automovel("Ford", "Ford Focus");
		
		Moto moto1 = new Moto("Honda", "CG-Fan", 160);
		
		System.out.println("Marca da moto: "+moto1.getMarca());
		System.out.println("Modelo da moto: "+moto1.getModelo());
	}

}
