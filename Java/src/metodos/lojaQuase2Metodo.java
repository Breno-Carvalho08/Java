package metodos;
import java.util.*;
public class lojaQuase2Metodo {
	
	public void quantidade() {
		int quantidade;
		double dinheiroCliente;
		double troco;
		double valorCompras;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Quantas itens foram comprados? ");
		quantidade = input.nextInt();
		
		valorCompras = quantidade * 1.99;
		
		System.out.println("Qual foi o valor dado pelo cliente? ");
		dinheiroCliente = input.nextDouble();
		
		troco = dinheiroCliente - valorCompras;
		
		if(dinheiroCliente < valorCompras) {
			System.out.printf("Faltando R$ %.2f",(valorCompras - dinheiroCliente));
		}else if(dinheiroCliente == valorCompras || troco > 0.01 && troco < 0.04) {
			System.out.println("Sem troco");
		}else {
			System.out.printf("Troco: R$ %.2f", (troco));
		}
		
		input.close();
		
	}
}
