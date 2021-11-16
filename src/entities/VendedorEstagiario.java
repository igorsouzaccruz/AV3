package entities;

public class VendedorEstagiario implements Iempregado {

	@Override
	public double pagamento(double amount, int months) {
		return Iempregado.super.pagamento(amount, months);
	}

}
