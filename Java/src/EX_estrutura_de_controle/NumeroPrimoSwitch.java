package EX_estrutura_de_controle;

import java.util.Scanner;

public class NumeroPrimoSwitch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int primo = 0;
		
		System.out.println("Informe um número: ");
		int num = entrada.nextInt();
		
		for(int cont = 1; cont <= num; cont++){
			if(num % cont == 0) {
				primo += 1;
			} else {
				continue;
			}
		}
			
		switch(primo) {
		case 2:
			System.out.println("Número Primo");
			break;
		default:
			System.out.println("Normal");
		}
		
		entrada.close();
	}
}
