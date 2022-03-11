package interface_programs;

interface Sample4 {
	void test4();
}
interface Sample5 extends Sample4{
	void test5();
}
interface Sample6 extends Sample5{
	void test6();
}
class Demo3 {
	public void test4() {
		System.out.println("test plane");
	}
	public void test5() {
		System.out.println("test jet");
	}
	public void test6() {
		System.out.println("test rocket");
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		System.out.println("main Starts");
		Demo3 rv1 = new Demo3();
		rv1.test4();
		rv1.test5();
		rv1.test6();
		System.out.println("main ends");
	}
}
