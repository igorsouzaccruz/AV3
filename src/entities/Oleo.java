package entities;

import entities.enums.TipoLubrificantes;
import entities.enums.TipoProdutos;

public class Oleo extends Lubrificantes{

	private String cheiro;

	public Oleo(String nome, Integer quant, TipoProdutos tipo, TipoLubrificantes tipoLub, Integer volume,
			String cheiro) {
		super(nome, quant, tipo, tipoLub, volume);
		this.cheiro = cheiro;
	}

	@Override
	public String toString() {
		return "Oleo [getTipoLub()=" + getTipoLub() + ", getVolume()=" + getVolume() + ", getNome()=" + getNome()
				+ ", getQuant()=" + getQuant() + ", getTipo()=" + getTipo() + ", cheiro=" + cheiro + "]";
	}

	@Override
	public double pegarPreco() {
		Double preco;
		if (super.getQuant() < 10)
		preco = super.getQuant() * 10.0;
		else
			preco = super.getQuant() * 8.0;
		return preco;
	}
}
