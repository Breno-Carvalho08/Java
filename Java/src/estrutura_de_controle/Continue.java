package estrutura_de_controle;

public class Continue {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue; //O "continue" aqui está servindo para interrompe a interação e não a repetição do código
			}
			System.out.println(i);
		}
		
	}
}
