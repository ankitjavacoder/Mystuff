package object_type_casting;

class A {
	public void wings() {
		System.out.println("use it for flying");
	}
}
class B extends A{
	public void Wheels() {
		System.out.println("use it one ground");
	}
}
public class MainClass1 {

	public static void main(String[] args) {
		System.out.println("main starts");
		A a1 = (A) new B();
		a1.wings();
		B b1 = (B)a1;
		b1.Wheels();
		b1.wings();
		System.out.println("main ends");
	}

}
