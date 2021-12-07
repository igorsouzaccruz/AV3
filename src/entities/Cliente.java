package entities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import exception.IdadeException;

public class Cliente extends Pessoa{
	public Cliente(String name, String sexo, String dataNascimento) throws Exception {
		super(name, sexo, dataNascimento);
		if(checarIdade(dataNascimento, "dd/MM/yyyy") < 18) 
			throw new IdadeException("Erro: Cliente cadastratado é menor de idade!!!");
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
	
	public void agradecerCadastro() {
		System.out.println("Valeu parça");
	}
	public void agradecerCadastro(String name) {
		System.out.println("Valeu parça" + name);
	}
	
	@Override
	public String toString() {
		return "\nCliente: Name = " + getName() + ", Sexo = " + getSexo() + ", Data Nascimento = " + getDataNascimento();
	}
}
