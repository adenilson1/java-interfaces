package model.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	private LocalDate[] dates;
	private double[] amounts;
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		dates = new LocalDate[months+1];
		amounts = new double[months+1];

		for (int i = 1; i < dates.length; i++) {
			dates[i] = contract.getDate().plusMonths(i);
		}

		for (int i = 1; i < dates.length; i++) {
			amounts[i] = onlinePaymentService
					.paymentFee(onlinePaymentService.interest(contract.getTotalValue() / months, i));
		}

		for (int i = 1; i < dates.length; i++) {
			contract.addInstallment(new Installment(dates[i], amounts[i]));
		}

	}

}
