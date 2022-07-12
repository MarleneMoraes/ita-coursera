package org.ita.orientacaoaobjetoscomjava.semana002.avaliacaopares;

public class Pizza {
	private String ingrediente;
	private double preco;
	
	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}

	public double getPreco(String i) {
		if(i <= 2)
			return preco = 15.00;
		else if (i >= 3 && i <= 5)
			return preco = 20.00;
		else 
			return preco = 23.00;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void adicionaIngrediente(String ingrediente){
		
	}
}
