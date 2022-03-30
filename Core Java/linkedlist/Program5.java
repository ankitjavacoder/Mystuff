package linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		LinkedList lll = new LinkedList();
		/* inserting elements */
	Scanner sc = new Scanner(System.in);
	for (int i = 1; i <= 10; i++) {
		System.out.println("Enter the "+i+" value : ");
		ll.add(sc.next());
	}
	System.out.println();
	lll = ll;
	System.out.println(lll);
	}
}
