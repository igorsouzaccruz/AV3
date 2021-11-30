package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Pessoa{
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Cliente(String name, String sexo, Date dataNascimento) {
		super(name, sexo, dataNascimento);
	}
	
	public void maiorIdade() {
		if (super.getDataNascimento() != null) {}
	}

	@Override
	public String toString() {
		return "Cliente [getName()=" + getName() + ", getSexo()=" + getSexo() + ", getDataNascimento()="
				+ sdf.format(getDataNascimento()) + "]";
	}
}
