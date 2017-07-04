package com.github.otavioaraujo.caixa;

import com.github.otavioaraujo.impressao.Impressora;
import com.github.otavioaraujo.impressao.ImpressoraEpson;
import com.github.otavioaraujo.impressao.ImpressoraXingling;
import com.github.otavioaraujo.pagamento.Cartao;
import com.github.otavioaraujo.pagamento.Cielo;
import com.github.otavioaraujo.pagamento.Operadora;
import com.github.otavioaraujo.pagamento.Redecard;

public class TesteCheckout {
	
	public static void main(String[] args) {
		
//		Operadora operadora1 = new Cielo();
//		
//		Impressora impressora = new ImpressoraEpson();
		
		Operadora operadora = new Redecard();
		
		Impressora impressora = new ImpressoraXingling();

		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João M Couves");
		cartao.setNumeroCartao("456");
		
		Compra compra = new Compra();
		compra.setNomeCliente("João Mendonça Couves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.5);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}
	
}
