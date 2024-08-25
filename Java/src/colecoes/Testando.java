package colecoes;

import java.util.Scanner;


public class Testando {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int escolha2 = 0;
		int escolha = 0;
		TestandoParteDoPrograma u1 = new TestandoParteDoPrograma();
		
		System.out.println("------------------------------");
		System.out.println("Bem Vindo ao sistema de notas!");
		System.out.println("------------------------------\n");
		
		System.out.println("1 - Adicionar notas \n2 - Verificar notas ");
		escolha = entrada.nextInt();
		
			switch(escolha) {
				case 1:
					u1.adicionarNotas();
					break;
				case 2:
					u1.verificarNotas();
					break;
					}
				
			System.out.println("Deseja verificar as notas? \n1 - Sim \n2 - Não");
			escolha2 = entrada.nextInt();
			
			switch(escolha2) {
			case 1:
				u1.verificarNotas();
				break;
			case 2:
				System.out.println("Notas adicionadas com sucesso!");;
				break;
				}
			
					
			entrada.close();
		}
		
	}


