package arraysStandardPrograms;

import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) {
		int[] x = {10,31,56,89,12,20,60};
		int[] rev = new int[x.length];
		int j = 0;
		System.out.println("Before reversing : "+ Arrays.toString(x));
		for(int i = x.length-1;i>=0;i--) {
			rev[j] = x[i];
			j++;
		}
		System.out.println("After reversing : "+ Arrays.toString(rev));
	}
}
