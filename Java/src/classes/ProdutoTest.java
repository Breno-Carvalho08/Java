package classes;

//import Estruturas_de_controle.Break; -> importando arquivos de outros pacotes

public class ProdutoTest {
	public static void main(String[] args) {
		//new -> responsavel por chamar o construtor
		//Classe define o Tipo
		//Produto = Tipo da variável - p1 = nome da variável - new = chamar o construtor - Produto() = Nome do construtor 
		
		//utilizando o Construtor Padrão
		Produto p1 = new Produto("Televisão",5099.99);
		//p1.nome = "Televisão";//Chamando um atributo
		//p1.preco = 5099.99;
		//p1.desconto = 0.2;
		
		//utilizando o Construtor com um parâmetro
		Produto p2 = new Produto("Monitor 32'",309.99);
		//p2.nome = "Monitor 32'";//Chamando um atributo 
		p2.preco = 309.99;
		//p2.desconto = 0.1;
		
		//Utilizando o Construtor com dois parâmetros
		Produto p3 = new Produto("Computador",5000);
		//p3.nome = "Computador";//Chamando um atributo
		//p3.preco = 5000;
		//p3.desconto = 0.05;
		
		//Utilizando o Construtor com três parâmetros
		Produto p4 = new Produto("Caixa de som",450);
		
		double precoFinal1 = p1.precoComDesconto(); //Chamando um método
		double precoFinal2 = p2.precoComDesconto(); 
		double precoFinal3 = p3.precoComDesconto();
		double precoFinal4 = p4.precoComDesconto();
		
		System.out.printf("Preço do Produto 1: R$%.2f",precoFinal1);
		System.out.println();
		System.out.printf("Preço do Produto 2: R$%.2f",precoFinal2);
		System.out.println();
		System.out.printf("Preço do Produto 3: R$%.2f",precoFinal3);
		System.out.println();
		System.out.printf("Preço do Produto 4: R$%.2f",precoFinal4);
		
		//System(classe).out(atributo).println(método) = desmembrando o System.out.println();
	}
}
 