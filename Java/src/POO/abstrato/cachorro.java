package POO.abstrato;

public class cachorro extends mamifero{

	/*
	 Apenas nas classes concretas que se faz necessário implementar
	 o corpo do método
	*/

	@Override
	public String andar() {
		return "Com as patas";
	}
	
	@Override
	public String mamar() {
		return "usando leite";
	}
	
	/*Tornar o método final significa que ele não poderá ser
	  ser escrito novamente na classe filha*/
	@Override
	public final String respirar() {
		return "Co2";
	}
}
