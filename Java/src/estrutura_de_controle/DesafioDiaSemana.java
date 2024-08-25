package estrutura_de_controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner DiaSemana = new Scanner (System.in);
		
		System.out.println("Escreva o Dia da semana: ");
		String ValorDiaSemana = DiaSemana.nextLine();
		
		/* if(ValorDiaSemana == 1) {
			System.out.println("Domingo");
		}else if(ValorDiaSemana == 2) {
			System.out.println("Segunda");
		}else if(ValorDiaSemana == 3) {
			System.out.println("Terça");
		}else if(ValorDiaSemana == 4) {
			System.out.println("Quarta");
		}else if(ValorDiaSemana == 5) {
			System.out.println("Quinta");
		}else if(ValorDiaSemana == 6) {
			System.out.println("Sexta");
		}else if(ValorDiaSemana == 7) {
			System.out.println("Sábado");
		} */
		
		if(ValorDiaSemana.trim().equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		}else if(ValorDiaSemana.trim().equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		}else if(ValorDiaSemana.trim().equalsIgnoreCase("Terça") || 
				 ValorDiaSemana.trim().equalsIgnoreCase("Terca")) {
			System.out.println(3);
		}else if(ValorDiaSemana.trim().equalsIgnoreCase("Quarta")) {
			System.out.println(4);
		}else if(ValorDiaSemana.trim().equalsIgnoreCase("Quinta")) {
			System.out.println(5);
		}else if(ValorDiaSemana.trim().equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		}else if(ValorDiaSemana.trim().equalsIgnoreCase("Sábado") ||  
				 ValorDiaSemana.trim().equalsIgnoreCase("Sabado")) {
			System.out.println(7);
		}
		
		DiaSemana.close();
	}
}
