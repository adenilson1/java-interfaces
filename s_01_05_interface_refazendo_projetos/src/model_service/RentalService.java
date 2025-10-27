package model_service;

import java.time.Duration;

import model_entities.CarRental;
import model_entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;

	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {

		double minutes = Duration.between(carRental.getStart(), carRental.getFish()).toMinutes();
		double hours = minutes / 60.00;

		double basicTax = (hours <= 12) ? pricePerHour * Math.ceil(hours) : pricePerDay * Math.ceil(hours / 24);
		double tax = taxService.tax(basicTax);

		carRental.setInvoice(new Invoice(basicTax, tax));

	}

}
