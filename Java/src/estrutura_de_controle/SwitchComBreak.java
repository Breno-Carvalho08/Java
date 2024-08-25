package estrutura_de_controle;

public class SwitchComBreak {
	public static void main(String[] args) {
		String Nota = "F";
		
		switch(Nota.toUpperCase()) {
		
		case "A+":
			System.out.println("Nota 10");
			break;
		case "A":
			System.out.println("Nota 9 - 9.9");
			break;
		case "B+":
			System.out.println("Nota 7 - 8.9");
			break;
		case "B":
			System.out.println("Nota 6 - 6.9");
			break;
		case "C+":
			System.out.println("Nota 5 - 5.9");
			break;
		case "C":
			System.out.println("Nota 4 - 4.9");
			break;
		case "D+":
			System.out.println("Nota 3 - 3.9");
			break;
		case "D":
			System.out.println("Nota 2 - 2.9");
			break;
		case "F":
			System.out.println("Nota 0 - 1.9");
			break;
		default:
			System.out.println("Nota não encontrada");
		}
	}
}
