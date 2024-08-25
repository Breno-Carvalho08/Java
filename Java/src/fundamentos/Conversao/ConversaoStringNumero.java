package fundamentos.Conversao;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		
		System.out.println(valor1 + "\n" + valor2);
		
		double numero1 = Double.parseDouble(valor1);//Coversão String -> Número
		double numero2 = Double.parseDouble(valor2);//Coversão String -> Número
		
		double soma = numero1 + numero2;
		
		System.out.println(soma);
		
		//java.math.BigDecimal;
		//BigDecimal irá te ajudar com a precisão dos resultados
	}
}
