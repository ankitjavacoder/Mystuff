package Specialization;

class Book{
	public void openbook() {
		System.out.println("Book is opened");
	}
	public void turnpage() {
		System.out.println("turn to next page");
	}
	public void read() {
		System.out.println("read book");
	}
	public void write() {
		System.out.println("write book");
	}
	public void closebook() {
		System.out.println("close the book");
	}
}
public class MainClass1 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		b1.openbook();
		b1.read();
		b1.turnpage();
		b1.write();
		b1.closebook();
		b2.openbook();
		b2.read();
		b2.turnpage();
		b2.write();
		b2.closebook();	
		b3.openbook();
		b3.read();
		b3.turnpage();
		b3.write();
		b3.closebook();
	}
}
