package POO.Desafio2;



public class Usuario {
	
	private String nome;
	private String CPF;
	String[] livrosComUsuario = new String[5];

	Usuario(String nome, String CPF){
		this.nome = nome;
		this.CPF = CPF;
	}
	String getNome() {
		return nome;
	}
	
	String getCPF() {
		return CPF;
	}
}

