package object_type_casting;

abstract class Sample7{
	abstract void test8();
}
class Sample8 extends Sample7{
	public void test8() {
		System.out.println("it's working");
	}
	public void test9() {
		System.out.println("its really working");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Sample7 a1 = new Sample8();
		a1.test8();
		Sample8 a2 = (Sample8) a1;
		a2.test8();
		a2.test9();
		System.out.println("main ends");
	}
}
