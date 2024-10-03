package br.edu.fatecpg.sobrescrita.view;
import br.edu.fatecpg.sobrescrita.model.Bicicleta;
import br.edu.fatecpg.sobrescrita.model.Carro;
public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("Renault", "Sandero");
		Bicicleta bicicleta = new Bicicleta("Caloi", "Rosa");
	carro.mover();
	bicicleta.mover();
	}

}
