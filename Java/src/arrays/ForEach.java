package arrays;

public class ForEach {
	
	public static void main(String[] args) {
		
		double[] notas = {8.6, 4.4, 7.8, 4.2, 5.5};
		/*
			for (int i = 0; i < notas.length; i++) {
				System.out.println(notas[i]);
			}
			*/
		
		//ForEach: utilizado quando precisamos percorrer um array sem precisar usar um contador
		//É preciso criar uma váriavel dentro do ForEach, que nesse caso é a várivavel "double"
		for(double nota : notas) { //O valor de nota sempre será alterado, pois recebe um valor 
			                      // diferente de dentro do array "notas"
			if(nota > 5) {
				System.out.println("Aprovado: " + nota);
			}else {
				System.out.println("Reprovado: " + nota);
			}
			/*
			Nesse caso ele irá percorrer todo o array e em caso de alguma condição ser satisfeita
			ele ira retornar um valor "Aprovado" ou "Reprovado". */
			
		}
	}
}	
