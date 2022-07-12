package org.ita.orientacaoaobjetoscomjava.semana002.pontuacao;

public class RegistroPontos {
	
	private CalculadoraBonus bonus;
	
	
	public RegistroPontos(CalculadoraBonus cb) {
		bonus = cb;
	}
	
	public void fazerUmComentario(Usuario u) {
		u.setPontos(u.getPontos() + 3 * bonus.bonus(u));
	}

	public void criarUmTopico(Usuario u) {
		u.setPontos(u.getPontos() + 5 * bonus.bonus(u));
	}

	public void darUmLike(Usuario u) {
		u.setPontos(u.getPontos() + 1 * bonus.bonus(u));
	}
}
