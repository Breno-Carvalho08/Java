package fundamentos.Conversao;

public class ConcersaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000; ////Wrapper = versão orientada a objeto dos tipos primitivos
		int num2 = 3;
		System.out.println(num1.toString().length()); //Forma de conversão com Wrapper
		
		
		int num3 = 10;
		System.out.println(Integer.toString(num2).length()); //Forma de conversão com tipo primitivo
		System.out.println((""+ num1).length()); //Forma de conversão atráves das de uma String Vazia
		System.out.println((""+ num2).length());
		System.out.println(Integer.toString(num3).length()); //Repare que o número "int" é 10 mas como ele está agora como String o valor mostrado será 2
		//pois ele está contando os caracteres.
	}
}
