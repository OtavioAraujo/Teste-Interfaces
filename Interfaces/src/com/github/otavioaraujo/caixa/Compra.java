package com.github.otavioaraujo.caixa;

import com.github.otavioaraujo.pagamento.Autorizavel;
import com.github.otavioaraujo.impressao.Imprimivel;

public class Compra implements Autorizavel, Imprimivel {

	private String nomeCliente;
	private double valorTotal;
	private String produto;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}	

	public String getCabecalhoPagina() {
		return this.getNomeCliente();
	}
	
	public String getCorpoPagina() {
		return this.getProduto() + " = " + this.getValorTotal();
	}

}
