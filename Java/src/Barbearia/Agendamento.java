package Barbearia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agendamento {

    Scanner entrada = new Scanner(System.in);
    Barbeiro barbeiros;
    Cliente clientes;
    Servicos servico;
    Agendamento agendamento;

    List<Servicos> barbeariaServicos = new ArrayList<>();
    List<Barbeiro> listaBarbeiros = new ArrayList<>();
    List<Agendamento> listaAgendamentos = new ArrayList<>();
    List<Cliente> clientesCadastrados = new ArrayList<>();

    private String barbeiro;
    private String horario;
    private String servicos;
    private String cliente;
    int i = 0;

    Agendamento(String barbeiro, String horario, String servicos, String cliente) {
        this.barbeiro = barbeiro;
        this.horario = horario;
        this.servicos = servicos;
        this.cliente = cliente;

    }

    void inicializarComponentes() {
        barbeariaServicos.add(new Servicos("Corte Masculino", 20));
        barbeariaServicos.add(new Servicos("Barba", 10));
        barbeariaServicos.add(new Servicos("Sobrancelha", 5));
        barbeariaServicos.add(new Servicos("Corte Feminino", 30));

        listaBarbeiros.add(new Barbeiro("Caio", "Corte Masculino, Barba", "16:30"));
        listaBarbeiros.add(new Barbeiro("Pedro", "Barba, Sobrancelha e Corte Masculino", "12:30"));
        listaBarbeiros.add(new Barbeiro("Laura", "Corte Feminino, Sobrancelha", "11:30"));
        listaBarbeiros.add(new Barbeiro("Carlos", "Sobrancelha, Barba", "17:30"));

        clientesCadastrados.add(new Cliente("Breno","11995756089" , "Breno@gmail.com"));

    }
    

    public void mostrarServicos(){
        int i = 0;
        System.out.println("Serviços que oferecemos e os preços: :\n");
        for (Servicos listaServicos : barbeariaServicos) {
            System.out.println(listaServicos.getServicos() + " R$" + listaServicos.getPrecos());
        }
    }

    public void cadastroCliente(){
        entrada.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeCadastro = entrada.nextLine();

        System.out.println("Digite seu telefone: ");
        String telefoneCadastro = entrada.nextLine();

        System.out.println("Digite seu email: ");
        String emailCadastro = entrada.nextLine();

       clientesCadastrados.add(new Cliente(nomeCadastro, telefoneCadastro, emailCadastro));
    }


    public void loginCliente(){
        System.out.println("Digite seu nome: ");
        String nomeLogin = entrada.nextLine();

        System.out.println("Digite seu telefone: ");
        String telefoneLogin = entrada.nextLine();

        System.out.println("Digite seu email: ");
        String emailLogin = entrada.nextLine();

        boolean contemLogin = false;

        for(Cliente clienteLogin : clientesCadastrados){
            if (clienteLogin.getNome().contains(nomeLogin)&&
                clienteLogin.getTelefone().contains(telefoneLogin)&&
                clienteLogin.getEmail().contains(emailLogin)) {

                contemLogin = true;
                mostrarServicos();
                escolhaServico();

            
            }
        }

            if(contemLogin == false){
                System.out.println("Usuario não encontrado...");
                System.out.println("Deseja realizar um cadastro?\n1 - Sim\n2 - Não\n");
                int escolha = entrada.nextInt();

                while(escolha > 2){
                    System.out.println("Erro. Escolha uma opção válida");
                    System.out.println("Deseja realizar um cadastro?\n1 - Sim\n2 - Não\n");
                    escolha = entrada.nextInt();
                }

                switch(escolha){
                    case 1:
                        cadastroCliente();
                        break;
                    case 2:
                        System.out.println("Encerrando atendimento.");
                        break;
                }
            }
    }

    public void escolhaServico(){
        int escolha = 0;
        System.out.println("O que deseja fazer hoje ?\n");

        for (int i = 1; i <= barbeariaServicos.size(); i++) {
            System.out.println(i + " - " + barbeariaServicos.get(i - 1).getServicos());
        }
        escolha = entrada.nextInt();

        if (escolha <= barbeariaServicos.size()) {
            verificarDisponibilidade(escolha);
        } else {
            System.out.println("Serviço inválido. Por favor, selecione uma opção válida.");
        }
    }

    void verificarDisponibilidade(int escolha) {
        switch (escolha) {
            case 1 : {
                String escolhaString = "Corte Masculino";
                for (Barbeiro barbeiroServicos : listaBarbeiros) {
                    if (barbeiroServicos.getEspecialidade().contains(escolhaString)) {
                        System.out.println(barbeiroServicos.getNome() + " " + barbeiroServicos.getHorarioDeTrabalho());
                    }
                }
                marcarHorario(escolhaString);
                break;
            }

            case 2 : {
                String escolhaString = "Barba";
                for (Barbeiro barbeiroServicos : listaBarbeiros) {
                    if (barbeiroServicos.getEspecialidade().contains(escolhaString)) {
                        System.out.println(barbeiroServicos.getNome() + " " + barbeiroServicos.getHorarioDeTrabalho());
                    }
                }
                marcarHorario(escolhaString);
                break;
            }

            case 3 : {
                String escolhaString = "Sobrancelha";
                for (Barbeiro barbeiroServicos : listaBarbeiros) {
                    if (barbeiroServicos.getEspecialidade().contains(escolhaString)) {
                        System.out.println(barbeiroServicos.getNome() + " " + barbeiroServicos.getHorarioDeTrabalho());
                    }
                }
                marcarHorario(escolhaString);
                break;
            }

            case 4 : {
                String escolhaString = "Corte Feminino";
                for (Barbeiro barbeiroServicos : listaBarbeiros) {
                    if (barbeiroServicos.getEspecialidade().contains(escolhaString)) {
                        System.out.println(barbeiroServicos.getNome() + " " + barbeiroServicos.getHorarioDeTrabalho());
                    }
                }
                marcarHorario(escolhaString);
                break;
            }
        }
    }


    public void marcarHorario(String escolhaString){


        entrada.nextLine();
        System.out.println("Digite o nome do barbeiro: ");
        String nomeBarbeiro = entrada.nextLine();
        System.out.println("Horario disponível: ");
        String horarioBarbeiro = entrada.nextLine();

        boolean barbeiroEncontrado = false;

        for (Barbeiro conferirServicosEhorairo : listaBarbeiros) {
            if (conferirServicosEhorairo.getEspecialidade().contains(escolhaString) && 
                conferirServicosEhorairo.getNome().contains(nomeBarbeiro) && 
                conferirServicosEhorairo.getHorarioDeTrabalho().contains(horarioBarbeiro)){

                barbeiroEncontrado = true;
            } 
        }
        if(barbeiroEncontrado == true){
            barbeiro = nomeBarbeiro;
            horario = horarioBarbeiro;
            servicos = escolhaString;
            cliente = " ";
            System.out.println("Agendando...");
            listaAgendamentos.add(new Agendamento(barbeiro,  horario, servicos, cliente));
            System.out.println("Agendamento feito com sucesso.");

        } else{
            System.out.println("Desculpe não encontramos o nome do barbeiro ou seu horário...");
            System.out.println("Deseja verificar novamente ?\n1 - Sim\n2 - Não");
            int verificarDisponibilidade = entrada.nextInt();

            if(verificarDisponibilidade == 1){

            System.out.println("Escolha o serviço: ");
            mostrarServicos();

            
            int escolha = entrada.nextInt();
            switch (escolha) { 
                case 1: {
                verificarDisponibilidade(escolha);
                break;
                }
                case 2:{                
                verificarDisponibilidade(escolha);
                break;
                }
                case 3: {               
                verificarDisponibilidade(escolha);
                break;
                }
                case 4: {
                verificarDisponibilidade(escolha);
                break;
                }
            }
        }else{
            System.out.println("Finalizando serviços...");
        }

        } 
    }

    public void verificarAgendamentos(){
        for(Agendamento listAgendamento : listaAgendamentos){
            System.out.println(listAgendamento.getBarbeiro() + " " + listAgendamento.getHorario() + " " + listAgendamento.getServicos());
        }
    }

    public String getBarbeiro() {
        return barbeiro;
    }

    public String getHorario() {
        return horario;
    }

    public String getServicos() {
        return servicos;
    }

    public String getCliente() {
        return cliente;
    }

  
}
