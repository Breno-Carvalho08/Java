package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	//DADOS HETEROGÊNIOS
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); //double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size()); // Tamanho do conjunto
		conjunto.add("Teste"); //Como o set não aceita repetição, o tamanho do conjunto não se altera.
		
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.remove(2)); //Remove um elemento do conjunto
		System.out.println(conjunto.remove(true));
		System.out.println(conjunto.remove('x'));
		System.out.println(conjunto.contains(1));//Verifica se o elemento está no conjunto
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(true));
		
		
		System.out.println("Tamanho é " + conjunto.size());
	
	
		Set nums = new HashSet();
	
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //União entre dois conjuntos
		conjunto.retainAll(nums); //Intersecção entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}
