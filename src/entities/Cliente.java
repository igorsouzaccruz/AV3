package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cliente extends Pessoa{
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Cliente(String name, String sexo, Date dataNascimento) {
		
		super(name, sexo, dataNascimento);
	}
	
	public void checarIdade(Date dataNascimento) throws Exception {
		
		Calendar hoje = Calendar.getInstance();
		Date dateObj = hoje.getTime();
		String dataHoje = sdf.format(dateObj);
		String dataNiver = sdf.format(getDataNascimento().getTime());
		
	}

	@Override
	public String toString() {
		return "Cliente [getName()=" + getName() + ", getSexo()=" + getSexo() + ", getDataNascimento()="
				+ sdf.format(getDataNascimento()) + "]";
	}
}
