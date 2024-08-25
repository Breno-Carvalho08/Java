package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		//Operador de Comparação (==)
		
		int a = 1;
		int b = 1;
		System.out.println(a == b);//true
		
		int c = 3;
		System.out.println(c > a); //Maior
		System.out.println(c >= a); //Maior igual
		System.out.println(c < a); // Menor
		System.out.println(c <= a); //Menor igual
		System.out.println(c != a); //Diferente
		System.out.println(c > 4); 
		System.out.println(c <= 5);
		System.out.println(c != a);
		
		double nota = 8.5;
		boolean bomComportamento = true;
		boolean passouPorNota = nota >= 7;
		boolean Desconto = bomComportamento && passouPorNota;
		
		System.out.println("Desconto? " + Desconto);
	}
}
