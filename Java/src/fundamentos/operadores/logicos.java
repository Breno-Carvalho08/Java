package fundamentos.operadores;

public class logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // Resultado dará falso
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);	
		System.out.println(!condicao1);	
		System.out.println(!condicao2);	
		System.out.println(condicao1 && !condicao2); 
		System.out.println(!condicao1 || condicao2);
		
		System.out.println("\nTabela Verdade E (&&)");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		System.out.println("\nTabela Verdade OU(||)");
		//System.out.println(true || true);
		//System.out.println(true || false);
		//System.out.println(false || true);
		//System.out.println(false || false);
		
		System.out.println("\nTabela Verdade OU Exclusivo(^)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela Verdade NOT(!)");
		System.out.println(!true);
		System.out.println(!false);
		
		
		}
}
