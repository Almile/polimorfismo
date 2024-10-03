package br.edu.fatecpg.produto.view;

import br.edu.fatecpg.produto.model.Produto;

public class Main {

	public static void main(String[] args) {
		Produto produto1 = new Produto("lapis");
		Produto produto2 = new Produto("Borracha", 2.50);
		Produto produto3 = new Produto("Caneta", 1.25, 30);
		
		System.out.println(produto1.nome);
		System.out.println(produto2.nome +" "+produto2.preco);
		System.out.println(produto3.nome +" "+ produto3.preco +" "+ produto3.estoque);
		
	}

}
