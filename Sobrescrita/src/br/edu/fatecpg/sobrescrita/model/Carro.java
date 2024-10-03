package br.edu.fatecpg.sobrescrita.model;

public class Carro extends Veiculo{
	private String modelo;
	public Carro(String mrc, String mdl) {
		super(mrc);
		this.modelo = mdl;
	}
	
	@Override
	public void mover() {
	System.out.println("O carro esta dirigindo");
	}

}
