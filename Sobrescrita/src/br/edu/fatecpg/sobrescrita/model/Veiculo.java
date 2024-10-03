package br.edu.fatecpg.sobrescrita.model;

public abstract class Veiculo {
		private String marca;
		
		public Veiculo(String mrc) {
			this.marca = mrc;
		}
		
	public void mover() {
		System.out.println("Esta se movendo");
	};
	
}
