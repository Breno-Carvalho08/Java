package Barbearia.Barbearia;

public class Barberia {
    public static void main(String[] args) {
        Agendamento agendar = new Agendamento(null, null, null,null);

        agendar.inicializarComponentes();

        System.out.println("Seja bem vindo a nossa Barbearia!");
        agendar.loginCliente();

       agendar.verificarAgendamentos();
        
    }
}
