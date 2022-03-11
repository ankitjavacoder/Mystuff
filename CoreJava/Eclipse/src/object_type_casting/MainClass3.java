package object_type_casting;

class Sample4 {
	public void test5() {
		System.out.println("test the pen");
	}
}
class Sample5 extends Sample4{
	public void test5() {
		System.out.println("test pencil");
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Sample4 a1 = (Sample4) new Sample5();
		a1.test5();
		Sample5 b1 = (Sample5) a1;
		b1.test5();
		System.out.println("main stops");
	}
}
