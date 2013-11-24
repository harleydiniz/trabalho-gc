/*
 * Item.java
 */
package br.com.harleydiniz.rn;

/**
 * @author H‡rley Diniz - fharley@gmail.com
 * @since 24/11/2013 11:20
 * @version 1.0
 */
public class Item {

	private String descricao;
	private int quantidade;
	private double valorUnitario;
	
	/**
	 * Construtor usado para iniciar o pedido.
	 * @param descricao
	 * @param quantidade
	 * @param valorUnitario
	 */
	public Item(String descricao, int quantidade, double valorUnitario) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
	
	/**
	 * @return Devolve o valor total de um pedido.
	 */
	public double getValorTotal() {
		return this.valorUnitario * this.quantidade;
	}

	/**
	 * @return descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * @return valorUnitario
	 */
	public double getValorUnitario() {
		return valorUnitario;
	}

	/**
	 * @param valorUnitario
	 */
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
}
