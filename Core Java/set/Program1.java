package set;

import java.util.HashSet;

public class Program1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(20);
		hs.add(50);
		hs.add(20);
		hs.add(null);
		hs.add("monday");
		hs.add('c');
		hs.add(20.52);
		System.out.println(hs);
	}

}
