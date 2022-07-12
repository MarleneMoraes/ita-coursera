package org.ita.orientacaoaobjetoscomjava.semana002.escola;

public class Aluno {
	int[] bimestre = new int [4];
	
	public int media() {
		int total = 0;
	
		for (int i = 0; i < this.bimestre.length; i++) 
			total += this.bimestre[i];
	
		return total / 4;
	}
	
	
	public boolean passouDeAno() {
		if(media() >= 60)
			return true;
		return false;
	}
}
