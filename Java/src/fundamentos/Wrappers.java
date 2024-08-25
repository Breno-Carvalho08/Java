package fundamentos;

public class Wrappers {
	public static void main(String[] args) {

		//Wrappers = versão orientada a objeto dos tipos primitivos
		
		// byte = Tipo Primitivo
		Byte b = 100;

		// short = Tipo Primitivo
		Short s = 1000;

		// Int = Tipo Primitivo
		Integer i = 10000; // Integer = classe
		// -----------------------------------
		// Convertendo String em número Interio
		// Integer.parseInt(entrada.next());

		// long = Tipo Primitivo
		Long l = 100000L; // Long = classe
		
		
		//boolean = Tipo Primitivo
		Boolean bo = Boolean.parseBoolean("true"); //Boolean = classe
		
		//char = Tipo Primitivo
		Character c = '#'; //Character apenas com aspas simples, aparentemente aspas duplas da erro
		Character r = 'a'; //Character = classe
		
		//float = Tipo Primitivo
		Float f = 123.104F;
		System.out.println(f);
		System.out.println(b);
		System.out.println(s);
		
		System.out.print(c);
		System.out.println(r);
		System.out.println(l);
		System.out.println(i);
		System.out.println(bo);
	}
}
