package org.ita.orientacaoaobjetoscomjava.semana002.estaticavsinstancia;

public class Somador {
	String nome;
	int valorInstancia = 0;
	static int valorEstatica = 0;
	
	void somar() {
		valorInstancia++;
		valorEstatica++;
	}
	
	void imprimir() {
		System.out.println("O somador " + nome + 
				": inst�ncia = " + valorInstancia + 
				" e estatica = " + valorEstatica);
	}
}
