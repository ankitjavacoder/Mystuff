package holiprograms;

import java.util.ArrayList;
import java.util.Collections;

public class Program1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(5);
		al.add(10);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(8);
		al.add(7);
		al.add(4);
		Collections.sort(al);
		System.out.println(al);
	}
}
