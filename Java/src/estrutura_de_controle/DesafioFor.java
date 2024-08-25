package estrutura_de_controle;

public class DesafioFor {
	public static void main(String[] args) {
		
		String valor ="#";
		String valorFinal = "#########";
		
		//Laço For sem utilizar números
		for(valor = "#"; valor.length() <= valorFinal.length() ; valor += "#") {
			System.out.println(valor);
		}
		
	}
}
