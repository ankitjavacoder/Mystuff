package mutlithreading;

public class Program4 {
	public static void main(String[] args) throws InterruptedException {
		Program3 p1 = new Program3();
		p1.start();
		synchronized (p1) {
		p1.wait();
		System.out.println("total price is : "+ p1.count);
		}
	}

}
