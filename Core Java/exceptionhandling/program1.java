package exceptionhandling;

public class program1 {

	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			System.out.println("Hello");
			int z = x/y;
			System.out.println(z);
			System.out.println("try executed");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Handled");
		}
		finally {
			System.out.println("This is finally block");
		}
	}

}
