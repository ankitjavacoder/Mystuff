package this_keyword;

abstract class Demo{
	abstract public void test();
}
class Sample extends Demo {
	public void test() {
	System.out.println("test is completed");
}
}
public class MainClass1 {

	public static void main(String[] args) {

		System.out.println("main starts");
		Sample s = new Sample();
		s.test();
		System.out.println("main ends");
	}

}

