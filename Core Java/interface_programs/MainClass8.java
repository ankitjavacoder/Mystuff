package interface_programs;

interface Sample16{
	void test16();
}
class Run1 {
	public void test17() {
		System.out.println("walk a mile");
	}
}
class Demo10 extends Run1 implements Sample16{
	public void test16() {
		System.out.println("test book");
	}
}
public class MainClass8 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Demo10 rv = new Demo10();
		rv.test16();
		rv.test17();
		System.out.println("main ends");
	}
}
