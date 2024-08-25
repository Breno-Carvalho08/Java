package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 5; // utilizando casas decimais utilizamos o tipo primitivo DOUBLE!
		final double PI = 3.14159; // Colocando o "final" antes do tipo do dado ele se torna uma CONSTANTE!
		double area = PI * (raio * raio);
		 
		System.out.printf("Valor da área é " + "%.2f", area); //Concatenando String com o valor da área
	}
}
