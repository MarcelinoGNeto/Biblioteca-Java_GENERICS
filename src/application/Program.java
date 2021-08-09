package application;

import entities.Client;

public class Program {
	public static void main(String[] args) {
/*		
		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b)); //false
		
		System.out.println("-----------------------------");
		
		String c = "Maria";
		String d = "Alex";
		System.out.println(c.hashCode()); //74113750
		System.out.println(d.hashCode()); //2043454
*/
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = new String("Test");
		String s2 = new String("Test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);

	}
}