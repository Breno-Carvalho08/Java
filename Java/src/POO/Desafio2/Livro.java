package POO.Desafio2;

public class Livro {
	
	private String nome;
	private int quantLivro;
	
	Livro(String nome, int quantLivro){
		this.nome = nome;
		this.quantLivro = quantLivro;
	}
	
	String getNome() {
		return nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	int getQuantLivro() {
		return quantLivro;
	}
	
	void setQuantLivro(int quantLivro) {
		this.quantLivro = quantLivro;
	}
}
