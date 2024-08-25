package POO.Desafio;
import java.util.ArrayList;
import java.util.List;

public class compra {
	
	List<item> itens = new ArrayList<>();
	
	void adicionarItem(produto p, int quant) {
		this.itens.add(new item(p, quant));
	}
	
	void adicionarItem(String nome, double preco, int quant) {
		var produto = new produto(nome, preco);
		this.itens.add(new item(produto, quant));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(item item: itens) {
			total += item.quant * item.produto.preco;
		}
		
		return total;
	}
}
