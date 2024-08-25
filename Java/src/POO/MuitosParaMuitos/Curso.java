package POO.MuitosParaMuitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	final String nome;
	//Quando colocamos o "final" estamos dizendo que essa lista aponta para um unico endereço de memória
	/*Sendo assim não podemos criar um outro arrayList ou List para alunos, pois assim irá apontar para
	um outro endereço de memória*/
	final List <Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);
		aluno.cursos.add(this);
		
	}
}
