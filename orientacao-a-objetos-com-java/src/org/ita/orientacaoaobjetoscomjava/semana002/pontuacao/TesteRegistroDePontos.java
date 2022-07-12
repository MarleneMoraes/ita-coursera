package org.ita.orientacaoaobjetoscomjava.semana002.pontuacao;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteRegistroDePontos {

	@Test
	public void pontosCriarTopico() {
		Usuario u = new Usuario();
		u.setNome("Guerra");
		
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		
		rp.criarUmTopico(u);
		
		assertEquals(u.getPontos(), 5);
	}
	
	@Test
	public void pontosCriarTopicoVIP() {
		Usuario u = new Usuario();
		u.setNome("Guerra");
		u.setVip(true);
		
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		
		rp.criarUmTopico(u);
		
		assertEquals(u.getPontos(), 25);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDia() {
		Usuario u = new Usuario();
		u.setNome("Guerra");
		
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.setBonusDoDia(3);
		
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		
		assertEquals(u.getPontos(), 15);
	}
	
	
	@Test
	public void pontosCriarTopicoVIPBonusDoDia() {
		Usuario u = new Usuario();
		u.setNome("Guerra");
		u.setVip(true);
		
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.setBonusDoDia(2);
		
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		
		assertEquals(u.getPontos(), 50);
	}

}
