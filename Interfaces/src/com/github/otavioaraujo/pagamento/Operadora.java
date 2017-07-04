package com.github.otavioaraujo.pagamento;

public interface Operadora {
	
	boolean autorizar(Autorizavel autorizavel, Cartao cartao);
	
}
