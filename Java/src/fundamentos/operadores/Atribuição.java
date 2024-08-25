package fundamentos.operadores;

public class Atribuição {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		 c += b; //c = c + b; Atribuição Somativa
		 System.out.println(c);
		 
		 c -= a; //c = c - a; Atribuição Subtrativa
		 System.out.println(c);
		 
		 c *= b; //c = c * b; Atribuição Multiplicativa
		 System.out.println(c);
		 
		 c /= a; //c = c / a; Atribuição Divisiva
		 System.out.println(c);
		 
		 c %= 2; //c = c % 2; 0 ou 1 Atribuição Modulo
		 System.out.println(c);
		 
		 //(c = c + 1) == (c++);
	}
}
