package POO.UmParaMuitos;

public class compraTest {
	//Relação 1 para muitos
	public static void main(String[] args) {
		
		compra c1 = new compra();
		c1.cliente = "Breno";
		c1.itens.add(new item("Caneta", 20, 7.45));
		c1.itens.add(new item("Borracha", 12, 4.35));
		c1.itens.add(new item("Caderno", 5, 16.45));
		
		System.out.println(c1.obterValorTotal());
	}
}
