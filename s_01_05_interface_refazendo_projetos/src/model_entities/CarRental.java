package model_entities;

import java.time.LocalDateTime;

public class CarRental {

	private LocalDateTime start;
	private LocalDateTime fish;

	private Vehicle vehicle;
	private Invoice invoice;

	public CarRental() {

	}

	public CarRental(LocalDateTime start, LocalDateTime fish, Vehicle vehicle) {

		this.start = start;
		this.fish = fish;
		this.vehicle = vehicle;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFish() {
		return fish;
	}

	public void setFish(LocalDateTime fish) {
		this.fish = fish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}
