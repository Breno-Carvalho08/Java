package fundamentos;

//Espaços para os Import's
import java.util.Date;


//Quando formos trabalhar com alguma aplicação devemos nos atentar aos imports feitos para que ela funcione corretamente
public class Import {
	public static void main(String[] args) {
		
		//o import java.lang é o mais básico que o java possui e já vem por padrão
		// java.lang.String a = "Breno"; --> Forma completa de criar uma váriavel String
		
		Date d = new Date(); //Mostra a data atual
		System.out.println(d);
	}
}
