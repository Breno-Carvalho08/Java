package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class exercicios {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota;
		double [] notasAlunoA = new double[3];
		double [] notasAlunoB = new double[3];
		double total = 0;
		
		//Utilizando laço de repetição para colocar valores no Array
		for(int i = 0; i < notasAlunoA.length; i++) {
			System.out.println(i + 1 + "° nota do aluno: ");
			nota = entrada.nextDouble();
			notasAlunoA[i] = nota;
			total += notasAlunoA[i];
		}
		
		//Atribuindo valores manualmenta ao Array
		notasAlunoB[0] = 5.7;
		notasAlunoB[1] = 6.8;
		notasAlunoB[2] = 1.9;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.printf("Nota média do aluno: %.2f", total/3);
		entrada.close();
		
		
	}
}
