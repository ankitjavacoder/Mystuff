package constructor_chaining;

class Demo{
	public Demo() {
		this(10,12.3);
		System.out.println("Demo constructor without argument");
	}
	public Demo(boolean a) {
		System.out.println("In Demo class constructor with boolean argument ");
	}
	public Demo(int i,double j) {
		this("hello");
		System.out.println("In Demo class construction with int and double argument");
	}
	public Demo(String Z) {
		this(true);
		System.out.println("In demo class Constructor String argument");
	}
}
public class MainClass {

	public static void main(String[] args) {
		System.out.println("main starts");
		Demo d1 = new Demo();
		System.out.println("main ends");
	}
}
