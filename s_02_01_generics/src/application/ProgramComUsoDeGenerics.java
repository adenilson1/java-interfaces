package application;

import java.util.Scanner;

import services.PrintServiceComGenerics;

public class ProgramComUsoDeGenerics {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		PrintServiceComGenerics<Integer> ps = new PrintServiceComGenerics<Integer>();
		PrintServiceComGenerics<String> ps = new PrintServiceComGenerics<String>(); 
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
//			int value = sc.nextInt();
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();

	}

}
