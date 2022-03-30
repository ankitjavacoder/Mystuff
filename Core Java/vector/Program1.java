package vector;

import java.util.Vector;

public class Program1 {
	public static void main(String[] args) {
		Vector v = new Vector();
		/* inserting elements */
		v.add(20);
		v.add(40);
		v.add("pushpa");
		v.add(22.4);
		v.add(true);
		v.add('c');
		v.add(null);
		v.add(20);
		System.out.println("My array list : "+ v );
		// searching
		v.contains("pushpa");
		System.out.println("for searching  : "+v);
		// fetching
		v.get(2);
		System.out.println("for fetching : " + v);
		//modification 
		v.set(3, "kattapa");
		System.out.println("after mofigfying : "+ v);
		//adding
		System.out.println("for adding : "+ v);
		//remove 
		v.remove(7);
		System.out.println("after deleting : "+ v);
	}
}
