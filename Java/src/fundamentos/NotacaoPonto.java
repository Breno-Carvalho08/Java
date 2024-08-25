package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		double a = 2.3;
	
		String s = "Olá Mundo, X";
		s = s.toUpperCase(); //Deixa o texto em letras maiúsculas.
		s = s.replace("X", "Senhora"); //Troca um elemento pelo outro, nesse caso o "X" por "Senhora".
		s = s.concat("!!!!!"); //Concatena (acrescenta) 
		
		System.out.println(s);
		
		String x = "Bom dia X"
				.replace("X", "Breno")
				.toUpperCase()
				.concat("!");
		// para não deixar tudo na mesma linha, podemos colocar o comando na linha de baixo deixando o código mais fácil de ser lido
		System.out.println(x);
		
		//Tipos Primitivos não tem o operador "."
		
		int b = 3;//Única coisa que um tipo primitivo armazena é o valor
		//a. --> não irá aparecer nada para essa variavel
		
		System.out.println(a + b);
		
	}
}
