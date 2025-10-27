package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program02 {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		String path = "/home/ad-linux/Área de trabalho/interface_02/in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String employeeCSV = br.readLine();
			while (employeeCSV != null) {

				String[] fields = employeeCSV.split(",");

				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCSV = br.readLine();
			}
			Collections.sort(list); // ordenar coleção
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalario());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
