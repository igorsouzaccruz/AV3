package entities;

import entities.enums.TipoLubrificantes;
import entities.enums.TipoProdutos;

public class Gel extends Lubrificantes{

	private Boolean comestivel;

	public Gel(String nome, Integer quant, TipoProdutos tipo, TipoLubrificantes tipoLub, Integer volume,
			Boolean comestivel) {
		super(nome, quant, tipo, tipoLub, volume);
		this.comestivel = comestivel;
	}

	public Boolean getComestivel() {
		return comestivel;
	}

	public void setComestivel(Boolean comestivel) {
		this.comestivel = comestivel;
	}

	@Override
	public String toString() {
		return "Gel:  Tipo de Lubrificante = " + getTipoLub() + ", Volume = " + getVolume()+ " ml" + ", Nome = " + getNome()
				+ ", Quantidade = " + getQuant() + ", Tipo = " + getTipo() + ", Comestivel = " + comestivel + ", Valor: R$" + pegarPreco() +"\n";
	}

	@Override
	public double pegarPreco() {
		Double preco;
		if (super.getQuant() < 20)
		preco = super.getQuant() * 2.0;
		else
			preco = super.getQuant() * 1.0;
		return preco;
	}
}

	