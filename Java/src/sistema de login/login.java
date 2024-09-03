import java.util.Scanner;

public class login {

	public static void main(String[] args) {
	    
	    Scanner entrada = new Scanner(System.in);
	    
	    //Caracteres especiais e dominios
        String[] caracteres_senha = {"@","$","%","&","*","()","!"};
        String[] dominio = {"gmail", "hotmail", "outlook"};
        
        //Entrar com nome, email, CPF e senha
        System.out.println("Nome:");
        String nome = entrada.nextLine();

        System.out.println("Email: ");
        String email = entrada.nextLine();

        System.out.println("CPF: ");
        String cpf = entrada.nextLine();
    
	System.out.println("Senha: ");
	String senha = entrada.nextLine();
	int tamanho_minimo_senha = 12;
		
	char[] nome_char = nome.toCharArray();
	boolean nome_valido = false;
		
	
	if(nome.matches("[A-ZÁ-Ý][a-zá-ý]+( [A-ZÁ-Ý][a-zá-ý]+)*")){
		nome_valido = true;
	} 
		
		
	//Verifivação nome
	if(nome_valido){
		System.out.println("Nome válido");
	} else{
		System.out.println("Nome inválido");
	}
		

        //Verificação de email 
    	Boolean email_valido = (email.indexOf('@') != -1) ? true : false;
    	Boolean email_valido_2 = (email.contains(".com")) ? true : false;
    	boolean email_valido_3 = false;
    	
    	for(int cont = 0; cont < dominio.length; cont++){
    	   if(email.toLowerCase().contains(dominio[cont])){
    	       email_valido_3 = true;
    	   }
    	}
    	
    	//Validando informações
    	if(email_valido && email_valido_2 && email_valido_3){
    	    System.out.println("Email válido");   
    	} else{
    	    
    	    if(!email_valido && email_valido_2 && email_valido_3){
    	       System.out.println("Falta o @");
    	    } else if(email_valido && !email_valido_2  && email_valido_3){
    	       System.out.println("Falta o '.com' ");
    	    } else if(email_valido && email_valido_2  && !email_valido_3){
    	        System.out.println("Dominio não encontrado");
    	    }else{
    	       System.out.println("Email inválido \nFalta @, '.com' e o dominio ");
    	    }
    	}
    	
    	//Verificação CPF

        char[] cpf_char = cpf.toCharArray();
        boolean cpf_valido = false;

        for(int cont = 0; cont < cpf_char.length; cont++){
            if(cont < 11){
                cpf_valido = true;
            }
        }    
        
        if(cpf_valido){
            System.out.println("CPF válido");
        } else{
            System.out.println("CPF inválido");
        }
        
    	//Verificando senha
    	boolean possui_caracter_especial = false;
    	
    	for(int cont = 0; cont < caracteres_senha.length; cont++){
    	   if(senha.contains(caracteres_senha[cont])){
    	       possui_caracter_especial = true;
    	   }
    	}
    	
        boolean tem_MAIUSCULA = false;
        
        for(char letra_maiuscula : senha.toCharArray()){
            if(Character.isUpperCase(letra_maiuscula)){
                tem_MAIUSCULA = true;
            }
        }
        
        boolean tem_minuscula = false;
        
        for(char letra_maiuscula : senha.toCharArray()){
            if(Character.isLowerCase(letra_maiuscula)){
                tem_minuscula = true;
            }
            
        }
        
        //Validando senha
    	if(senha.length() < tamanho_minimo_senha || !possui_caracter_especial || !tem_minuscula || !tem_MAIUSCULA){
    	    System.out.println("Sua senha está fraca");
    	} else {
    	    System.out.println("Senha forte");
    	}
    }
}



 
