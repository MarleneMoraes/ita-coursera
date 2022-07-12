/**
 * 
 * @author Marlene
 * Capítulo: Aprofundando nas Classes com Java
 * Hands-on: Colaborações entre Classes
 *
 */

package org.ita.orientacaoaobjetoscomjava.semana002.pontuacao;

public class CalculadoraBonus {
	private int bonusDoDia = 1;
	
	public int getBonusDoDia() {
		return bonusDoDia;
	}

	public void setBonusDoDia(int bonusDoDia) {
		this.bonusDoDia = bonusDoDia;
	}

	public int bonus(Usuario u) {
		int multiplicador = bonusDoDia;
		
		if(u.isVip())
			multiplicador *= 5;
		
		return multiplicador;
	}
}
