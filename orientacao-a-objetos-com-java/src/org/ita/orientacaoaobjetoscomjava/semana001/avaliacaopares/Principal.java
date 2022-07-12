package org.ita.orientacaoaobjetoscomjava.semana001.avaliacaopares;

public class Principal {

	public static void main(String[] args) {
		Paciente[] paciente = {new Paciente(85.00, 1.75), new Paciente(62.87, 1.67), new Paciente(40.62, 1.53)};
		
		for(int i = 0; i < paciente.length; i++) {
			System.out.println("Paciente " + (i+1));
			System.out.printf("IMC: %.2f\n", paciente[i].calcularIMC());
			System.out.println("Diagnóstico: " + paciente[i].diagnostico() + "\n");
		}
	}

}
