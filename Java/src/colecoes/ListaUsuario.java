package colecoes;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuario {
	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Breno");
		lista.add(u1);
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("Kai"));
		lista.add(new Usuario("Pedro"));
		lista.add(new Usuario("Pedro"));
		
		System.out.println(lista.get(0).nome); //Acessa o elemento de indice 0 da lista
		System.out.println(lista.get(0)); 
		System.out.println(lista.get(4).nome);
		System.out.println();
		
		//Outra forma de remover, pelo nome
		System.out.println(lista.remove(new Usuario("Lucas"))); //Remove o elemento escrito entre parenteses
		//Mostra se o elemento entre parenteses está na Lista
		System.out.println("........." + lista.contains(new Usuario("Pedro")));;
		System.out.println(lista.remove(new Usuario("Pedro")));
		System.out.println();
		
		for(Usuario user : lista) {
			System.out.println(user.nome.toString()); //Implicitamente ele chama esse método
			//Nesse caso ele está explicito
		}
	}
}
