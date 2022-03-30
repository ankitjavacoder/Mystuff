package mutlithreading;

public class Program1 extends Thread {
	public void run() {
		System.out.println("It started");
	}

	public static void main(String[] args) {
		Program1 p1 = new Program1();
		p1.start();
	}

}
