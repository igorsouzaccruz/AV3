package entities;

import java.security.InvalidParameterException;

public interface Iempregado {
//analisar
	
	default double pagamento(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return 0;
		}
	}