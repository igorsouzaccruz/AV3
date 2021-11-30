package services;

public class taxaPadrao implements Taxa {

	@Override
	public double aplicaTaxa(double valorBasico) {
		return valorBasico * 0.2;
	}

}
