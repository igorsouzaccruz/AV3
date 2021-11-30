package services;

public class Debito implements Pagamento {

	@Override
	public double impostoPagamento(double pagamento) {
		pagamento =+ pagamento + (pagamento * 0.2);   
		return pagamento;
	}
}
