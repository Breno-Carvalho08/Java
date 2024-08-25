package colecoes;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

public class TestandoParteDoPrograma {

	Scanner entrada = new Scanner(System.in);
	SortedSet<Double> listaNotas = new TreeSet<>(Comparator.reverseOrder());
	/*
	 Como o SortedSet<Double> listaNotas = new TreeSet<>(); ordena do menor para o maior, utilizamos o 
	 Comparator.reverseOrder() para inverter a ordem e ficar da mais alta para a mais baixa.
	 */
	int quantNotas = 0;
	
	 void adicionarNotas() {
		
		System.out.println("Quantas notas deseja adiconar? ");
		quantNotas = entrada.nextInt();
	
		for(int i = 0; i < quantNotas;i++) {
			System.out.println("Digite a " + (i+1) + "° nota: ");
			double notas = entrada.nextDouble();
			listaNotas.add(notas);	
		}	
	}
	
	void verificarNotas() {
		
		for(double VerNotas: listaNotas) {
			System.out.println(VerNotas);
		}
		
	}
}
