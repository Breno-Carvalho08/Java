package classes;

public class AreaCircTest {
	public static void main(String[] args) {
		AreaCirc c1 = new AreaCirc(4);
		AreaCirc c2 = new AreaCirc(5);
		AreaCirc c3 = new AreaCirc(6);
		
		
		System.out.printf("%.2f\n",c1.area());
		System.out.printf("%.2f\n",c2.area());
		System.out.printf("%.2f\n",c3.area());
		System.out.printf("%.2f",AreaCirc.area(2)); //Sem precisar criar uma nova instância
		
		//System.out.println(AreaCirc.pi); //Como "pi" pertence a classe, podemos chama-lo pela notação ponto.
	}
}
