package estrutura_de_controle;

public class Break {
	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {break;} //Break faz mais sentido dentro de um laço de repetição pois o interrompe
			//Ele vai parar o programa e fazer com que ele saia do loop
		}
		System.out.println("Saiu do FOR");
	}
}
