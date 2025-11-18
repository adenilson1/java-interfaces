package entities;

import java.util.Objects;

public class Product {

	private String name;
	private Double prince;

	public Product(String name, Double prince) {
		this.name = name;
		this.prince = prince;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrince() {
		return prince;
	}

	public void setPrince(Double prince) {
		this.prince = prince;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, prince);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(prince, other.prince);
	}

}
