package services;

public class Credito implements Pagamento {

	@Override
	public double impostoPagamento(double pagamento) {
		pagamento =+ pagamento + (pagamento * 0.1);   
		return pagamento;
	}
}
