package model_service;

public class BrazilTaxService implements TaxService {

	@Override
	public Double tax(double amount) {
		double tax = (amount <= 100.00) ? amount * 0.2 : amount * 0.15;
		return tax;
	}

}
