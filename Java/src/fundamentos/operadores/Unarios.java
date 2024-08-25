package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; //Incrementar a = a + 1; Pós-Fixada
		a--; //Decremento  a = a - 1; Pós-Fixada
		
		++b; //Incrementar b = b + 1; Pré-Fixada
		--b; //Decremento  b = b - 1; Pré-Fixada
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(++a == b--); // O que acontece aqui é o seguinte: no "++a" é como se você estivesse "apressado para realizar a operação", então será
		//feita logo de imediato. Após isso temos o "b--" que como se trata de algo pós-fixado você não está "tão apressado" para realizar essa operação.
		//Ele dará verdadeiro porquê ele irá realizar a operação de comparação antes de DECREMENTAR o "b".
	}
}
