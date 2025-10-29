package entities;

public class Product implements Comparable<Product> {

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
	public String toString() {
		return name + ", " + String.format("%.2f", prince);
	}

	@Override
	public int compareTo(Product other) {
		return prince.compareTo(other.getPrince());
	}

}
