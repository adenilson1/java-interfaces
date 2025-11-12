package application;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		List<Object> myObjects = new ArrayList<Object>();
		myObjects.add("Maria");
		myObjects.add("Alex");
		
		List<? super Number> myNumbers = myObjects;
		myNumbers.add(10);
		myNumbers.add(3.14);
		
		Number x = myNumbers.get(0); // erro de compilação - contraconvariança, get nao permitido.

	}

}
