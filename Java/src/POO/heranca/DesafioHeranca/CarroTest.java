package POO.heranca.DesafioHeranca;

import POO.heranca.CARRO.Carro;
import POO.heranca.CARRO.Civic;
import POO.heranca.CARRO.Ferrari;

public class CarroTest{
	public static void main(String[] args) {
		
		
		Carro Civic = new Civic("Preto", "2017", 200);
		System.out.println("Cor do Carro: " + Civic.cor);
		System.out.println("Ano do Carro: " + Civic.ano);
		System.out.println("Velocidade Atual: " + Civic.velocidadeAtual);
		System.out.println("Acelerou: "+ Civic.acelerar());
		System.out.println("Acelerou: "+ Civic.acelerar());
		System.out.println("Acelerou: "+ Civic.acelerar());
		System.out.println("Freou: " + Civic.frear());
		System.out.println("Freou: " + Civic.frear());
		System.out.println("Freou: " + Civic.frear());
	
	
		
		
		System.out.println();
		 
		Ferrari Ferrari = new Ferrari("Vermelho", "2024",150);
		System.out.println("Cor do Carro: " + Ferrari.cor);
		System.out.println("Ano do Carro: " + Ferrari.ano);
		System.out.println("Velocidade Atual: " + Ferrari.velocidadeAtual);
		Ferrari.ligarTurbo();
		System.out.println("Acelerou: " + Ferrari.acelerar());
		System.out.println("Acelerou: " + Ferrari.acelerar());
		System.out.println("Acelerou: " + Ferrari.acelerar());
		System.out.println("Acelerou: " + Ferrari.acelerar());
		System.out.println("Freou: " + Ferrari.frear());
		
		System.out.println();
		
		
		Ferrari ferrari = new Ferrari("Preto","2025",400);
		System.out.println("Cor do Carro: " + ferrari.cor);
		System.out.println("Ano do Carro: " + ferrari.ano);
		System.out.println("Velocidade Atual: " + ferrari.velocidadeAtual);
		System.out.println("Acelerou: " + ferrari.acelerar());
		ferrari.ligarTurbo();
		System.out.println("Acelerou: " + ferrari.acelerar());
		System.out.println("Acelerou: " + ferrari.acelerar());
		System.out.println("Acelerou: " + ferrari.acelerar());
		System.out.println("Acelerou: " + ferrari.acelerar());
		System.out.println("Acelerou: " + ferrari.acelerar());
		System.out.println("Acelerou: " + ferrari.acelerar());
		System.out.println("Acelerou: " + ferrari.acelerar());
		System.out.println("Acelerou: " + ferrari.acelerar());
		System.out.println("Acelerou: " + ferrari.acelerar());
		System.out.println("Freou: " + ferrari.frear());
		
		
		
		
		
	}
}
