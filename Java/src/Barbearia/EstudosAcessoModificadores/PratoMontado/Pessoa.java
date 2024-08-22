package Barbearia.EstudosAcessoModificadores.PratoMontado;

import Barbearia.EstudosAcessoModificadores.Comidas.Arroz;
import Barbearia.EstudosAcessoModificadores.Comidas.Carne;
import Barbearia.EstudosAcessoModificadores.Comidas.Comida;
import Barbearia.EstudosAcessoModificadores.Comidas.Feijao;

public class Pessoa {
    private double pesoPessoa;
    Comida Arroz = new Arroz(0.2);
    Comida Feijão = new Feijao(0.1);
    Comida Carne = new Carne(0.3);

    Pessoa(double peso){
        setPeso(peso);

    }

    public double getPeso(){
        return pesoPessoa;
    }

    public void setPeso(double peso){
        this.pesoPessoa = peso;
    }

    void comer(Comida comida){
        pesoPessoa += comida.getPeso();
        
    }
}
