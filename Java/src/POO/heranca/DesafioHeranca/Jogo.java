package POO.heranca.DesafioHeranca;

import POO.heranca.Heroi;
import POO.heranca.Monstro;

public class Jogo {
	
	//Quando ajustamos os niveis de visibilidade, podemos acessar de outros pacotes os atributos
	//presentes em outros pacotes, como é o caso dos Construtores(Heroi e Monstro) e dos métodos.
	
	public static void main(String[] args) {
		Heroi heroi = new Heroi(10, 11);
		heroi.x = 10;
		heroi.y = 10;
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 11;
		
		System.out.println("HP Monstro: "+ monstro.vida);
		System.out.println("HP Heroi: "+ heroi.vida);
		
		heroi.atacar(monstro);
		System.out.println(monstro.vida);
		monstro.atacar(heroi);
		System.out.println(heroi.vida);
		
		
	}
}
