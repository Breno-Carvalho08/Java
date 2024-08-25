package POO.heranca.CARRO;

public class Ferrari extends Carro{

	public Ferrari(String cor, String ano, int velocidadeMaxima){
		super(ano, cor, velocidadeMaxima);
	}
	
	public int acelerar() {
		
		if(velocidadeAtual + delta >= VELOCIDADE_MAXIMA) {
			return VELOCIDADE_MAXIMA;
		}else {
		delta += 20;
		velocidadeAtual = delta;
		return velocidadeAtual;
		}
	}
	
	public int frear() {
		if(velocidadeAtual > 13) {
		velocidadeAtual -= 13;
		return velocidadeAtual;
		} else {
			return 0;
		}
	}
}
