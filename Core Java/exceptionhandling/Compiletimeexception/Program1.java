package exceptionhandling.Compiletimeexception;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Main Ends");
	}
}
