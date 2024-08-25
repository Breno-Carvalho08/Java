package classes;

public class Usuario {

	String nome;
	String email;
	
	
	public boolean equals(Object jonas) {
		/*
		 Aqui, antes de fazer o casting para Usuario, verificamos 
		 se "objeto" é uma instância de Usuario. 
		 Isso ajuda a evitar possíveis erros de casting em tempo de execução.
		 */
		if(jonas instanceof Usuario) {
			/*
			 É importante ter cuidado ao realizar castings em Java, pois se o objeto passado como 
			 parâmetro não for realmente uma instância de Usuario, a operação de casting pode gerar 
			 uma exceção ClassCastException. Para evitar isso, é recomendável verificar primeiro se 
			 o objeto é do tipo correto usando INSTANCEOF.
			 */
			Usuario outro = /*Casting*/ (Usuario) jonas; 
			/*
			essa linha é usada para converter o objeto genérico (Object) em um objeto 
			do tipo Usuario, para que você possa acessar os atributos 
			NOME e EMAIL desse objeto e compará-los com os atributos do objeto atual (this).
			  */
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			return nomeIgual && emailIgual; 
			//V && V = TRUE, V && F = FALSE, F && V = FALSE, F && F = FALSE
			
		}else {
			return false;
		}
		
	}
}
