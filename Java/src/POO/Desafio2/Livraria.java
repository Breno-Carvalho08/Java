package POO.Desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livraria {
	Scanner entrada = new Scanner(System.in);
	List<Livro> livrosParaAlugar = new ArrayList<>(); 
	List<Usuario> usuarios = new ArrayList<>(); 
	Usuario usuario;
	Livro livro;
	
	void inicializarComponentes() {
		
		livrosParaAlugar.add(new Livro("Harry Potter", 7));
		livrosParaAlugar.add(new Livro("Senhor dos Anéis", 5));
		livrosParaAlugar.add(new Livro("Crepuscúlo", 4));
		livrosParaAlugar.add(new Livro("Universo em uma casca de noz", 1));
		livrosParaAlugar.add(new Livro("Cronicas Espaciais", 4));
		livrosParaAlugar.add(new Livro("Pai rico e pai pobre", 10));
		
		usuarios.add(new Usuario("Breno Carvalho","123.456.789-0"));
		usuarios.add(new Usuario("Pedro Matos","456.789.012-3"));
	}
	
	void mostrarLivros() {
		for(Livro livro: livrosParaAlugar) {
			System.out.println("Nome: "+livro.getNome() + "\nQuantidade: " + livro.getQuantLivro()); 
		 }
	}
	
	 public void Login() {
	        System.out.println("Informe seu nome: ");
	        String nome = entrada.nextLine();
	        System.out.println("Informe seu CPF: ");
	        String CPF = entrada.nextLine();

	        boolean loginSucesso = false;

	        for (Usuario login : usuarios) {
	            if (login.getNome().equals(nome) && login.getCPF().equals(CPF)) {
	                loginSucesso = true;
	                requisicaoLivros();
	                break;
	            }
	        }

	        if (!loginSucesso) {
	            System.out.println("Usuário ou senha incorretos");
	            System.out.println("Deseja realizar o login novamente? \n1 - Sim\n2 - Não");
	            int escolha = entrada.nextInt();
	            entrada.nextLine(); // Limpar o buffer de nova linha

	            while (escolha != 1 && escolha != 2) {
	                System.out.println("Opção inválida");
	                System.out.println("Deseja realizar o login novamente? \n1 - Sim\n2 - Não");
	                escolha = entrada.nextInt();
	                entrada.nextLine(); // Limpar o buffer de nova linha
	            }

	            switch (escolha) {
	                case 1:
	                    Login();
	                    break;

	                case 2:
	                    System.out.println("Finalizando sua visita...");
	                    break;
	            }
	        }
	    }
		
	void requisicaoLivros() {
	    mostrarLivros();
	    System.out.println("Qual livro deseja alugar? ");
	    String nomeLivro = entrada.next();
	    entrada.nextLine();
	    System.out.println("Quantos livros deseja alugar? ");
	    int quantLivro = entrada.nextInt();

	    boolean livroEncontrado = false;

	    for (Livro livro : livrosParaAlugar) {
	        if (livro.getNome().contains(nomeLivro)) {
	            livroEncontrado = true;
	            if (livro.getQuantLivro() >= quantLivro) {
	                livro.setQuantLivro(livro.getQuantLivro() - quantLivro);
	                System.out.println("Aluguel realizado com sucesso! Você alugou " + quantLivro + " exemplares do livro " + nomeLivro + ".");
	                System.out.println("Obrigado pela preferência!");
	                break;
	            } else {
	            	System.out.println("Quantidade indisponível. Não temos exemplares de" + livro.getNome());
	            }
	            break;
	        }
	    }

	    if (!livroEncontrado) {
	        System.out.println("Livro indisponível ou não temos em estoque...");
	    }

	    System.out.println("Deseja fazer outra requisição?\n1 - Sim\n2 - Não");
	    int escolha = entrada.nextInt();

	    while (escolha != 1 && escolha != 2) {
	        System.out.println("Opção inválida");
	        System.out.println("Deseja fazer outra requisição?\n1 - Sim\n2 - Não");
	        escolha = entrada.nextInt();
	    }

	    switch (escolha) {
	    case 1:
	        requisicaoLivros();
	        break;
	    case 2:
	        System.out.println("Operação finalizada.");
	        break;
	    }
	}
}		


