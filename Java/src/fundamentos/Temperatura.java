package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//(°F - 32) x 5/9 = (valor)°C --> Se utilizarmos os valores 5 e 9 sem ponto flutuante o valor que vai retornar será sempre 0. 
		//Para evitar esse erro basta colocar .0 em qualquer um dos dois --> 5.0/9 ou 5/9.0
		
		int tempFahrenheit = 84;
		final int const1 = 32;
		final double const2 = 5.0/9.0;
		double tempCelsius = (tempFahrenheit - const1) * const2;
		
		System.out.println("Temperatura em Graus Celsius: " + tempCelsius);
		
		tempFahrenheit = 100;
		tempCelsius = (tempFahrenheit - const1) * const2;
		System.out.println("Temperatura em Graus Celsius: " + tempCelsius);
		
	}
}
