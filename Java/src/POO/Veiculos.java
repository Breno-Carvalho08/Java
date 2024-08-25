package POO;


//Classe Veiculo
public class Veiculos {
	
	//Estados da classe
	private String modelo;
	private String cor;
	private String fabricante;
	private String placa;
	boolean ligado = false;
	int velocidade = 0;
	
	//Construtor Padrão
	Veiculos(){
		this("Desconhecido","Desconhecido", "Desconhecida", "Desconhecida");
	}
	
	//Criando o costructor
	Veiculos(String modelo,String cor,String fabricante,String placa){
		this.modelo = modelo;
		this.cor = cor;
		this.fabricante = fabricante;
		this.placa = placa;
		
	}
	
	//getters (pegar) and setters (atribuir)

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	//Metodos da classe (Comportamentos)
	void ligar() {
		ligado = true;
	}
	
	void acelerar() {
		if(ligado == true) {
			velocidade++;
			System.out.println("Acelerando...");
		} else {
			System.out.println("Ligue o carro primeiro");
		}
	}
	
	void frear() {
		if(ligado == true) {
			velocidade--;
			System.out.println("Freando...");
		} else {
			System.out.println("Ligue o carro primeiro");
		}
	}
	
	void desligar() {
		ligado = false;
	}
	
}
