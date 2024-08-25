package colecoes;

import java.util.*;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
//		.add() lançará uma exceção caso a fila esteja cheia.
//		.offer() retorna falso caso a fila esteja cheia.
		
//		Tanto um como outro tem a função de adicionar valores a Fila
//		O que diferencia os dois é quando a fila está cheia
		fila.add("Ana");
		fila.offer("Breno"); //Retorna falso caso esteja cheia
		fila.add("Lucas");
		fila.offer("Carlos");
		fila.add("Caio");
		
		//Peek e Element -> obter o proximo elemento da fila sem remover
		System.out.println(fila.peek()); //Retorna falso se estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element()); //Lança uma exceção se a fila está vazia
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
		
		//Poll e remove -> obtem o proximo elemento da fila, já removendo
		System.out.println(fila.poll()); //Mostra o elemento ja removendo ele
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); //Aqui vai retornar nulo pois todos ja foram removidos
		System.out.println(fila.remove()); //Nesse caso, como não há elementos, ele irá retornar uma exceção
		
	}
}
