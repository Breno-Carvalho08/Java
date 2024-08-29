package EstudosAcessoModificadores.Comidas;

public class Comida {

    //Quando os modificadores de acesso estão como protected eles são herdados para as outras classes
    protected double peso;

    public Comida(double peso){
        setPeso(peso);
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double pesoComida){
        this.peso = pesoComida;
    }
    
}
