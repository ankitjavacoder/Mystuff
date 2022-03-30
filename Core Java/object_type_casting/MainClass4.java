package object_type_casting;

interface Sample9{
	void test10();
}
class Sample10 implements Sample9{
	public void test10() {
		System.out.println("it's great !");
	}
}
public class MainClass4 {

	public static void main(String[] args) {
	System.out.println("main starts");
	Sample9 a1 = new Sample10();
	a1.test10();
	System.out.println("main ends");
	}
}
