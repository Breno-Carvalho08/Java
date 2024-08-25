package POO.encapsulamento.casaB;

import POO.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeacesso() {
		
		
		
	
		
		//System.out.println(mae.segredo);
		//System.out.println(mae.dentroDeCasa); //Só é visivel no mesmo pacote, não é transmitido por herança
		
		//System.out.println(mae.formaDeFalar); //Não vai funcionar pois estamos tentando acessar atraves de uma instancia
		//como ele herda as caracteristicas da Ana, não tem necessidade de criar um objeto para isso.
		
		System.out.println(formaDeFalar); //Recebemos esses atributos por herança 
		
		System.out.println(new Ana().todosSabem);
		
	}
	
}
