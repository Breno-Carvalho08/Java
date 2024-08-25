package EX_estrutura_de_controle;

import java.util.Scanner;

public class Entre0e10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	

		System.out.println("Informe um número: ");
		int num = entrada.nextInt();
		
		if(num >= 0 && num <= 10) {
			if(num % 2 == 0) {
				System.out.printf("Número %d é par", num);
			}else {
				System.out.println("Número não é par");
			}
			
		}else {
			System.out.println("Digite um valor válido");
		}
		
		
		
		entrada.close();
		
	
	}
}
