package POO.heranca.CARRO;


public interface Esportivo {
	
	//TODOS os métodos adicionados na Interface são PUBLICOS e ABSTRACT
	
	//Método abstrato = ligarTurbo()   X{ não possui corpo}
	//Método Convercional = ligarTurbo(){ Possui o seu corpo }
	
	public abstract void ligarTurbo(); //Abstract
	void desligarTurbo(); //Abstract
}
