package POO.heranca.CARRO;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	public String cor;
	public String ano;

	//Criando um construtor
	Carro(String cor, String ano, int velocidadeMaxima){
		this.cor = cor;
		this.ano = ano;
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	public int velocidadeAtual = 0;
	int delta;
	
	public int acelerar() {
		
		if(velocidadeAtual + delta <= VELOCIDADE_MAXIMA) {
			delta += 5;
			return velocidadeAtual;
		}else {
			return VELOCIDADE_MAXIMA;
		}
	}
	
	public int frear() {
		
		if(velocidadeAtual <= 0) {
			return velocidadeAtual = 0;
		}else {
			velocidadeAtual -= 5;
			return velocidadeAtual;
		}
	}
}
