package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHomogenio {
	public static void main(String[] args) {
		
		//Quando decidimos quais tipos de valrores serão adicionados na lista, precisa ser na forma de classe
		//Integer, String, Double, Float, Caracter
		
		//Criando uma lista que só aceita valores String's
		//Set<String> listaAprovados = new HashSet<>(); //Não tem ordem
		
		//Aqui os valores serão ordenados alfabeticamente
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Breno");
		listaAprovados.add("Carlos");
		listaAprovados.add("Xavier");
		listaAprovados.add("Zebra");
		listaAprovados.add("Lucas");
		listaAprovados.add("Caio");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		SortedSet<Integer> nums = new TreeSet<>();
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(1);
		nums.add(-4);
		//nums.get(2); Não é possível acessar pelo índice
		
		for(int numeros: nums) {
			System.out.println(numeros);
		}
		
	}
}
