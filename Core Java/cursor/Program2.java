package cursor;

import java.util.ArrayList;

public class Program2 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(30);
		a1.add(50);
		a1.add(100);
		a1.add(40);
		a1.add(60);
		a1.add(90);
		System.out.println("My Array list : " + a1);
		Object[] x = a1.toArray();
		System.out.println("My array objects : ");
		for (Object i : x) {
			System.out.println(i);
		}
	}
}