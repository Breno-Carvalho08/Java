package Caminhoes;

public class Caminhao {
    private final String modelo = "Generico";
	private String NP;
	private String pontosDeTracao;
	private String release; //Adicionado -> Escalabilidade
    private String velocidadeMaxima;
    private double velocidadeInicial;
   

	public Caminhao(String NP, String pontosDeTracao, String release) {
		this.NP = NP;
		this.pontosDeTracao = pontosDeTracao;
		this.release = release;
	}

    //Getters and Setters
	public String getModelo() {
		return modelo;
	}

	public String getNP() {
		return NP;
	}

	public void setNP(String NP) {
		this.NP = NP;
	}

	public String getPontosDeTracao() {
		return pontosDeTracao;
	}

	public String getRelease() {
		return release;
	}

    public String getVelocidadeMaxima(){
       return velocidadeMaxima + "Km/h";
    }

    //Metodos
	public String Especificacoes(){
		return "Modelo: " + getModelo() + "\nNP: " + getNP() + "\nPontos de tracao: " + getPontosDeTracao() + "\nRelease: " + getRelease();
	}
}
