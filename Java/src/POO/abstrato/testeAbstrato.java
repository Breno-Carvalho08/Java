package POO.abstrato;

public class testeAbstrato {
	public static void main(String[] args) {
		mamifero cachorro = new cachorro();
		
		System.out.println(cachorro.andar());
		System.out.println(cachorro.respirar());
		System.out.println(cachorro.mamar());
		
		
	}
}
