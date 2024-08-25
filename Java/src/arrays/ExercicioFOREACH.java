package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioFOREACH {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double [] notasAlunoA = {5.6,6.7,8.9};
		double [] notasAlunoB = new double[3];
		double totalA = 0;
		double totalB = 0;
		
		//Utilizando laço de repetição para colocar valores no Array
		/*
		 for(int i = 0; i < notasAlunoA.length; i++) {
			System.out.println(i + 1 + "° nota do aluno: ");
			nota = entrada.nextDouble();
			notasAlunoA[i] = nota;
			total += notasAlunoA[i];
		}
		*/
		//Utilizando o ForEach para percorrer o array.
		for(double nota : notasAlunoA) {
			totalA += nota;
			System.out.print(totalA + " ");
			
		}
		
		//Atribuindo valores manualmenta ao Array
		notasAlunoB[0] = 5.7;
		notasAlunoB[1] = 6.8;
		notasAlunoB[2] = 1.9;
		System.out.println();
		
		for(double nota:notasAlunoB) {
			totalB += nota;
			System.out.print(totalB + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(Arrays.toString(notasAlunoB));
		System.out.printf("Nota média do aluno: %.2f" , totalA/3);
		System.out.println();
		System.out.printf("Nota média do aluno: %.2f", totalB/3);
		entrada.close();
		
	}
}
