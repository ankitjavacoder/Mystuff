package interface_programs;

interface Sample2{
	void test2();
}
interface Sample3 extends Sample2{
	void test3();
}
class Demo2{
	public void test2() {
		System.out.println("test cycle");
	}
	public void test3() {
		System.out.println("test bike");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		System.out.println("main Starts");
		Demo2 rv1 = new Demo2();
		rv1.test2();
		rv1.test3();
		System.out.println("main ends");

	}
}
