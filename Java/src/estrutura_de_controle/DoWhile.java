package estrutura_de_controle;
import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		//if(...) sentenca; ou {}
		//while(...) sentença; ou {}
		//for(...; ...; ...) sentença; ou {}
		
		//do {} while(...)
		
		String Sair = ""; //colocar ou não, não faz diferenã
		double num;
		double numSomar = 0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número para a soma: ");
			num = entrada.nextDouble();
		
			numSomar = numSomar + num;
			System.out.println(numSomar);
		
			System.out.println("Deseja continuar? \n Sim \n Não");
			String continuar = entrada.next();
		
			Sair = continuar.toLowerCase();
		} while(Sair.trim().equals("sim"));
		
		entrada.close();
	}
}
