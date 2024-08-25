package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantNotas;
		double total = 0;
		
		//Informando o tamanho do array
		System.out.println("Quantas notas você deseja colocar? ");
		quantNotas = entrada.nextInt();
		
		double [] notas = new double[quantNotas];
		
		//Percorrendo o array e adicionando valores com base no tamanho colocado antes.
		for(int j = 0; j < notas.length; j++) {
			System.out.println("Informe a " + (j + 1) + "° nota: ");
			notas[j] = entrada.nextDouble();
		}
		System.out.println(Arrays.toString(notas));
		System.out.println();
		
		/*
		Percorrendo o array sem precisar de uma váriavel de contagem e somando os vaalores na 
		váriavel total
	quantNotas*/
		for(double notasAlunoA: notas) {
			total += notasAlunoA;
		}
		
		double media = total/quantNotas;
		System.out.println("Calculando...");
		System.out.printf("Média das notas: %.2f",media);
	
		
		entrada.close();
	}
}
