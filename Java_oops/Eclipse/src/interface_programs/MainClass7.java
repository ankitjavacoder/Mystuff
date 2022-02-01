package interface_programs;

interface Sample14{
	void test14();
}
abstract class Sample15{
	abstract public void test15(); 
}
class Demo9 extends Sample15 implements Sample14{
	public void test14() {
		System.out.println("testing code");
	}
	public void test15() {
		System.out.println("code executed");
	}	
}
public class MainClass7 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Demo9 rv1 = new Demo9();
		rv1.test14();
		rv1.test15();
		System.out.println("main ends");
	}
}
