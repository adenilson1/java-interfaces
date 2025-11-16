package application;

import entities.Client;

public class Program03 {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); // comparação de posição de memoria, logo dara falso, pq mesmo sendo iguais, mas posicoes de memoria diferente
		System.out.println(s1 == s2); // nao sao objetos
	}

}
