package model.services;

public interface OnlinePaymentService {

	public Double interest(double amount, int months);

	public Double paymentFee(double amount);

}
