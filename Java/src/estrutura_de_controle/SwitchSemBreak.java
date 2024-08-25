package estrutura_de_controle;


public class SwitchSemBreak {
	public static void main(String[] args) {
	
	
		String faixa = "preta";
		//Nesse caso, caso algum case seja executado, todos abaixo serão executados também, a não ser que seja o ultimo
		//Em casos especificos(exemplo algum conhecimento) é interessante utilizar o Switch sem o Break
		switch(faixa.trim().toLowerCase()) {
		case "preta":
			System.out.println("Sei o que to fazendo");
		case "marrom":
			System.out.println("Ainda sei o que to fazendo");
		case "roxa":
			System.out.println("To sabendo bem ainda");
		case "verde":
			System.out.println("Na metade de tudo");
		case "laranja":
			System.out.println("To aprendendo, mas dou um caldo");
		default:
			System.out.println("iii \n");
		}
		
		int idade = 3;
		switch(idade) {
		case 3:
			System.out.println("Sabe andar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe respirar");
			break;
		default:
			System.out.println("Sabe de nada");
		}
	}
}
