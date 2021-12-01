package entities;

import java.util.ArrayList;
import java.util.List;

import services.Pagamento;
import services.Taxa;

public class Pedido {

	private Cliente cliente;
	private List<Produto> produtos = new ArrayList<>();
	
	private Taxa taxa;
	private Pagamento pagamento;
	
	public Pedido(Cliente cliente, List<Produto> produtos, Taxa taxa, Pagamento pagamento) {
		super();
		this.cliente = cliente;
		this.produtos = produtos;
		this.taxa = taxa;
		this.pagamento = pagamento;
	}

	public Pedido() {
		super();
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Taxa getTaxa() {
		return taxa;
	}

	public void setTaxa(Taxa taxa) {
		this.taxa = taxa;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public double processamentoPedido() throws NullPointerException {
		double total = 0.0;
		
		for(Produto pro:produtos) {
			total = total + (pro.pegarPreco() + taxa.aplicaTaxa(pro.pegarPreco()) );
			if(produtos == null) 
			throw new NullPointerException("Produto não cadastrado!");
		}
		total = pagamento.impostoPagamento(total);
		return total;
	}
	

	@Override
	public String toString() {
		return "Pedido:\nCliente = " + cliente.getName() 
		+ ";\n" +	produtos
		+ "\n" + 
		"\nValorTotal: R$" + String.format("%.2f", processamentoPedido()) ;
	}
	
	
	
	
}
