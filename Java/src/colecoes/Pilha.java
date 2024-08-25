package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Universo em uma casca de nós");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		for(String livro : livros) {
			System.out.println(livro);
		}
		System.out.println();
		
		//O principio é o mesmo que o da Fila
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		//O principio é o mesmo que o da Fila
		System.out.println(livros.pop());
		System.out.println(livros.remove());
		//System.out.println(livros.poll());
		
//		livros.size();
//		livros.clear();
//		livros.contains(livros);
		System.out.println();
		
		for(String livro : livros) {
			System.out.println(livro);
		}
	}
}
