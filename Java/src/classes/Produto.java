package classes;

public class Produto {
	//Essas três variaveis pertencem ao OBJETO Produto
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//CONSTRUTORES
	//Voltando a usar o Construtor Padrão
	
	/*Produto(){
			
	}
	//Definimos de forma explicita o Construtor com um parâmetros
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	//Definindo um Construtor com dois parâmetros
	Produto(String nomeInicial,double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}*/
	
	//Definindo um Construtor com três parâmetros
	Produto(String nomeInicial,double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	
	
	//MÉTODOS
	//Não precisamos colocar parametros, já que os paramentros estão presentes na classe.
	double precoComDesconto() {
		return preco * (1- desconto);
	}
	
	/* 
	 Métodos podem ter o mesmo nome já que o que vai mandar é a sua assinatura 
	(precoComDesconto() != precoComDesconto(double descontoGerente)),
	Os nomes podem ser iguais uma vez que os paramentros sejam diferentes.
	*/
	
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - (desconto + descontoGerente));
	}
}


