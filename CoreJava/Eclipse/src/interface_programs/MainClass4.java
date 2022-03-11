package interface_programs;

interface Sample7{
	void test7();
}
interface Sample8 extends Sample7{
	void test8();
}
interface Sample9 extends Sample7{
	void test9();
}
class Demo4  implements Sample8{
	public void test8() {
		System.out.println("test pen");
	}
	public void test7() {
		System.out.println("test pencil");
	}
}
class Demo5  implements Sample9{
	public void test9() {
		System.out.println("test marker");
	}
	public void test7() {
		System.out.println("test eraser");
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		System.out.println("main Starts");
		Demo4 rv1 = new Demo4();
		rv1.test7();
		rv1.test8();
		Demo5 rv2 = new Demo5();
		rv2.test7();
		rv2.test9();
		System.out.println("main ends");
	}

}
