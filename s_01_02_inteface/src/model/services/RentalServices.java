package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalServices {

	private Double pricePerHour;
	private Double pricePerDay;

	private TaxService taxService;

	public RentalServices(double pricePerHour, double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {

		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.00;

		double basicPayment = (hours <= 12) ? pricePerHour * Math.ceil(hours) : pricePerDay * Math.ceil(hours / 24);

		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
	}

}
