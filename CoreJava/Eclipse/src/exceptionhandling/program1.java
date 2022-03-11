package exceptionhandling;

public class program1 {

	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			int z = x/y;
			System.out.println("");
		}
		catch (ArithmeticException e) {
			System.out.println("Exception Handled");
		}
	}

}
