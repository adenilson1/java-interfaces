package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTexService;
import model.services.RentalServices;

public class Program01aSolucaoDoProbemaParte1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Entre com os dados do aluguel ");
		System.out.print("Modelo do carro: ");
		String carModelo = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

		CarRental cr = new CarRental(start, finish, new Vehicle(carModelo));

		System.out.print("Entre com o preço por hora: ");
		Double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		Double pricePerDay = sc.nextDouble();

		RentalServices rentalServices = new RentalServices(pricePerHour, pricePerDay, new BrazilTexService());
		rentalServices.processInvoice(cr);
		System.out.println("FATURA: ");
		System.out.println("Pagamento basico: " + String.format("%.2f",cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f",cr.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f",cr.getInvoice().getTotalPayment()));

		sc.close();

	}

}
