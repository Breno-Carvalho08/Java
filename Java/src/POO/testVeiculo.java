package POO;

public class testVeiculo {
	public static void main(String[] args) {
		
		Veiculos caminhao = new Veiculos();
		Veiculos carro = new Veiculos("Corsa","Vermelha","Chevrolet","QWT8567");
		Veiculos moto = new Veiculos("150cc", "Preta", "Yamaha","ERK6789");
		
		carro.ligar();
		moto.ligar();
		
		System.out.println(carro.getModelo());
		carro.setModelo("Versa");
		System.out.println(carro.getModelo());
		
		//Não é possível chamar o carro.modelo por que a varivavel da instancia Veiculos está como PRIVATE
		//carro.modelo = "onix";
		//System.out.println(carro.placa);
		//Não é possível chamar o carro.placa por que a varivavel da instancia Veiculos está como PRIVATE
		
//		carro.acelerar();
//		moto.acelerar();
//		carro.acelerar();
//		moto.acelerar();
//		carro.acelerar();
//		moto.acelerar();
//		carro.acelerar();
//		moto.acelerar();
		
	
		
		
	
		
		
	}
}
