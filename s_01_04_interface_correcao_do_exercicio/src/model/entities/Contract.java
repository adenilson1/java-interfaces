package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer numberInteger;
	private LocalDate date;
	private Double totalValue;

	private List<Installment> list = new ArrayList<Installment>();

	public Contract() {

	}

	public Contract(Integer numberInteger, LocalDate date, Double totalValue) {
		this.numberInteger = numberInteger;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumberInteger() {
		return numberInteger;
	}

	public void setNumberInteger(Integer numberInteger) {
		this.numberInteger = numberInteger;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getList() {
		return list;
	}

}
