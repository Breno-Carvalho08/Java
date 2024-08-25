package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Login_com_MAP {
	static Map<String,String> usuario = new HashMap<String,String>();
	static Scanner entrada = new Scanner(System.in);
	class Usuario{
		String nome;
		String senha;
		
		Usuario(String nome, String senha){
			this.nome = nome;
			this.senha = senha;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("1 - Cadastro \n2 - Login");
		int escolha = entrada.nextInt();
		
		switch(escolha) {
			case 1:
				System.out.println("Nome: ");
				String nome = entrada.next();
				System.out.println("Senha: ");
				String senha = entrada.next();
				usuario.put(nome,senha);
				break;
			
			case 2:
				System.out.println("Digite seu nome: ");
				nome = entrada.next();
				System.out.println("Digite sua senha: ");
				senha = entrada.next();
				break;
				
				
		}
		
		for(Entry<String, String> registro: usuario.entrySet()) {
			System.out.print(registro.getKey() + " -> ");
			System.out.println(registro.getValue());
			
		}
	}

}
