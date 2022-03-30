package constructor_chaining;

class Demo1{
	public Demo1() {
		this(10,12.3);
		System.out.println("Demo constructor without argument");
	}
	public Demo1(boolean a) {
		System.out.println("In Demo class constructor with boolean argument ");
	}
	public Demo1(int i,double j) {
		this("hello");
		System.out.println("In Demo class construction with int and double argument");
	}
	public Demo1(String Z) {
		this(true);
		System.out.println("In demo class Constructor String argument");
	}
}
public class MainClass1 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Demo1 d1 = new Demo1();
		System.out.println("main ends");
	}
}