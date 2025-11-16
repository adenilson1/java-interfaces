package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program01 {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<String>(); // sem ordem
//		Set<String> set = new TreeSet<String>(); // com ordem
		Set<String> set = new LinkedHashSet<String>(); // mantem a orderm que os elementos sao inseridos
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		//Operações
//		set.remove("Tablet");
//		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		
		
//		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}

	}

}
