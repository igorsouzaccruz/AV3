package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Pessoa{
	
	private Boolean vip;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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
				+ sdf.format(getDataNascimento()) + ", vip=" + vip + "]";
	}
}
