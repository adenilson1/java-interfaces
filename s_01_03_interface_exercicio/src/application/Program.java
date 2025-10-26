package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), dtf);
		System.out.print("Valor do contrato: ");
		double contratoValor = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int parcelas = sc.nextInt();

		Contract contract = new Contract(numero, date, contratoValor);

		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, parcelas);

		contract.toString();

		sc.close();

	}

}
