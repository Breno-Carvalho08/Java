package POO.MuitosParaMuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	String nome;

	final List <Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	
	void adicionarCurso(Curso curso){
		this.cursos.add(curso);
		curso.alunos.add(this);
		
	}
	
	//O "Curso" no começo da linha indica que o metódo vai retornar um objeto do tipo "Curso"
	//Caso nenhum objeto seja encontrado, ele retornará nulo
	//O parâmetro (String nome) recebe o nome do curso, que se for achado, retrona o nome do aluno referente a ele
	Curso obterCursoPeloNome(String nome) {
		
		//O loop percorre cada curso na coleção "this.curso"
		for(Curso curso: this.cursos) {
			//Para cada curso, o  metodo verifica se o nome do curso(curso.nome) é igual ao nome fornecido (String nome)
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
		
		/*
		 Portanto, a palavra-chave Curso no começo da declaração do método indica que o método "obterCursoPeloNome" retorna um objeto do tipo Curso. 
		 Essa é uma parte crucial da definição do método, 
		 pois especifica o tipo de dado que quem chama o método pode esperar receber como resultado.
		 */
	}
	
	public String toString() {
		return nome;
	}
}
