package interface_programs;

interface Sample17 {
	void test17();
}
interface Sample18 {
	void test17();
}
class Demo11 implements Sample17, Sample18{
	public void test17() {
		System.out.println("test the bike");
	}
}
public class MainClass9 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Demo11 rv = new Demo11();
		rv.test17();
		System.out.println("main ends");
	}
}
