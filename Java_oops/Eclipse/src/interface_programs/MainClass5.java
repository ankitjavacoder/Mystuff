package interface_programs;

interface Sample10 {
	void test10();
}
interface Sample11{
	void test11();	
}
interface Sample12 extends Sample11,Sample10{
	void test12();
}
class Demo6 implements Sample12{
	public void test10() {
		System.out.println("test bulb");
	}
	public void test11() {
		System.out.println("test fan");
	}
	public void test12() {
		System.out.println("test laptop");
	}
}
public class MainClass5 {

	public static void main(String[] args) {
		System.out.println("main Starts");
		Demo6 rv1 = new Demo6();
		rv1.test10();
		rv1.test11();
		rv1.test12();
System.out.println("main ends");
	}
}
