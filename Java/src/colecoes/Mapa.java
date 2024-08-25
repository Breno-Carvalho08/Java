package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer,String> usuario = new HashMap<Integer,String>();
		
		usuario.put(1, "Breno");
		usuario.put(2, "Lucas");
		usuario.put(3, "Fernando");
		usuario.put(4, "Caio");
		//usuario.put(1, "Caio"); //Aqui ele irá substituir os valores, no caso, sai "Breno" entra "Caio".
		
		System.out.println(usuario.size()); //3
		System.out.println(usuario.keySet()); //["Breno", "Lucas", "Fernando", "Caio"]
		System.out.println(usuario.values()); //[1, 2, 3, 4]
		System.out.println(usuario.entrySet()); //[1=Breno, 2=Lucas, 3=Fernando, 4=Caio]
		System.out.println(usuario.containsKey(3)); //true (3 = Fernando)
		System.out.println(usuario.get(1)); //Retorna o valor de numero 1 (Breno)
		System.out.println(usuario.remove(1, "Mario"));//Caso os valores batam com o do Map, ele remove (true)
		
		System.out.println();
		
		System.out.println();
		
		for(int chave: usuario.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println();
		
		for(String valor:usuario.values()) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		for(Entry<Integer, String> registro: usuario.entrySet()) {
			System.out.print(registro.getKey() + " -> ");
			System.out.println(registro.getValue());
			
		}
		
	}
}
