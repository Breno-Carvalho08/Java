package fundamentos;
import java.util.Scanner;


public class DESAFIO_CONVERSAO {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String valor1 ;
		String valor2 ;
		String valor3 ;
		
		System.out.println("Informe o primeiro salário: ");
		valor1 = input.nextLine().replace(",", "."); //Utilizamos o replace para trocar os lugares com vírgula pelo ponto.
		
		System.out.println("Informe o segundo salário: ");
		valor2 = input.nextLine().replace(",", ".");
		
		System.out.println("Informe o terceirosalário: ");
		valor3 = input.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3)/3;
		
		System.out.println("Média Salarial: "+ Math.round(media));
		
		
		input.close
		();
	}
}
