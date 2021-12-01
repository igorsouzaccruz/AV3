	package entities;

import entities.enums.TipoProdutos;
import exception.produtosException;

public abstract class Produto implements Iproduto{
	
	private String nome;
	private Integer quant;
	private TipoProdutos tipo;
	
	public Produto() {
	}

	public Produto(String nome, Integer quant, TipoProdutos tipo) throws produtosException {
		if(quant <= 0) 
			throw new produtosException("Erro: Quantidade m�nima de produtos n�o atingida!!!");
		this.nome = nome;
		this.quant = quant;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuant() {
		return quant;
	}

	public void setQuant(Integer quant) {
		this.quant = quant;
	}

	public TipoProdutos getTipo() {
		return tipo;
	}

	public void setTipo(TipoProdutos tipo) {
		this.tipo = tipo;
	}

	
	@Override
	public String toString() {
		return "Produto: Nome = " + nome + ", Quantidade = " + quant + ", Tipo = " + tipo;
	}
}
