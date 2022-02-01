package Abstract;

abstract class Demo1{
	abstract public void test();
}
abstract class Sample1 extends Demo1 {

}
class Run extends Sample1{
	public void test() {
		System.out.println("walk completed");
	}
}
public class MainClass2 {

	public static void main(String[] args) {

		System.out.println("main starts");
		Run r = new Run();
		r.test();
		System.out.println("main ends");
	}

}
