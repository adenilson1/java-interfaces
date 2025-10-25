package model.services;

public class BrazilTexService implements TaxService {

	public double tax(double amount) {

		double tax = (amount <= 100.00) ? amount * 0.2 : amount * 0.15;
		return tax;
	}

}
