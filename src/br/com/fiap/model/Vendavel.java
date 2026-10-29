package br.com.fiap.model;

public interface Vendavel {
	
	void vender(int preco);

	int PRECO_MINIMA = 100;
	int PRECO_MAXIMA = Integer.MAX_VALUE;
}

