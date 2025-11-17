package application;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Set<Product> set = new TreeSet<Product>();

		set.add(new Product("TV", 900.00));
		set.add(new Product("Notebook", 1200.00));
		set.add(new Product("Tablet", 400.00));

		for (Product p : set) {
			System.out.println(p);
		}

	}

}
