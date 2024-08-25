package POO.UmParaMuitos;

import java.util.ArrayList;

public class compra {
	
	String cliente;
	
	
	//Uma relação aqui de 1 pra muitos, já que uma compra possui vários itens
	ArrayList<item> itens = new ArrayList<item>();
	
	double obterValorTotal() {
		double total = 0;
		
		//A váriavel local "item" (declarada dentro do escopo do loop) vai percorrer o arraylist "itens".
		/*item (em azul) são os tipos de elementos que estão no arraylist. Se fosse um valor 
		  inteiro, colocariamos for(int item: itens){} */
		
		for(item item: itens) {
			//item.quantidade e item.preco são propriedades contidas dentro da classe "item".
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
	
}
