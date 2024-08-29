package POO.heranca.CARRO;

public class Civic extends Carro{
	
	public Civic(String cor, String ano, int velocidadeMaxima){		
		super(cor, ano, velocidadeMaxima);//Herdou os atibutos do construtor carro
		setDelta(10);
	}
	public int acelerar() {
		
		if(velocidadeAtual + getDelta() < VELOCIDADE_MAXIMA) {
			velocidadeAtual += getDelta();
			return velocidadeAtual;
		} else {
		return VELOCIDADE_MAXIMA;
		}
	}
	
	public int frear() {
		
		if(velocidadeAtual > 0) {
			velocidadeAtual -= 5;
			return velocidadeAtual;
		}else {
			
			return 0;
		}
	}
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		if(velocidadeAtual > 0) {
//			velocidadeAtual -= 5;
//			return velocidadeAtual;
//			
//		}else {
//			
//			return 0;
//		}
//	}
}
