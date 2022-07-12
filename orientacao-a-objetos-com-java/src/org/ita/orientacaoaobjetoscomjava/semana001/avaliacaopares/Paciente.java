package org.ita.orientacaoaobjetoscomjava.semana001.avaliacaopares;

public class Paciente {
	private double peso;
	private double altura;

	Paciente(double peso, double altura){
		this.setPeso(peso);
		this.setAltura(altura);
	}
	
	public double getPeso() { 
		return peso; 
	}

	public void setPeso(double peso) { 
		this.peso = peso; 
	}
	
	public double getAltura() { 
		return altura; 
	}

	public void setAltura(double altura) { 
		this.altura = altura; 
	}
	
	public double calcularIMC() { 
		return getPeso() / Math.pow(getAltura(), 2); 
	}
	
	public String diagnostico() {
		double imc = calcularIMC();
		String resposta;
		
		if (imc < 16) 
			resposta = "Baixo peso muito grave";
		else if (imc >= 16 && imc <= 16.99)
			resposta = "Baixo peso grave";
		else if (imc >= 17 && imc <= 18.49)
			resposta = "Baixo peso";
		else if (imc >= 18.5 && imc <= 24.99) 
			resposta = "Peso normal";
		else if (imc >= 25 && imc <= 29.99) 
			resposta = "Sobrepeso";
		else if (imc >= 30 && imc <= 34.99) 
			resposta = "Obesidade grau I";
		else if (imc >= 35 && imc <= 39.99) 
			resposta = "Obesidade grau II";
		else 
			resposta = "Obesidade grau III (obesidade mórbida) ";
		
		return resposta;
	}


	

}

