package set;

import java.util.LinkedHashSet;

public class Program2 {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(20);
		lhs.add(50);
		lhs.add(20);
		lhs.add(null);
		lhs.add("monday");
		lhs.add('c');
		lhs.add(20.52);
		System.out.println(lhs);
	}
}
