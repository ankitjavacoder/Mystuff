package linkedlist;

import java.util.LinkedList;

public class Program1 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		/* inserting elements */
		l.add(20);
		l.add(20);
		l.add(null);
		l.add("Jspiders");
		l.add(20.5);
		l.add('c');
		l.add(true);
		System.out.println("My linked list : "+ l );
		// searching
		System.out.println("elements contains : " + l.contains(2));
		// fetching
		;
		System.out.println("for fetching : " + l.get(2));
		//modification 
		l.set(3, "kattapa");
		System.out.println("after mofigfying : "+ l);
		//adding
		System.out.println("for adding : "+ l);
		//remove 
		l.remove(7);
		System.out.println("after deleting : "+ l);
	}
}
