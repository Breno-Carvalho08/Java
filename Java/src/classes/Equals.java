package classes;

public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		
		u1.nome = "Breno Carvalho";
		u1.email = "Brecar08@gmail.com";
		
		Usuario u2 = new Usuario();
		
		u2.nome = "Breno Carvalho";
		u2.email = "Brecar08@gmail.com";
		
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		
	}
	
}
