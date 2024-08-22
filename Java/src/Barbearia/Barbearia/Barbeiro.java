package Barbearia.Barbearia;

public class Barbeiro {
    private String nome;
    private String especialidade;
    private String horarioDeTrabalho;
    
    Barbeiro(String nome,String especialidade ,String horarioDeTrabalho){
        this.nome = nome;
        this.especialidade = especialidade;
        this.horarioDeTrabalho = horarioDeTrabalho; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //Podem se criado uma lógica para verfificar o nome.
        this.nome = nome;
    }

    public String getHorarioDeTrabalho() {
        return horarioDeTrabalho;
    }

    public String getEspecialidade() {
        return especialidade;
    }


}


