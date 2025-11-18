package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();

		String[] c = { "A", "B", "C" };

		for (int i = 0; i < 3; i++) {

			System.out.print("How many students for course " + c[i] + "? ");
			int quantidade = sc.nextInt();
			int x = 0;
			while (x != quantidade) {
				int codigo = sc.nextInt();
				set.add(codigo);
				x++;
			}

		}
		System.out.println("Total students: " + set.size());

		sc.close();

	}

}
