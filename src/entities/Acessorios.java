package entities;

import entities.enums.TipoProdutos;

public class Acessorios extends Produto {
	
	private String material;

	public Acessorios(String nome, Integer quant, TipoProdutos tipo, String material) {
		super(nome, quant, tipo);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Acessorios [getNome()=" + getNome() + ", getQuant()=" + getQuant() + ", getTipo()=" + getTipo()
				+ ", material=" + material + "]";
	}

	@Override
	public double pegarPreco() {
		Double preco;
		if (super.getQuant() < 10)
		preco = super.getQuant() * 15.0;
		else
			preco = super.getQuant() * 12.0;
		return preco;
	}
}
