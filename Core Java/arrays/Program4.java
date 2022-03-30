package arrays;


public class Program4 {

	public static void main(String[] args) {
		int[] x = new int[5];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		x[4] = 50;
		System.out.println("The elements are ");
		for(int i : x) {
			System.out.println(i);
		}
		System.out.println("2nd element : "+ x[1]);

	}
}
