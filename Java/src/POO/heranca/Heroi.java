package POO.heranca;

public class Heroi extends Jogador{ //palavra reservada para Herança (extends)
	//Nesse caso qunado herdamos os atibutos e parametros de uma superclasse, não necessariamente precisamos 
	//escrever os códigos já que os parametros e atributos foram herdados. 
	
	//Sempre que a classe pai não tiver o construtor padrão, precisamos chamar explicitamente o construtor
	//na subclasse
	public Heroi(int x, int y){ //Colocando o Construtor como "public" para que ele possa ser acessado de um outro pacote
		super(x, y);
	}
	
	public boolean atacar(Jogador oponente){
		
		int deltaX = Math.abs(x - oponente.x); //Valor absouluto não interessando se é positivo ou negativo
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 20;
		} else {
			return false;
		}
		
		return true;
		
	}
}
