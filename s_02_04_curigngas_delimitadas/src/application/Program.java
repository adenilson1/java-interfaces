package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Entities.Rectangle;
import Entities.Shape;
import entities.Circle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Entities.Shape> myShape = new ArrayList<>();

		myShape.add(new Rectangle(3.0, 2.0));
		myShape.add(new Circle(2.0));
		
		List<Circle>  myCircle = new ArrayList<>();
		myCircle.add(new Circle(2.00));
		myCircle.add(new Circle(3.00));

		System.out.println("Total area: " + totalArea(myCircle));

	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
