package mutlithreading;

public class Program2 implements Runnable{
	public void run() {
		System.out.println("my thread started");
	}

	public static void main(String[] args) {
		Program2 p2 = new Program2();
		Thread t1 = new Thread(p2);
		t1.start();
	}

}
