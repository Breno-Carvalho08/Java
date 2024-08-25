package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do Funcionário
		
		//Tipos numéricos
		
		byte anosDeEmpresa = 23; //Range do byte = 127
		short numeroDeVoos = 50; //Range do short = 32767
		int id = 56789;
		long pontosAcumulados = 6_134_845_221L; //Esse "L" no final é colocado para que o Java entenda que o valor atribuido será do tipo "long".
		//Caso não coloque ele entenderá que se trata de um tipo Inteiro e esse valor ultrapassa o "range" dos inteiros.
		
		//Tipos numéricos reais
		
		float salario = 11_543.44F; //Escrevendo assim o java entende que estamos escrevendo um "literal float".
		//Independente do valor colocado, o java lê o tipo e não o valor numérico.
		//Por padrão, esse valor representa um valor "double". Para colocarmos esse valor dentro do float a letra "F" tem que ser colocada no final do número.
		//Como o "double" é maior que o float temos que fazer essa conversão literal colocando o "F" no final.
		
		double vendasAcumuladas = 2_991_843_213.01;
		
		//Tipo Booleano
		boolean estaDeFerias = false; // ou true
		
		//Tipo caractere
		char status = 'A';
		
		System.out.println("O id "+ id + " está a " + anosDeEmpresa + " anos na empresa.");
		
		//Número de viagens
		System.out.println(numeroDeVoos/ 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha --> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
