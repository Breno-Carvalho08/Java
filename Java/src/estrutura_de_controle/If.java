package estrutura_de_controle;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String mediaString = JOptionPane.showInputDialog("Informe a média: ");
		double media = Double.parseDouble(mediaString);
		
		if(media >= 7.0) {
			JOptionPane.showMessageDialog(null, "O aluno passou na média com " + media + "\n Parabéns!");
		} else if(media <7 && media >= 5){
			JOptionPane.showMessageDialog(null, "O aluno passou na média com " + media);
		} else {
			JOptionPane.showMessageDialog(null, "O aluno ficou de Recuperação");
		}
		
		entrada.close();
	}
}
