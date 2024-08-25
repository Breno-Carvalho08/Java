package classesExercicios.Desafio;

public class Pessoa {
	public String nome;
	public double peso;
	
	 Pessoa(String nomePessoa, double pesoPessoa){
		this.nome = nomePessoa;
		this.peso = pesoPessoa;
		
	}
	 
	 String apresentar() {
		 return "Olá sou o " + nome + " e tenho " + peso + " kg.";
	 }
	
	 
	 //O metodo comer fica na classe pessoa pois é uma ação que pertence a pessoa.
	 //Assim quando ela for comer, o peso vai refletir nela e não na comdia.
	 void Comer(Comida comida) {
		 if(comida != null) {
			 this.peso += comida.pesoComida;
		 }
		 
	 }

}
