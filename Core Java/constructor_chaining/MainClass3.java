package constructor_chaining;

class M{
	public M() {
		System.out.println("Super class constructor without args");
	}
}
class N extends M{
	public N() {
		System.out.println("subclass constructor with args");
	}
}
public class MainClass3 {
	public static void main(String[] args) {
		System.out.println("main starts");
		N b1 = new N();
		System.out.println("main ends");
	}
}
