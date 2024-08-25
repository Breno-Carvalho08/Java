package classesExercicios;

public class DataTest {
	public static void main(String[] args) {
		Data data1 = new Data();
		//data1.dia = 8;
		//data1.mes = 2;
		//data1.ano = 2002;
		
		Data data2 = new Data(23,1,1971);
		//data2.dia = 23;
		//data2.mes = 1;
		//data2.ano = 1971;
		
		Data data3 = new Data(14,2,1967);
		//data3.dia = 14;
		//data3.mes = 2;
		//data3.ano = 1967;
		
		Data data4 = new Data();
		
		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
		System.out.println(data3.obterDataFormatada());
		System.out.println(data4.obterDataFormatada());
		
		//Sem precisar chamar o System.out.println();
		//data1.imprimirDataFormatada(); 
		
	}
}
