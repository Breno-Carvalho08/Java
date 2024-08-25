package fundamentos;

public class Inferencia { // Poder criar variáveis utilizando o "var"
	public static void main(String[] args) {

		//Quando atribuimos valores as nossas variáveis elas iram permanecer com esse tipo pelo resto do código
		double a = 4.5;
		System.out.println(a);
		//Não podemos colocar na variável "a" algum valor de texto
		//a = "Texto" 
		
		var b = 4.5; //A declaração da variavel utilizando var deve seguir junto com a sua inicialização
		//var b = 3 --> Declaração + Inicialização
		System.out.println(b);
		//A mesma coisa vale para a variável "b"
		
		String c; //Inicialização
		c = "Breno";//Declaração
		System.out.println(c);
		
		//var d = 12 --> Valor Inteiro
		//d = 12.5 --> Valor com casa Decimal
		//Mudar os valores atribuidos de inteiros para decimais não irá funcionar já que o java na primeira atribuição já assume um tipo primitivo do dado.
		
		
	}
}
