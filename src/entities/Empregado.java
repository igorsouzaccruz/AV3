package entities;

import java.util.Date;

import entities.enums.TipoVendedor;

public class Empregado extends Pessoa{
	
	private Double salario;
	private TipoVendedor vendedor;
	private Iempregado pagamento;
		
	public Empregado(String name, String sexo, Date dataNascimento, Double salario, TipoVendedor vendedor,
			Iempregado pagamento) {
		super(name, sexo, dataNascimento);
		this.salario = salario;
		this.vendedor = vendedor;
		this.pagamento = pagamento;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public TipoVendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(TipoVendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Iempregado getPagamento() {
		return pagamento;
	}

	public void setPagamento(Iempregado pagamento) {
		this.pagamento = pagamento;
	}


}
