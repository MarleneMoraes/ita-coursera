/**
 * 
 * @author Marlene
 * Capítulo: Aprofundando nas Classes com Java
 * Hands-on: Refatorando – de Funções para Métodos
 *
 */

package org.ita.orientacaoaobjetoscomjava.semana002.escola;

public class Principal {

	public static void main(String[] args) {
		Aluno guerra = new Aluno();
		
		guerra.bimestre[0] = 70;
		guerra.bimestre[1] = 60;
		guerra.bimestre[2] = 80;
		guerra.bimestre[3] = 70;
		
		//System.out.println(VerificadoraNotas.mediaAluno(guerra));
		//System.out.println(VerificadoraNotas.passouDeAno(guerra));
		
		System.out.println(guerra.media());
		System.out.println(guerra.passouDeAno());
	}

}
