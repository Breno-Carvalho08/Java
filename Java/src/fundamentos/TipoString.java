package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Mundo".charAt(5)); // Comando ".charAt" permite ver qual letra está na posição desejada.
		
		String s = "Boa Tarde"; //String é um objeto imutável, ou seja, o valor dela não muda, apenas é substituído.
		s = "Bom dia"; //Valor substituído, mas não mudado
		System.out.println(s);
		System.out.println(s.concat("!!!")); // Concatena a String com o que estiver dentro do valor ".concat()".
		System.out.println(s.startsWith("Bom"));// Se a String começar com a palavra "Bom", retornará um valor Verdadeiro. Caso contrário será um valor falso.
		System.out.println(s
				.toUpperCase() //Aqui colocamos a String s toda em letras maiúsculas, fazendo valor retornar Verdadeiro.
				.startsWith("BOM")); //Inicia com "BOM".
		System.out.println(s.length());
		System.out.println(s
				.toUpperCase()
				.endsWith("DIA")); //"Termina com("DIA")"
		System.out.println(s.equals("Boa Tarde")); // Aqui estamos falando que o s é igual a "Boa Tarde". Caso seja ele retornará um valor Verdadeiro.
		System.out.println(s.equalsIgnoreCase("BOM DIA")); // Aqui já pedimos para ignorar se é maiúscula ou minúscula e analisar apenas o que está escrito.
		
		System.out.printf("%s \n",s ); //Esse comando é para formatação, por isso o "f" no final.
		//o "%s" serve para mostrar o que está armazenado em uma variável String, ou seja, algo com palavras.
		
		//var Idade = 32;
		//var salario = 1000;
		
		//System.out.printf("%d anos ganhando %d reais de salário", Idade,salario); //Já para números inteiros é utilizado o "%d".
		//Temos também o "%.f" que será usado para quando os números tiverem casas decimais, podendo escolher quantas casas decimais será mostrado.
		
		//String frase = String.format("\n %d anos ganhando %d reais de salário", Idade,salario);
		//System.out.println(frase); 
		//O String.format permite que utilizamos os simbolos (%d %.f %s) sem precisar utilizar o "System.out.printf" e ainda armazenar em uma variável String. 
	}
}
