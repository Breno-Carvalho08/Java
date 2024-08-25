package POO.Polimorfismo;

public class Pessoa {
		
	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	public void comer(Comida comida) {
		peso += comida.getPeso();
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso >= 20) {
			this.peso = peso;
		}
	}

}
