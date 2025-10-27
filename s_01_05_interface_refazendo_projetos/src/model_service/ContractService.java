package model_service;

import java.time.LocalDate;

import model_entities.Contract;
import model_entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService() {

	}

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double amount = onlinePaymentService
					.paymentFee(onlinePaymentService.interest(contract.getTotalValue() / months, i));
			contract.addInstallment(new Installment(dueDate, amount));
		}
	}

}
