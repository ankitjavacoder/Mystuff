package arraysStandardPrograms;

public class Program5 {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = {10,44,65,4,55,55,45};
		for (int i : arr) {
			if (i%2 == 0) {
				sum+=i;	
			}
		}
		System.out.println("sum of elements in even array is : "+sum);
	}

}
