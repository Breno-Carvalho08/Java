package fundamentos.Conversao;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; //Conversão implícita
		
		//CAST
		float b = (float)1.42156236147143; //Conversão explícita (CAST)
		//ou podemos apenas colocar a letra "F" na frente do número
		//o tipo float não suporta essa quantidade de informação, então ele acabará perdendo parte dela, ficando o valor "1.4215623"
		
		System.out.println(a);
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c; //Conversão explícita (CAST)
		//Teremos um problema. O tipo primitivo "int" é maior que o tipo primitivo "byte", ou seja, estamos colocando algo "grande" onde ele não cabe
		//Assim fazemos a conversão (CAST) para o "int" virar "byte"
		
		//Como os valores do TP "byte" vão de -128 até 128 quando ultapassamos esses valores ele recomeça, por isso que quando colcamos 128 no valor "c" ele
		//retorna -128 pois atingiu o valor máximo da sua capacidade
		System.out.println(c);
		System.out.println(d);
		
		double e = 1.76;
		int f = (int) e; //Conversão explícita (CAST)
		//Irá ocorrer uma perda de informação, já que o valor que "f" receberá será "1".
		System.out.println(e);
		System.out.println(f);
	}
}
