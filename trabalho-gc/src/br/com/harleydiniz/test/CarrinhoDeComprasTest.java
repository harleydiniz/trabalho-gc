/*
 * CarrinhoDeComprasTest.java
 */
package br.com.harleydiniz.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.harleydiniz.rn.CarrinhoDeCompras;
import br.com.harleydiniz.rn.Item;


/**
 * @author H‡rley Diniz - fharley@gmail.com
 * @since 24/11/2013  11:41
 * @version 1.0
 */
public class CarrinhoDeComprasTest {

	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		assertEquals(0.0,  carrinhoDeCompras.maiorValor(), 0.0001);
	}
	
	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adiciona(new Item("Geladeira", 1, 900.0));
		assertEquals(900.0, carrinhoDeCompras.maiorValor(), 0.0001);
	}
	
	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adiciona(new Item("Geladeira", 1, 900.0));
		carrinhoDeCompras.adiciona(new Item("Fog‹o", 1, 1500.0));
		carrinhoDeCompras.adiciona(new Item("M‡quina de Lavar", 1, 750.0));
		assertEquals(1500.0, carrinhoDeCompras.maiorValor(), 0.0001);
	}
	
}
