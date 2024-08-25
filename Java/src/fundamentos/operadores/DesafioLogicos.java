package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho Terça(V ou F) e Quinta(V ou F)
		//Se um trabalho der certo = comprar TV de 32'
		//Se os dois derem certo = comprar TV de 52'
		//Em ambos os casos a familia toma sorvete
		//Se os dois derem errado = familia fica em casa
		
		boolean TrabalhoTerca = true;
		boolean TrabalhoQuinta = true;
	
		//Primeira Forma
		 if(TrabalhoTerca == true && TrabalhoQuinta == true ) {
			System.out.println("Comprou TV 52' e tomou sorvete no Shopping");
		}
		 else if(TrabalhoTerca == false && TrabalhoQuinta == false) {
			System.out.println("Ficar em casa");
			
		}else if((TrabalhoTerca == false && TrabalhoQuinta == true) || (TrabalhoTerca == true && TrabalhoQuinta == false)) {
			System.out.println("Comprou TV 32' e tomou sorvete no Shopping");
		}
		 
		 //Segunda Forma
		 boolean ComprarSorvete = TrabalhoTerca || TrabalhoQuinta;
		 System.out.println("Comprou Sorvete'? " + ComprarSorvete);
		 System.out.println("Mais saudável'? " + !ComprarSorvete);
		 
		 boolean ComprarTV52 = TrabalhoTerca && TrabalhoQuinta;
		 System.out.println("Comprou TV de 52'? " + ComprarTV52);
		 
		 boolean ComprarTV32 = TrabalhoTerca ^ TrabalhoQuinta; // Ou exclusivo porque se os dois trabalhos derem certo, a TV de 52 será comprada no lugar da de 32'
		 System.out.println("Comprou TV de 32'? " + ComprarTV32); //Como no OU exclusivo V e V = F então o resultado que aparecerá nesse caso será FALSO
		 
		
	
	}
}
