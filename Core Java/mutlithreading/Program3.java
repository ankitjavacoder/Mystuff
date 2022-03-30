package mutlithreading;

public class Program3 extends Thread {

	int count = 0;

	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				count = count + 100;
			}
			this.notify();
		}
	}

}
