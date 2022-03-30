package arraysStandardPrograms;

public class Program6 {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = {10,44,65,4,55,55,45};
		for (int i : arr) {
				sum+=i;
		}
		System.out.println("sum of elements in given array is : "+sum);
	}

}
