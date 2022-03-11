package interface_programs;

interface sample1{
	void test();
}
class Demo1 implements sample1{
	 public void test() {
		 System.out.println("test car");
	 }
}
public class MainClass1 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Demo1 rv1 = new Demo1();
		rv1.test();
		sample1 a1 = new Demo1();
		a1.test();
		System.out.println("main ends");
	}
}
