package classesExercicios;

public class Data {
    public int dia;
	public int ano;
	public int mes;
	
	//final int x; Quando definimos uma constante, precisamos inicializar ela no objeto ou no construtor
	
	//CONSTRUTORES
	
	//Construtor Padrão
	 Data(){
		 /*
		dia = 1;
		mes = 1;
		ano = 1970;
		*/
		 this(1,1,1970); // Só podemous utilizar essa forma dentro de um construtor
		 //usamos para apartir de um construtor, chamar outro construtor
		 
		 //int a;
		 //Porém, uma váriavel local não é inicializada por padrão.
				
	}
	
	//Construtor Explicito com data padrão
	public Data(int diaInicial, int mesInicial, int anoInicial){
	//O "this." é utilizado quando queremos acessar uma variavel que pertence a instância
		this.dia = diaInicial;
		this.mes = mesInicial;
		this.ano = anoInicial;
	}
	
	
	//MÉTODOS
	public String obterDataFormatada() {
		return String.format("%d/%d/%d", this.dia,this.mes,this.ano);
	}
	
	
	//Outra forma
	/*Aqui conseguimos usar o System.out.println() porque ele não retorna nenhum tipo (void), 
	logo não ha necessidade de colcoar o return*/
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada()); // ou apenas .obterDataFormatada()
	}
	
	/*
	 static void test() {
		this.dia = 3;
 		Não é possível utilizar o this quando usamos o "static"
 	 } 
	*/
}
