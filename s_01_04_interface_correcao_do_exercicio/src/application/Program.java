package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
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
		double totalValue = sc.nextDouble();

		Contract obj = new Contract(numero, date, totalValue);

		System.out.print("Entre com o numero de parcelas: ");
		int parcela = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(obj, parcela);

		System.out.println("Prcelas: ");
		for (Installment installment : obj.getList()) {
			System.out.println(installment.toString());
		}

		sc.close();

	}

}
