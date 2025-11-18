package application;

import java.util.Map;
import java.util.TreeMap;

public class Program01 {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<String, String>();

		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");

		System.out.println("ALL COOKIES: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + " : " + cookies.get(key));
		}

		// verificando chave
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Size: " + cookies.size());

		cookies.remove("email");
		System.out.println("REMOVE COOKIES: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + " : " + cookies.get(key));
		}

		cookies.put("phone", "99771133");
		System.out.println("PUT COOKIES: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + " : " + cookies.get(key));
		}

		// verificando valor inexistent
		System.out.println("Email: " + cookies.get("email"));

	}

}
