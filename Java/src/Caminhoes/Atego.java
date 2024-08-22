package Caminhoes;

public class Atego extends Caminhao{

    private final String modelo = "Atego";
    private final double velocidadeMaxima = 150;


	public Atego(String NP, String pontosDeTracao, String release) {
	    super(NP, pontosDeTracao, release);
        
	}

    public String getVelocidadeMaxima(){
        return velocidadeMaxima + " Km/h";
    }

	public String getModelo() {
		return modelo;
	}
}
