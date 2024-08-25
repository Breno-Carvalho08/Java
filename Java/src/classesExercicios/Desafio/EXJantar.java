package classesExercicios.Desafio;

public class EXJantar {
	
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Carlos", 89);
		Comida comida1 = new Comida("Feijão",0.3);
		Comida comida2 = new Comida("Arroz", 0.4);
			
		System.out.println(pessoa1.apresentar());
		pessoa1.Comer(comida2);
		System.out.println(pessoa1.apresentar());
		pessoa1.Comer(comida1);
		System.out.println(pessoa1.apresentar());
	}
}
