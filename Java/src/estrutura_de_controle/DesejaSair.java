package estrutura_de_controle;
import java.util.Scanner;
public class DesejaSair {
	public static void main(String[] args) {
		String Sair = "sim";
		double num;
		double numSomar = 0;
		Scanner entrada = new Scanner(System.in);
		
	
			while(Sair.trim().equals("sim")) {
				System.out.println("Digite um número para a soma: ");
				num = entrada.nextDouble();
			
				numSomar = numSomar + num;
				System.out.println(numSomar);
			
				System.out.println("Deseja continuar? \n Sim \n Não");
				String continuar = entrada.next();
			
				Sair = continuar.toLowerCase();
			}
		entrada.close();
		}
	}


