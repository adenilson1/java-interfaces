package model.services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double interest(double amount, int months) {
		return amount + amount * 0.01 * months;
	}

	@Override
	public Double paymentFee(double amount) {
		return amount + amount * 0.02;
	}

}
