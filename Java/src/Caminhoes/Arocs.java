package Caminhoes;

public class Arocs extends Caminhao{

    private final String modelo = "Arocs";
    private final double velocidadeMaxima = 200;
	

	public Arocs(String NP, String pontosDeTracao, String release) {
		super(NP, pontosDeTracao, release);

	}

    public String getVelocidadeMaxima(){
        return velocidadeMaxima + " Km/h";
    }


	public String getModelo() {
		return modelo;
	}
}
