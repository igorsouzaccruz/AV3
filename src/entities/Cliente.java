package entities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import exception.idadeException;

public class Cliente extends Pessoa{
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Cliente(String name, String sexo, String dataNascimento) throws Exception {
		super(name, sexo, dataNascimento);
		if(checarIdade(dataNascimento, "dd/MM/yyyy") < 18) 
			throw new idadeException("Erro: Cliente cadastratado é menor de idade!!!");
	}

	public int checarIdade(String dataNasc, String pattern) throws Exception {
		
		DateFormat sdf = new SimpleDateFormat(pattern);
		Date dataNascInput = null;
		try {
			dataNascInput = sdf.parse(dataNasc);
			} catch (ParseException e) {
				System.out.println("Digitou a data errado");
			}
		
		Calendar dateOfBirth = new GregorianCalendar();
		dateOfBirth.setTime(dataNascInput); 
		
		Calendar today = Calendar.getInstance(); // Cria um objeto calendar com a data atual
				
		int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR); // Obtém a idade baseado no ano
		
		dateOfBirth.add(Calendar.YEAR, age);
		
		if (today.before(dateOfBirth)) {
			age--;
			}
		return age;
		}
	

	@Override
	public String toString() {
		return "Cliente [getName()=" + getName() + ", getSexo()=" + getSexo() + ", getDataNascimento()="
				+ getDataNascimento() + "]";
	}
}
