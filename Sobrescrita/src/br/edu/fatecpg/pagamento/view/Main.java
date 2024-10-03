package br.edu.fatecpg.pagamento.view;

import br.edu.fatecpg.pagamento.model.PagamentoBoleto;
import br.edu.fatecpg.pagamento.model.PagamentoCartao;

public class Main {

	public static void main(String[] args) {
		PagamentoBoleto boleto = new PagamentoBoleto();
		PagamentoCartao cartao = new PagamentoCartao();
		
		boleto.processarPagamento();
		cartao.processarPagamento();
	}
}
