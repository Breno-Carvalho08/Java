package POO.Desafio;

public class compraTest {
	public static void main(String[] args) {
		
		
		compra compra1 = new compra();
		compra1.adicionarItem("Caneta", 5, 100);
		compra1.adicionarItem(new produto("Notebook", 2000), 2);
		
		compra compra2 = new compra();
		compra2.adicionarItem("Caderno",10,10);
		compra2.adicionarItem(new produto("Impressora", 1000), 1);
		
		cliente cliente = new cliente("Breno");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
}
