package Barbearia.Barbearia;

public class Servicos {
    String servicos;
    double precos;

    Servicos(String servicos, double precos){
        this.servicos = servicos;
        this.precos = precos;
    }

    public String getServicos() {
        return servicos;
    }

    public void setServicos(String servicos) {
        this.servicos = servicos;
    }

    public double getPrecos() {
        return precos;
    }

    public void setPrecos(double precos) {
        this.precos = precos;
    }
    
}
