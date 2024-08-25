package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		//printf = formatação
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6 ); //%d = numeros inteiros
		// %n = quebra de linha
		
		System.out.printf("Salário: %.2f %n", 3356.34123);
		System.out.printf("Nome: %s", "Breno \n");
		
		Scanner entrada = new Scanner(System.in); //System.in = entrada do sistema (Contrário do System.out)
		//Dispositivo de entrada = teclado
		
		System.out.println("Imprima seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println(nome);
		
		entrada.close(); // Fechamos o Scanner para ele não ocupar dados da máquina
	}
}
