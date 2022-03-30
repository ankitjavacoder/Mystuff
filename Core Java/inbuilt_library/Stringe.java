package inbuilt_library;

import java.util.Arrays;
import java.util.Scanner;

public class Stringe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value : ");
		String input = sc.next();
		char[] split = (input.toCharArray());
		char[] mod = split;
		System.out.println(Arrays.toString(split));
		for (int i = 0; i < split.length; i++) {
			boolean check = Character.isUpperCase(split[i]);
			char ch = split[i];
			if (check) {
				mod[i] = Character.toUpperCase(ch);
			}
			else mod[i] = Character.toLowerCase(ch);
		}
		System.out.println(Arrays.toString(mod));
	}

}
