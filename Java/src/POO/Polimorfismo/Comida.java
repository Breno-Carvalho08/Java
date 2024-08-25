package POO.Polimorfismo;

//Super Classe para as comidas
public class Comida {
	private double peso;

	public Comida(double peso) {
		setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
}	
