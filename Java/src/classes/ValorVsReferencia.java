package classes;
import classesExercicios.Data;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		//Atribuição por Valor (Tipo Primitivo)
		double a = 2;
		double b = a;
		
		a++;
		b--;
		System.out.println(a + " " + b);
		
		//Atribuição por Referência (Objeto)
		Data d1 = new Data(1,1,2020);
		Data d2 = d1;;
		
		d1.dia = 31; //Atribuir um valor quando a atribuição foi feita por referência, a alteração é feita em ambas as variáveis
		d2.mes = 12;
		d1.ano = 2024;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		System.out.println(d1.obterDataFormatada());//Aqui o valor é alterado pois mexemos na referência
		voltarDataParaValorPadrao(d2);
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c + 1);//Não gera impacto no valor de C, pois o parametro que foi gerado é uma cópia.
		System.out.println(c); //Nessa parte, o valor acessado está na memória, por isso que ele não é alterado
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++; //Não afeta o tipo primitivo do lado de fora
	}
}
