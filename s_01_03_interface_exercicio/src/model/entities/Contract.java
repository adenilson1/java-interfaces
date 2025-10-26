package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer number;
	private LocalDate date;
	private Double totalDouble;

	private List<Installment> list = new ArrayList<Installment>();

	public Contract() {

	}

	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalDouble = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalDouble;
	}

	public void setTotalValue(Double totalValue) {
		this.totalDouble = totalValue;
	}

	public List<Installment> getList() {
		return list;
	}

	public void addInstallment(Installment installment) {
		list.add(installment);
	}

	public String toString() {
		double valor = 0;
		for (Installment installment : list) {
			valor = installment.getAmount();
		}
		return String.format("%.2f",valor);
	}
}
