package constructor_chaining;

class A{
	public A(int i) {
		System.out.println("Superclass constructor with int args");
	}
}
class B extends A{
	public B() {
		super(100);
		System.out.println("Subclass constructor without argument");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		System.out.println("main starts");
		B b1 = new B();
		System.out.println("main ends");
	}
}
