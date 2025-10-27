package entities;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salario;

	public Employee(String name, Double salario) {
		this.name = name;
		this.salario = salario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Employee other) {
//		return name.compareTo(other.getName()); // comparaçao por order de nome
//		return salario.compareTo(other.getSalario()); // comparando por order de salario
		return -salario.compareTo(other.getSalario()); // comparação por order decrescente
	}

}
