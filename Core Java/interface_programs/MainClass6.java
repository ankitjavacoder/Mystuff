package interface_programs;

interface Sample13{
	void test13();
}
class Demo7 {
	public void test13() {
		System.out.println("test bike");
	}
}
class Demo8 {
	public void test13() {
		System.out.println("test car");
	}
}
public class MainClass6 {
	public static void main(String[] args) {
		System.out.println("main Starts");
		Demo7 rv1 = new Demo7();
		rv1.test13();
		Demo8 rv2 = new Demo8();
		rv2.test13();
		System.out.println("main ends");
	}
}
