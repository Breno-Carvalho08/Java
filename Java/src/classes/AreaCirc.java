package classes;

public class AreaCirc {
	
	static final double pi = Math.PI; //final define CONSTANTE. A ordem do static e do final não importa.
	double raio;
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	double area() {
		return Math.pow(raio, 2) * pi;
	}
	
	
	 static double area(double raio) {
		return Math.pow(raio, 2) * pi;
	}
}
