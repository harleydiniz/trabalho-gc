/*
 * CarrinhoDeCompras.java
 */
package br.com.harleydiniz.rn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author H‡rley Diniz - fharley@gmail.com
 * @since 24/11/2013 11:16
 * @version 1.0
 */
public class CarrinhoDeCompras {

	private List<Item> itens;
	
	/**
	 * Construtor padr‹o.
	 */
	public CarrinhoDeCompras() {
		this.itens = new ArrayList<Item>();
	}
	
	/**
	 * Adiciona item no carrinho.
	 * @param item
	 */
	public void adiciona(Item item) {
		this.itens.add(item);
	}
	
	/**
	 * @return Todos os itens do carrinho.
	 */
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	/**
	 * MŽtodo respons‡vel por encontrar o maior valor de um pedido no carrinho.
	 * @return maior valor.
	 */
	public double maiorValor() {
		if (this.itens.size() == 0) {
			return 0;
		}
		
		double maior = this.itens.get(0).getValorTotal();
		
		for (Item item : itens) {
			if (maior < item.getValorTotal()) {
				maior = item.getValorTotal();
			}
		}
		
		return maior;
	}
	
}
