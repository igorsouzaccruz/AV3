package services;

public class TaxaBlackFriday implements Taxa {

	@Override
	public double aplicaTaxa(double valorBasico) throws ArithmeticException {
		return ((valorBasico * 0.2)/2.0);
	}
}
