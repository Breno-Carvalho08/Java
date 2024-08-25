package fundamentos;

import java.util.Scanner;

public class Esclarecimento_nextInt_e_nextDouble {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	 
    System.out.println("Qual a sua idade?");
    int idade = teclado.nextInt();
    teclado.nextLine(); // lê o \n que é deixado para trás no nextInt()
    System.out.println("Qual o seu nome?");
    String nome = teclado.nextLine();
    System.out.println("Qual o seu sobrenome?");
    String sobrenome = teclado.nextLine();
 
    System.out.println(idade + nome + sobrenome);
    teclado.close();
}
}
