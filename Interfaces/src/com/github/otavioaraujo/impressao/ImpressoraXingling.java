package com.github.otavioaraujo.impressao;

public class ImpressoraXingling implements Impressora {
	
	public void imprimir(Imprimivel imprimivel) {
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("-=-=-=-=-=-=-=-=-=-");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println("===================");
		System.out.println("**Xingling Printer**");
	}
	
}
