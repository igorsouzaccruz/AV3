package entities;

public abstract class Pessoa {
	
	private String name;
	private String sexo;
	private String dataNascimento;
	
	public Pessoa() {
	}

	public Pessoa(String name, String sexo, String dataNascimento) {
		super();
		this.name = name;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + "]";
	}
}
