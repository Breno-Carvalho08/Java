package Caminhoes;

public class Actros extends Caminhao{

    private final String modelo = "Actros";
    private final double velocidadeMaxima = 220;


	public Actros(String NP, String pontosDeTracao, String release) {
		super(NP, pontosDeTracao, release);

	}

    public String getVelocidadeMaxima(){
        return velocidadeMaxima + " Km/h";
    }


	public String getModelo() {
		return modelo;
	}
}
