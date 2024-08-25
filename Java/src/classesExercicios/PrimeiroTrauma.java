package classesExercicios;


public class PrimeiroTrauma {
	
	int a = 3;
	static int b = 4; //Membros de classe iguais (static)
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma();
		/*
		Para acessar uma instância fora do de um metodo estatico
		temos que criar uma instancia para acessar o atributo da instância, nesse caso o "a".
		*/
		System.out.println(p.a);
		//System.out.println(p.b);
		
		System.out.println(b);
	}
}
