package Caminhoes;

public class Accelo extends Caminhao{

    private final String modelo = "Accelo";
    private final double velocidadeMaxima = 120;


	public Accelo(String NP, String pontosDeTracao, String release) {
		super(NP, pontosDeTracao, release);

	}

    public String getVelocidadeMaxima(){
        return velocidadeMaxima + " Km/h";
    }

	public String getModelo() {
		return modelo;
	}
}
