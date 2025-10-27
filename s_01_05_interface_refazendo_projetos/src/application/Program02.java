package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model_entities.Contract;
import model_entities.Installment;
import model_service.ContractService;
import model_service.PaypalService;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();

		System.out.print("Entre com o numero de parcelas: ");
		int parcelas = sc.nextInt();

		Contract contract = new Contract(number, date, contractValue);
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, parcelas);

		System.out.println("Parcelas: ");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment.toString());
		}

		sc.close();

	}

}
