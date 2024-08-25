package estrutura_de_controle;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		double somaNota = 0;
		int Ficar_ou_Sair = 1;
		double quantAluno = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Utiliza virgula ',' ");
		
		while(Ficar_ou_Sair == 1) {
			System.out.println("Digite a nota (ou -1 para sair): ");
			double nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
			somaNota += nota;
			
			quantAluno += 1;
			
			}else if(nota > 10) {
				System.out.println("Digite uma nota válida \n");
			} 
			
			
			else  {
				Ficar_ou_Sair = -1;
			}
		}
		
		BigDecimal mediaSala = new BigDecimal(somaNota / quantAluno);
		BigDecimal mediaSalaArredondado = mediaSala.setScale(2,RoundingMode.CEILING);
		
		
		System.out.println(mediaSalaArredondado);
	
		entrada.close();
	}
}
