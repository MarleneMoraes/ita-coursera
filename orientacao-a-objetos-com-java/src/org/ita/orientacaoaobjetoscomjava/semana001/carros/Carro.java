package org.ita.orientacaoaobjetoscomjava.semana001.carros;

public class Carro {
	private int potencia;
	private int velocidade;
	private String nome;
	
	public int getPotencia() {
		return potencia;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void acelerar() {
		velocidade += potencia; 
	}
	
	public void frear() {
		velocidade = velocidade /2;
	}
	
	public void imprimir() {
		System.out.println("O carro " + getNome() + " está a velocidade de " + getVelocidade() + " km/h");
	}
}
