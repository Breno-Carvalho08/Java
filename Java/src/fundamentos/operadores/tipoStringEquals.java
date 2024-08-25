package fundamentos.operadores;
import java.util.*;
public class tipoStringEquals {
	public static void main(String[] args) {
		String s = "Breno";
		
		String Resultado = s.equals("Breno")? "Você é o Breno":"Você não é o Breno";
		System.out.println(Resultado); //Como comparar String
		
		String s2 = "   Breno   ";
		System.out.println(s.equals(s2.trim())); //O comando ".trim()" retira os espaços em branco das String
		
		Scanner in = new Scanner(System.in);
		String s3 = in.next(); //Se colocarmos apenas o ".next()" ele tirará os espaços em branco da string tambem
		
		System.out.println(s.equals(s3)); //true
		
		String s4 = in.nextLine(); 
		System.out.println(s.equals(s4)); //false
		 
		
		//Caso você utilize o ".nextLine()", será necessário usar o ".trim()" para retirar os espaços. 
		
		//O importante é que quando você for comparar Strings, você utiliza o .equals() e não o "=="
		
		in.close();
	}
}
