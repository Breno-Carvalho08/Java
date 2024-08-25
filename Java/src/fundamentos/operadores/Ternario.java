package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 4;
		String ResultadoRecuperacao = media >= 5 ? "Recuperação" : "Reprovado"; //Operador Ternário
		String ResultadoFinal = media >= 7 ? "Aprovado"  : ResultadoRecuperacao; //Operador Ternário
		
		System.out.println(ResultadoFinal);
		
		double nota = 8.5;
		boolean bomComportamento = true;
		boolean passouPorNota = nota >= 7;
		boolean Desconto = bomComportamento && passouPorNota;
		
		String resultado = Desconto ? "Sim" : "Não";
		System.out.println("Desconto? " + resultado);
		System.out.printf("Tem desconto? %s", resultado);
	}
}
