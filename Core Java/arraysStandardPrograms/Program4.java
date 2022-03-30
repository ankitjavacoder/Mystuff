package arraysStandardPrograms;

import java.util.Arrays;

public class Program4 {
	public static void main(String[] args) {
		int [] x = {10 , 50 , 40 , 30 ,20};
		int highest = x[0];
		int lowest = x[0];
		for(int i :x) {	
			if(i>highest)
			{
				highest = i;
			}
			if(i<lowest)
			{
				lowest = i;
			}
		}
		System.out.println("Given array : "+ Arrays.toString(x));
		System.out.println("highest : " + highest);
		System.out.println("lowest : " + lowest);
	}
}
