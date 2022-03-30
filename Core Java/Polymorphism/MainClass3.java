package Polymorphism;
class Addition {
	public static void add(int i, int j) {
		System.out.println(i+j);
	}
	public static void add(double i,double j) {
		System.out.println(i+j);
	}
public static void add(int i,double j) {
	System.out.println(i+j);
}
}
public class MainClass3 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Addition.add(10,12);
		Addition.add(10.3,12.2);
		Addition.add(12, 12.30);
		System.out.println("main ends");
	}
}
