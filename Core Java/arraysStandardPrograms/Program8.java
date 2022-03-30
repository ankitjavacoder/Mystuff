package arraysStandardPrograms;

public class Program8 {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		int[] arr = {10,44,65,4,55,55,45,1};
		for (int i : arr) {
				sum+=i;
		}
		avg = sum/arr.length;
		System.out.println("average in given array is : "+avg);
	}
}
