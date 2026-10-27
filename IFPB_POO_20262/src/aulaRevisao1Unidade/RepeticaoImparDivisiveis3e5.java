package aulaRevisao1Unidade;

public class RepeticaoImparDivisiveis3e5 {
	
	public static void main(String[] args) {
		for(int i = 1; i <= 101; i = i + 2) {
			if(i % 3 == 0 || i % 5 == 0) {
				System.out.print("*, ");
			} else {
				System.out.print(i+", ");
			}
		}
	}

}
