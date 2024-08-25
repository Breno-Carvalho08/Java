package colecoes;

import java.util.Objects;

public class Usuario {
	
	String nome;

	Usuario(String nome){
		this.nome = nome;
	}

	public String toString() {
		return "Meu nome é " + nome + ".";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario outroUsuario = (Usuario) obj;
		return Objects.equals(nome, outroUsuario.nome);
	}
	
	//Forma Simples do equals
//	public boolean equals(Object obj) {
//		
//		Usuario outroUsuario = (Usuario) obj;
//		return nome.equals(outroUsuario.nome);
//	}
	
	
}
