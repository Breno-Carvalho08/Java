package Caminhoes;

public class Axor extends Caminhao{

    private final String modelo = "Axor";
	private final double velocidadeMaxima = 150;
	
	

	public Axor(String NP, String pontosDeTracao, String release) {
		super(NP, pontosDeTracao, release);

	}

	public String getVelocidadeMaxima(){
        return velocidadeMaxima + " Km/h";
    }


	public String getModelo() {
		return modelo;
	}
}
