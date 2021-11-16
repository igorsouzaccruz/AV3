package entities;

import java.util.Date;

public class Cliente extends Pessoa{
	
	private Boolean vip;

	public Cliente(String name, String sexo, Date dataNascimento, Boolean vip) {
		super(name, sexo, dataNascimento);
		this.vip = vip;
	}
	
	public Boolean getVip() {
		return vip;
	}

	public void setVip(Boolean vip) {
		this.vip = vip;
	}

	public void maiorIdade() {
		if (super.getDataNascimento() != null) {}
	}

	@Override
	public String toString() {
		return "Cliente [getName()=" + getName() + ", getSexo()=" + getSexo() + ", getDataNascimento()="
				+ getDataNascimento() + ", vip=" + vip + "]";
	}
}
