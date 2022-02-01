package Abstract;

class Circle {
	
public void  add() {
	System.out.println("Red");
}
}
class Rect {
	
public void  insert() {
	System.out.println("Blue");
}
}
class Tri {
	
public void  set() {
	System.out.println("Black");
}
}
public class MainClass5 {

	public static void main(String[] args) {
		System.out.println("Main Starts!");
		Circle c1 = new Circle();
		Rect r1 = new Rect();
		Tri t1 = new Tri();
		c1.add();
		t1.set();
		r1.insert();
		System.out.println("Main ends!");
	}
}
