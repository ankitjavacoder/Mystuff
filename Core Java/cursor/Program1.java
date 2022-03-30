package cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class Program1 {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	a1.add(30);
	a1.add(50);
	a1.add("tuesday");
	a1.add('c');
	System.out.println("My Array list : " +a1);
	ListIterator l1 = a1.listIterator();
	System.out.println(l1.hasNext());
	System.out.println(l1.next());
	System.out.println(l1.hasNext());
	System.out.println(l1.next());
	System.out.println(l1.previous());
}
}
