package Specialization;

public class MainClass2 {

	public static void useLibrary(Book b) {
		b.openbook();
		b.turnpage();
		b.read();
		b.write();
		b.closebook();
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		useLibrary(new Book());
		useLibrary(new Book());
		System.out.println("main ends");
	}
}
