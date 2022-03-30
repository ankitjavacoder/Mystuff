package collections;

import java.util.ArrayList;

public class Program1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		/* inserting elements */
		al.add(20);
		al.add(40);
		al.add("pushpa");
		al.add(22.4);
		al.add(true);
		al.add('c');
		al.add(null);
		al.add(20);
		System.out.println("My array list : "+ al );
		// searching
		al.contains("pushpa");
		System.out.println("for searching  : "+al);
		// fetching
		al.get(2);
		System.out.println("for fetching : " + al);
		//modification 
		al.set(3, "kattapa");
		System.out.println("after mofigfying : "+ al);
		//adding
		System.out.println("for adding : "+ al);
		//remove 
		al.remove(7);
		System.out.println("after deleting : "+ al);
	}
}
