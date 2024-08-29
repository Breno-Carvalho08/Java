package POO.abstrato;

public abstract class mamifero extends animal{
	
	//Podemos implementar os dois métodos de animal, mas é uma opção
	//Caso ele não seja implementado, apenas passará para a classe filha
	//A classe filha irá herdar tudo da super classe e alguma outra implementação feita em uma outra anterior
	
	//EX -> Animal -> Mamifero -> Cachorro
	/*Cachorro irá herdar os métodos de animal e mamifero
	  se houver alguma implementação neles ou se mameifero
	  apenas herdou as caracteristicas de animal e acrescentou
	  um outro metodo abstrato, cachorro irá herda-lo da mesma
	  forma.*/
	public abstract String mamar();
}
