package Caminhoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCaminhao {
        public static void main(String[] args) {
            
		Scanner entrada = new Scanner(System.in);

		Caminhao Cm1 = new Atego("449512744","4x2","R1024");
		Caminhao Cm2 = new Actros("449633884","6x4","R1124");
		Caminhao Cm3 = new Accelo("449512764","6x2","R1124");
		Caminhao Cm4 = new Arocs("449631314", "8x4","R0225");
        Caminhao Cm5 = new Axor("4496432456", "8x2", "R0525");
		List<Caminhao> listaCaminhao = new ArrayList<>();
      
		listaCaminhao.add(Cm1);
        System.out.println(Cm1.getVelocidadeMaxima());

		listaCaminhao.add(Cm2);
        System.out.println(Cm2.getVelocidadeMaxima());

		listaCaminhao.add(Cm3);
        System.out.println(Cm3.getVelocidadeMaxima());

		listaCaminhao.add(Cm4);
        System.out.println(Cm4.getVelocidadeMaxima());

        listaCaminhao.add(Cm5);
        System.out.println(Cm5.getVelocidadeMaxima());
       
		System.out.println("Informe o release que deseja: ");
		String release = entrada.nextLine();
		System.out.println();

		for(Caminhao caminhao : listaCaminhao) {
			if(caminhao.getRelease().contains(release)) {
				boolean releaseEncontrado = true;
				if(releaseEncontrado == true) {
					System.out.println(caminhao.Especificacoes() + "\n");
				}
			}
		}  

       
        
    }
}
