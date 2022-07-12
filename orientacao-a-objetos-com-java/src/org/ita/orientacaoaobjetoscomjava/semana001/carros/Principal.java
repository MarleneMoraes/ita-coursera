package org.ita.orientacaoaobjetoscomjava.semana001.carros;

/**
 * 
 * @author Marlene
 * Capítulo: Conhecendo as Classes com Java
 * Hands-on: Classes e objetos
 *
 */

public class Principal {

	public static void main(String[] args) {
		//Instanciar objetos
		Carro c1 = new Carro();
		c1.setPotencia(10);
		c1.setNome("Corcel");
		c1.setVelocidade(0);
		
		//Este objeto não afeta o anterior
		Carro c2 = new Carro();
		c2.setPotencia(15);
		c2.setNome("Carango");
		c2.setVelocidade(0);
		
		Carro c3 = new Carro();
		c3.setPotencia(10);
		c3.setNome("Corcel");
		c3.setVelocidade(0);
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		
		c1.imprimir();
		c2.imprimir();
		
		System.out.println("Imprimindo c3");
		c3.imprimir();

	}

}
