package generics;

import java.util.ArrayList;

public class TypeSafe {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(30);
		a1.add(50);
		a1.add(70);
		//a1.add("String"); it will error
		System.out.println(a1);
	}
}
