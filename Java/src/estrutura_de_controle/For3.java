package estrutura_de_controle;

public class For3 {
	public static void main(String[] args) {
		//Escopo (onde a variavel estará armazenada)
		
		//Variaveis definidas fora dos blocos de repetição são de escopo GLOBAL
		//Variaveis definidas dentro do bloco de codigo, metodos ou funções, são de escopo LOCAL
		
		//Exemplo de Matriz
		//O Primeiro "for" só volta a ser inicializado quando o de dentro conclui o loop até o 2
		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j <= 3; j++) {
				System.out.printf("[%d %d] ", i,j);
			}
			System.out.println();
			
		}
		//System.out.println(i); Aqui o "i" não é encontrado ja que ele está dentro do escopo do "for"
	}
}
