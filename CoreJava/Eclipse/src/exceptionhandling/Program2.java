package exceptionhandling;

public class Program2 {

	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			int z = x/y;
			System.out.println(z);
		}
		catch (ArithmeticException e) {
			System.out.println("Exception Handled");
		}
		finally {
			System.out.println("Finally is called");
		}
	}
}
