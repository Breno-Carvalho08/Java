package EX_estrutura_de_controle;
import java.util.Calendar;

public class AnoBissexto {
	public static void main(String[] args) {
	
		Calendar data = Calendar.getInstance();
		int Ano = data.get(Calendar.YEAR);
		
		if(Ano % 4 == 0) {
			System.out.println("Ano Bissexto");
		} else {
			System.out.println("Ano Normal");
		}
	
	
		
	
		
}
}
