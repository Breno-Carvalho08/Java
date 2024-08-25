package POO.Polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa Breno = new Pessoa(80);
		
		//Polimorfismo Dinamico
		Comida arroz = new Arroz(1);
		Comida feijao = new Feijao(0.5);
		Comida sorvete = new Sorvete(0.3);
		
		Breno.comer(arroz);
		Breno.comer(feijao);
		Breno.comer(sorvete);
		
		System.out.println(Breno.getPeso());
	}
}
