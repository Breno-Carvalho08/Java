package estrutura_de_controle;
import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String Valor = JOptionPane.showInputDialog(
				"Informe o número: ");
		int num = Integer.parseInt(Valor);
		
		if(num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Número par");
		} else {
			JOptionPane.showMessageDialog(null, "Número ímpar");
		}
	}
}
