package metodos;
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.Math;

public class programacaoMetodo {
	double area;
	final int valorLata = 580;
	final int valorGalao = 125;
	final double tamanhoGalao = 3.6;
	final int tamanhoLata = 18;
	final double areaPintada = 0.167; // O que 1 litro pinta 
	
	Scanner input = new Scanner(System.in);
	
	public void valores(){
		System.out.println("Digite a area que deseja ser pintada: ");
		area = input.nextDouble();
	}
	
	//Quantidade e Preço das Latas de Tinta
	public void lata() {
		BigDecimal valor = new BigDecimal(area*areaPintada/tamanhoLata); //Objeto criado para arredondar valores 
		BigDecimal valorArredondado = valor.setScale(0,RoundingMode.CEILING);// Aqui estamos falando que o numero obtido será arrendondado para cima
		//atraves da linha de codigo "RoundingMode.CEILING" e o "0" que acompanha antes será o número de casas decimais
		System.out.println("Preço: R$ " + ((area*areaPintada)*580));
		System.out.println("A quantidade de latas é de " + (valorArredondado));
		}

	//Quantidade e Preço dos Galões de Tinta
	public void galao() {
		BigDecimal valor2 = new BigDecimal(area*areaPintada/tamanhoGalao); //Objeto criado para arredondar valores 
		BigDecimal valor2Arredondado = valor2.setScale(0,RoundingMode.CEILING);// Aqui estamos falando que o numero obtido será arrendondado para cima
		//atraves da linha de codigo "RoundingMode.CEILING" e o "0" que acompanha antes será o número de casas decimais
		System.out.println("Preço: R$ " + ((area*areaPintada)*125));
		System.out.println("A quantidade de galões é de " + (valor2Arredondado));
	}
	
	//Divido entre Galões e Latas
	public void galaoLata() {
		
		double precoLata = 580;
		double precoGalao = 125;
		double areaSobra = 0;
		int quantLata = 0;
		int quantGalao = 0;
		double areaTotal = Math.ceil(area*areaPintada); //Em litros

		
		 while(areaTotal > tamanhoLata) {
			 areaTotal = areaTotal - tamanhoLata;
			 quantLata++;
			 areaSobra = areaTotal;
		 }
		 
		 while(areaSobra > tamanhoGalao) {
			areaSobra = areaSobra - tamanhoGalao;
			quantGalao++;
		 }
		 
		 System.out.println("Quantidade de Latas de 18 Litros: " + quantLata);
		 System.out.println("R$"+ precoLata * quantLata);
		 System.out.println("Quantidade de Galões de 3,6 Litros: " + (quantGalao + 1));
		 System.out.println("R$"+ precoGalao * (quantGalao + 1));
		 
	}
}


