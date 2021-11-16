package entities;

import entities.enums.TipoProdutos;

public class Vibradores extends Produto {
	
	private String tamanho;

	public Vibradores(String nome, Integer quant, TipoProdutos tipo, String tamanho) {
		super(nome, quant, tipo);
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Vibradores [getNome()=" + getNome() + ", getQuant()=" + getQuant() + ", getTipo()=" + getTipo()
				+ ", tamanho=" + tamanho + "]";
	}

	@Override
	public double pegarPreco() {
		Double preco;
		if (super.getQuant() < 5)
		preco = super.getQuant() * 50.0;
		else
			preco = super.getQuant() * 48.0;
		return preco;
	}
}
