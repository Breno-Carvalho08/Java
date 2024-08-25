package estrutura_de_controle;

public class For1 {
	public static void main(String[] args) {
		
		//Forma Principal
		for(int cont = 1; cont < 10;cont +=2) {
			System.out.printf("cont = %d \n",cont);
		}
		
		//Outra possibilidade
		int x = 2;
		for(; x<10;) {
			System.out.println("x = " + x);
			x++;
			
		}
		//Laço Infinito = for(;;){}
		
	}
}
