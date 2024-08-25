package POO.heranca;

public class Jogador {
	
	public int vida = 100;
	public int x;
	public int y;
	 

	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean atacar(Jogador oponente){
		
		int deltaX = Math.abs(x - oponente.x); //Valor absouluto não interessando se é positivo ou negativo
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
		} else {
			return false;
		}
		
		return true;
		
	}
	
	public boolean andar (direcao Direcao) {
		
		switch(Direcao) {
		case NORTE:
			y++;
			break;
		case LESTE:
			x++;
			break;
		case OESTE:
			x--;
			break;
		case SUL:
			y--;
			break;
		}
		
		return true;
	}
	
}
