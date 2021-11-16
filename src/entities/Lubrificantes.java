package entities;

import entities.enums.TipoLubrificantes;
import entities.enums.TipoProdutos;

public abstract class Lubrificantes extends Produto{
	
	private TipoLubrificantes tipoLub;
	private Integer volume;
	
	public Lubrificantes(String nome, Integer quant, TipoProdutos tipo, TipoLubrificantes tipoLub, Integer volume) {
		super(nome, quant, tipo);
		this.tipoLub = tipoLub;
		this.volume = volume;
	}

	public TipoLubrificantes getTipoLub() {
		return tipoLub;
	}

	public void setTipoLub(TipoLubrificantes tipoLub) {
		this.tipoLub = tipoLub;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}
}
