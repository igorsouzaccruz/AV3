package entities;

import java.util.ArrayList;
import java.util.List;

import services.Taxa;

public class Pedido {

	private Cliente cliente;
	private List<Produto> produtos = new ArrayList<>();
	
	private Taxa taxa;
	
	public Pedido(Cliente cliente, List<Produto> produtos, Taxa taxa) {
		super();
		this.cliente = cliente;
		this.produtos = produtos;
		this.taxa = taxa;
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

	private double processamentoPedido() {
		double total = 0.0;
		for(Produto pro:produtos) {
			total = total + (pro.pegarPreco() + taxa.aplicaTaxa(pro.pegarPreco())); 
			}
		return total;
	}
	
	
	
}
