package POO.MuitosParaMuitos;

public class CursoTest {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Breno");
		Aluno aluno2 = new Aluno("Carlos");
		Aluno aluno3 = new Aluno("Caio");
		
		Curso curso1 = new Curso("Java completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso 1...");
			System.out.println(aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno2.obterCursoPeloNome("Java Completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
