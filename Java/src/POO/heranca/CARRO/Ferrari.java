package POO.heranca.CARRO;

public class Ferrari extends Carro implements Esportivo, Luxo{ //implements -> palavra reservada para Interface

	boolean ligarTurbo = false;
	boolean ligarAr = false;
	
	public Ferrari(String cor, String ano, int velocidadeMaxima){
		super(ano, cor, velocidadeMaxima);
		setDelta(15);
	}
	
	public int acelerar() {
		
		if(velocidadeAtual + getDelta() >= VELOCIDADE_MAXIMA) {
			return VELOCIDADE_MAXIMA;
		}else {
			
			velocidadeAtual += getDelta();
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
	
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = true;
		
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = true;
		
	}
	
	public int getDelta() {
		if(ligarTurbo && ligarAr) {
			return 20;
		} else if(ligarTurbo && !ligarAr) {
			return 40;
		} else if(!ligarTurbo && ligarAr) {
			return 25;
		} else {
			return 30;
		}
	}
}
	
