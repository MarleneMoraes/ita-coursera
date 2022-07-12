package org.ita.orientacaoaobjetoscomjava.semana001.comercio;

/**
 * 
 * @author Marlene
 * Capítulo: Conhecendo as Classes com Java
 * Hands-on: Construtores Diferentes para Mesma Classe 
 *
 */

public class Compra {
	private double valorTotal;
	private int numeroParcelas;
	
	//Valor à vista
	public Compra(double valor) {
		valorTotal = valor;
		numeroParcelas = 1;
	}
	
	//Valor à prazo
	public Compra(int qtdParcelas, double valorParcela) {
		valorTotal = valorParcela * qtdParcelas;
		numeroParcelas = qtdParcelas;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public double getValorParcela() {
		return valorTotal/numeroParcelas;
	}
}
