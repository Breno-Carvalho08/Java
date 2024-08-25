package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		// + - * / %
		
		String valor1 = JOptionPane.showInputDialog("Primeiro Número");
		double num1 = Double.parseDouble(valor1);
		String valor2 = JOptionPane.showInputDialog("Segundo Número");
		double num2 = Double.parseDouble(valor2);
		
		String op = JOptionPane.showInputDialog("Qual operação? \n x \n / \n + \n - \n % ");
		
		//Lógica
		String Resultadox = op.equals("x")? Double.toString(num1 * num2) : "Valor da Operação Inválida";
		String Resultadodiv = op.equals("/")? Double.toString(num1 / num2) : " ";
		String Resultadosoma = op.equals("+")? Double.toString(num1 + num2) : " ";
		String Resultadomenos = op.equals("-")? Double.toString(num1 - num2) : " ";
		String Resultadoresto = op.equals("%")? Double.toString(num1 % num2) : " ";

		//Outra Forma
		/*
		 * double resultado = "+".equals(op) ? num1 + num2 : 0;
		 * double resultado = "-".equals(op) ? num1 - num2 : resultado;
		 * double resultado = "*".equals(op) ? num1 * num2 : resultado;
		 * double resultado = "/".equals(op) ? num1 / num2 : resultado;
		 * double resultado = "%".equals(op) ? num1 % num2 : resultado;
		 
		 Aqui sempre que o valor de "op" não for atendido, o programa retorna para o resultado até encontar um valor aceitavel para "op"
		 Caso não encontre, o programa retorna o valor 0.
		 
		 * */
		System.out.println((Resultadox + Resultadodiv + Resultadosoma + Resultadomenos + Resultadoresto).trim()); 
		// Retira os espaços deixados pelo operador Ternário
		
		
	}
}
