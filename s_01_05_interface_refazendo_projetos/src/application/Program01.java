package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model_entities.CarRental;
import model_entities.Vehicle;
import model_service.BrazilTaxService;
import model_service.RentalService;

public class Program01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Entre com os dados aluguel: ");
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(), fmt);

		CarRental carRental = new CarRental(retirada, retorno, new Vehicle(modelo));

		System.out.print("Entre com o preço por hora: ");
		double priceHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double priceDay = sc.nextDouble();

		RentalService rentalService = new RentalService(priceHour, priceDay, new BrazilTaxService());
		rentalService.processInvoice(carRental);

		System.out.println("FATURA:");
		System.out.println(carRental.getInvoice().toString());

		sc.close();

	}

}
