package Polymorphism;

abstract class Shape{
	abstract public void getArea();
}
class Circle extends Shape{
	public final static double PI = 3.14;
	public int r;
	public Circle(int r) {
		this.r = r;
	}
	public void getArea() {
		System.out.println("********Area of circle *********");
		System.out.println(PI*r*r);
		System.out.println("******************");
	}
}
class Rect extends Shape{
	public int l;
	public int b;
	public Rect(int l,int b) {
		this.l = l;
		this.b = b;
	}
	public void getArea() {
		System.out.println("********Area of Rectangle *********");
		System.out.println(l*b);
		System.out.println("******************");
	}
}
class Tri extends Shape{
	public int b;
	public int h;
	public Tri(int b,int h) {
		this.b = b;
		this.h = h;
	}
	public void getArea() {
		System.out.println("********Area of Triangle *********");
		System.out.println(b*h);
		System.out.println("******************");
	}
}
public class MainClass2 {
public static void PrintArea(Shape s) {
	s.getArea();
}
	public static void main(String[] args) {
		System.out.println("main starts");
		PrintArea(new Circle(12));
		PrintArea(new Rect(12,13));
		PrintArea(new Tri(10,5));
		System.out.println("main ends");

	}
}
