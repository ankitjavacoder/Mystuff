package Abstract;

abstract class Shape{
	abstract public void fill();
}
class circle extends Shape{
	public void fill() {
		System.out.println("Red Color");
	}
}
class rect extends Shape{
	public void fill() {
		System.out.println("Green Color");
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		System.out.println("main starts");
		circle c1 = new circle();
		rect r1 = new rect();
		c1.fill();
		r1.fill();
		System.out.println("main ends");
	}
}
